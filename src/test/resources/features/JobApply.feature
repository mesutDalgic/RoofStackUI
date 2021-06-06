Feature: RoofStack Is Basvuru Otomasyonu
  @apply
  Scenario: Lead Product Tester Is Basvurusu

    Given Google’da "Roof Stacks Yazılım" seklinde arama yapilir
    When Sonuclar listesinden "https://roofstacks.com" adresine girilir
    Then Kariyer sayfasina gidilir
    And  Ilanlar arasindan Product pozisyonu secilir
    And  Lead Product Tester secilir
    And  "Lead Product Tester" sayfasinda sayfanin gelip gelmedigi, dogrulugu kontrol edilir
    And  SendCV butonuna basarak bir dosya upload edelim
    And  Eposta adresine e-mail adresinizi girelim
    And  Sample bir dosya yukleyelim ve upload butonuna basarak dosyayi paylasalim