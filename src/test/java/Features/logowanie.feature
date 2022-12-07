@now
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


  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres strony internetowej "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje poprawny login "tomsmith"
    And Uzytkownik wpisuje poprawen haslo "SuperSecretPassword!"
    And Uzytkonik klika przycisk login
    Then Uzytkownik zostaje poprawnei zalogowany do aplikacji


  Scenario: Niepoprawne logowanie do aplikacji v0
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres strony internetowej "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje poprawny login "tomsmith"
    And Uzytkownik wpisuje poprawen haslo "xyz!"
    And Uzytkonik klika przycisk login
    Then Uzytkownik nie zostaje poprawnie zalogowany do aplikacji

  Scenario: Niepoprawne logowanie do aplikacji v1
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres strony internetowej "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje poprawny login "blabla"
    And Uzytkownik wpisuje poprawen haslo "SuperSecretPassword!"
    And Uzytkonik klika przycisk login
    Then Uzytkownik nie zostaje poprawnie zalogowany do aplikacji


  Scenario: Niepoprawne logowanie do aplikacji v2
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres strony internetowej
    When Uzytkownik wpisuje poprawny login
    And Uzytkownik wpisuje niepoprawne haslo
    And Uzytkonik klika przycisk login
    Then Uzytkownik nie zostaje poprawnie zalogowany do aplikacji


  Scenario Outline: Niepoprawne logowanie v3
    And Uzytkownik wpisuje adres strony internetowej
    When Uzytkownik wpisuje poprawny loginek <loginek>
    And Uzytkownik wpisuje poprawen haselko <haselko>
    And Uzytkonik klika przycisk login
    Then Uzytkownik nie zostaje poprawnie zalogowany do aplikacji

    Examples:
      | loginek  | haselko              |
      | tomsmith | blabla               |
      | blabla   | SuperSecretPassword! |
      | blabla   | blabla               |
