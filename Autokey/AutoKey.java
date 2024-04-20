package Autokey;
import java.lang.*;
import java.util.*;

public class AutoKey {

    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args)
    {
        String plainText = ""; //plaintext
        String primer = ""; //primer

        Scanner skaneri = new Scanner(System.in);

        while (true) {
            System.out.println("Jepni tekstin per enkriptim: ");
            plainText = skaneri.nextLine();

            System.out.println("Jepni primer per enkriptim: ");
            primer = skaneri.nextLine();

            // Nese ka vetem numra, kthehet ne shkronje
            if (primer.matches("\\d+")) {
                    int num = Integer.parseInt(primer);
                    primer = "" + alphabet.charAt((num - 1)%26);
                    break;
            }
            // Nese vetem shkronja
            else if (primer.matches("[a-zA-Z]+")) {
                // Shkronjat e vogla kthehen ne uppercase
                if (!primer.equals(primer.toUpperCase())) {
                    primer = primer.toUpperCase();
                }
                break;
            } else {
                System.out.println("Kujdes! Vendosni vetem numra ose vetem shkronja si primer!");
            }
        }

        String cipherText = autoEncryption(plainText, primer);

        System.out.println("Teksti i enkriptuar: " + cipherText);
        System.out.println("Teksti i dekriptuar: " + autoDecryption(cipherText, primer));
    }

    public static String autoEncryption(String plainText, String primer)
    {
        // gjenerimi i celesit nga primer
        String newKey = primer.concat(plainText);
        newKey = newKey.substring(0, newKey.length() - primer.length());
        String cipherText = "";

        // algoritmi per enkriptim
        for (int i = 0; i < plainText.length(); i++) {
            int plainLetter = alphabet.indexOf(plainText.charAt(i)); //shkronja e plaintext
            int keyLetter = alphabet.indexOf(newKey.charAt(i)); //shkronja perkatese e celesit
            int cipherLetter = (plainLetter + keyLetter) % 26; //mbledhen
            cipherText += alphabet.charAt(cipherLetter); //shkronja perkatese e ciphertext
        }
        return cipherText;
    }

    public static String autoDecryption(String cipherText, String primer)
    {
        String currentKey = primer;
        String decryptedText = "";

        for (int i = 0; i < cipherText.length(); i++) {
            int cipherLetter = alphabet.indexOf(cipherText.charAt(i));
            int primerLetter = alphabet.indexOf(currentKey.charAt(i));
            int plainLetter = (cipherLetter - primerLetter) % 26;
            plainLetter  = (plainLetter  < 0) ? plainLetter  + 26 : plainLetter;
            decryptedText += alphabet.charAt(plainLetter );
            currentKey += alphabet.charAt(plainLetter);
        }
        return decryptedText;
    }
}