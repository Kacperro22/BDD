Feature: Logowanie do aplikacji

  Jako uzytkownik chce miec funkcjonalnosc logowania
  do aplikacji aby moc korzytsac z zaawnoswanych funkcji systemu.


  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres strony internetowej
    When Uzytkownik wpisuje poprawny login
    And Uzytkownik wpisuje poprawen haslo
    And Uzytkonik klika przycisk login
    Then Uzytkownik zostaje poprawnei zalogowany do aplikacji