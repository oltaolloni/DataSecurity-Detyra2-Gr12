package Autokey;
import java.lang.*;
import java.util.*;

public class AutoKey {

    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args)
    {
        String msg = "";
        String key = "";

        Scanner skaneri = new Scanner(System.in);
        System.out.println("Jepni tekstin per enkriptim: ");
        msg = skaneri.nextLine();

        System.out.println("Jepni celesin per enkriptim: ");
        key = skaneri.nextLine();

        // Java RegEx
        if (key.matches("[-+]?\\d*\\.?\\d+"))
            key = "" + alphabet.charAt(Integer.parseInt(key));
        String cipherText = autoEncryption(msg, key);

        System.out.println("Teksti i enkriptuar: " + cipherText);
        System.out.println("Teksti i dekriptuar: " + autoDecryption(cipherText, key));
    }

    public static String autoEncryption(String msg, String key)
    {
        int len = msg.length();

        // generating the keystream
        String newKey = key.concat(msg);
        newKey = newKey.substring(0, newKey.length() - key.length());
        String encryptMsg = "";

        // applying encryption algorithm
        for (int x = 0; x < len; x++) {
            int first = alphabet.indexOf(msg.charAt(x));
            int second = alphabet.indexOf(newKey.charAt(x));
            int total = (first + second) % 26;
            encryptMsg += alphabet.charAt(total);
        }
        return encryptMsg;
    }

    public static String autoDecryption(String msg, String key)
    {
        String currentKey = key;
        String decryptMsg = "";

        for (int x = 0; x < msg.length(); x++) {
            int get1 = alphabet.indexOf(msg.charAt(x));
            int get2 = alphabet.indexOf(currentKey.charAt(x));
            int total = (get1 - get2) % 26;
            total = (total < 0) ? total + 26 : total;
            decryptMsg += alphabet.charAt(total);
            currentKey += alphabet.charAt(total);
        }
        return decryptMsg;
    }
}