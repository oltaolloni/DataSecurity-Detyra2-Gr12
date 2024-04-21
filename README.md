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
- Një cipher polialfabetik i zëvendësimit.
- Version më i sigurtë se Vigenere Cipher.
- Çelësi gjenerohet në mënyrë të automatizuar nga plaintext duke shtuar një ose disa shkronja në fillim të tij të cilat quhen "primer".
- Enkriptimi dhe dekriptimi klasik bëhet përmes 'tabula recta' që është një tabelë e krijuar nga shkronjat e alfabetit, të cilat për cdo rresht shkojnë duke u shiftuar për një vend, deri në rreshtin e fundit ku alfabeti arrin në rend të kundërt. Nga këtu mund të enkriptohet dhe dekriptohet teksti, nëse kërkojmë shkronjën e parë të plaintext në shtyllë dhe atë të celësit në kolonë, shkronja ku ato “priten” është shkronja përkatëse e ciphertext.
  
![450px-Vigenère_square_shading svg](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/06d47eae-17fe-440c-87ec-fac1826d4932)

- Enkriptimi dhe dekriptimi bëhen edhe përmes formulave. Ciphertext fitohet duke kthyer plaintext dhe çelësin në vlera numerike bazuar në pozicionin e shkronjave në alfabet (A=0, Z=25). Bëjmë mbledhjen e vlerave të plaintext me çelësin, secilën përkatësisht, dhe i modulojmë me 26 për të fituar një varg të ri numrash. Kthejmë secilin numër të vargut të ri në shkronjën korresponduese të alfabetit për të marrë ciphertext.
- Dekriptimi bëhet në mënyrë të kundërt. Zbresim vlerën e primer nga ciphertext dhe nëse rezultati është negativ, shtojmë 26. Çdo vlerë e rezultuar kthehet në shkronjën përkatëse, e cila shtohet në primer për të vazhduar procesin e zbritjes. Ky cikël vazhdon derisa të dekriptohet i gjithë plaintext.
  
![Screenshot 2024-04-21 002709](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/4652bb2c-56d0-4dd3-9f74-fc3d6b1ef3f9)

### Redefence Cipher
- Një cipher transpozicioni, njihet edhe si civil war field cipher sepse u përdor gjatë luftës civile Amerikane.
- Variacion më i sigurtë i Railfence Cipher.
- Çelësi merret një fjalë (shpesh herë fjalë me 3 shkronja).
- Për enkriptim merret një plaintext dhe një fjalë çelës. Në bazë të gjatësisë së çelësit hartohet një 'tabelë' me aq rreshta. Plaintext shënohet zig zag në të nga lartë-poshtë. Pastaj rreshtat që i emërtojmë sipas karakterëve të çelësit, i rendisim në rend alfabetik. Lexojmë karakteret rresht-për-rresht dhe kështu fitohet ciphertext.

    ![redefence](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/b003a009-b7d9-44f8-89c6-f2fdfa79ea68)
   
- Për dekriptim, në varësi të gjatësisë së ciphertext dhe çelësit ne hartojmë se si do të duket zig-zagu. Sortojmë çelësin në rend alfabetik. Në bazë të rradhës së karakterave të tij mbushim rreshtin e parë pastaj të dytin, e kështu me rradhë. Rikthejmë çelësin në gjendjen e mëparshme dhe pastaj lexojmë zig-zag për të fituar mesazhin e dekriptuar.
    
## Si të Ekzekutohet
### Autokey Cipher në Java
1. Sigurohuni që të keni Java të instaluar në sistemin tuaj.
2. Navigoni në dosjen ku ndodhet skedari AutoKey.java.
3. Kompiloni skedarin duke përdorur komandën:
`javac AutokeyCipher.java`
4. Ekzekutoni programin me komandën:
`java AutokeyCipher`
5. Jepni një tekst që doni të enkriptoni dhe një primer për të ju shfaqur teksti i enkriptuar.

### Redefence Cipher në Python
1. Sigurohuni që të keni Python të instaluar në sistemin tuaj.
2. Navigoni në dosjen ku ndodhet skedari Redefence.py.
3. Ekzekutoni skedarin duke përdorur Python:
`python Redefence.py`
4. Jepni një tekst që doni të enkriptoni dhe një çelës për të ju shfaqur teksti i enkriptuar.

## Shembuj të Rezultateve
### Shembull për Autokey Cipher

![AUTOKEY](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/07b84147-9e42-4302-a745-761c1654b11f)

### Shembull për Redefence Cipher

![REDEFENCE](https://github.com/oltaolloni/DataSecurity_Detyra2/assets/72526779/2d80d0aa-d5c5-4b38-842b-04c7d35dcca7)
