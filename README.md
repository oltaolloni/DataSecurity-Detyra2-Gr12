# Siguria e të Dhënave: Implementimi i Algoritmeve të Enkriptimit
Ky repository përmban implementimet e dy algoritmeve të enkriptimit: Autokey Cipher në Java dhe Redefence Cipher në Python, të realizuara si pjesë e detyrës në lëndën Siguria e të Dhënave.

## Përmbajtja
* Përshkrimi i Algoritmeve
  - Autokey Cipher
  - Redefence Cipher
* Si të Ekzekutohet
  - Autokey Cipher në Java
  - Redefence Cipher në Python
* Shembuj të Rezultateve
  - Shembull për Autokey Cipher
  - Shembull për Redefence Cipher

## Përshkrimi i Algoritmeve
### Autokey Cipher
* Enkriptimi:
  - Zgjidhet një primer (një shkronjë apo tekst i shkurtër) që vihet në fillim të plaintext.
  - Plaintext shkruhet pas primerit për të formuar çelësin e enkriptimit.
  - Kthejmë plaintext dhe çelësin në vlera numerike bazuar në pozicionin e shkronjave në alfabet (A=0, Z=25).
  - Bëjmë mbledhjen e vlerave të plaintext me çelësin, secilën përkatësisht, dhe marrim modulin e 26 për të fituar një varg të ri numrash.
  - Kthejmë secilin numër të vargut të ri në shkronjën korresponduese të alfabetit për të marrë ciphertext.

* Dekriptimi:
  - Vendoset primeri dhe fillon dekodimi i ciphertext duke përdorur vlerat numerike.
  - Zbresim vlerën e primer nga ciphertext dhe nëse rezultati është negativ, shtojmë 26.
  - Çdo vlerë e rezultuar kthehet në shkronjën përkatëse, e cila shtohet në primer për të vazhduar procesin.
  - Ky cikël vazhdon derisa të dekriptohet i gjithë plaintext.
    
### Redefence Cipher
* Enkriptimi:
  - Zgjidhet një fjalë çelës dhe plaintext shkruhet në formë zigzag bazuar në gjatësinë e çelësit.
  - Rreshtat e tekstit zigzag renditen sipas rendit alfabetik të karaktereve të çelësit.
  - Leximi i rreshtave sipas rendit të ri alfabetik prodhon ciphertext.

* Dekriptimi:
  - Hartohet forma e zigzagut të mundshëm bazuar në gjatësinë e ciphertext dhe çelësit.
  - Çelësi sortohet në rend alfabetik dhe plaintext mbushet sipas këtij rendi në rreshtat e zigzagut.
  - Rikthehet çelësi në gjendjen e tij origjinale dhe lexohet zigzagu për të fituar mesazhin e dekriptuar.
    
## Si të Ekzekutohet
### Autokey Cipher në Java
1. Sigurohuni që të keni Java të instaluar në sistemin tuaj.
2. Navigoni në dosjen ku ndodhet skedari AutoKey.java.
3. Kompiloni skedarin duke përdorur komandën:
`javac AutokeyCipher.java`
4. Ekzekutoni programin me komandën:
`java AutokeyCipher`

### Redefence Cipher në Python
1. Sigurohuni që të keni Python të instaluar në sistemin tuaj.
2. Navigoni në dosjen ku ndodhet skedari Redefence.py.
3. Ekzekutoni skedarin duke përdorur Python:
`python Redefence.py`

## Shembuj të Rezultateve
### Shembull për Autokey Cipher

![AUTOKEY](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/07b84147-9e42-4302-a745-761c1654b11f)

### Shembull për Redefence Cipher

![REDEFENCE](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/2d80d0aa-d5c5-4b38-842b-04c7d35dcca7)
