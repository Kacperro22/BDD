package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logowanie {

    @Given("Uzytkownik otwiera przegladarke")
    public void uzytkownik_otwiera_przegladarke() {
        System.out.println("Krok 1 Uzytkownik otwiera przegladarke");
        WebDriver driver =  new ChromeDriver(); //konstruktor wywolujacy przegladarke
    }

    @Given("Uzytkownik wpisuje adres strony internetowej")
    public void uzytkownik_wpisuje_adres_strony_internetowej() {
        System.out.println("Krok 2 Uzytkownik wpisuje adres strony internetowej");
    }

    @When("Uzytkownik wpisuje poprawny login")
    public void uzytkownik_wpisuje_poprawny_login() {
        System.out.println("Krok 3 Uzytkownik wpisuje poprawny login");
    }

    @When("Uzytkownik wpisuje poprawen haslo")
    public void uzytkownik_wpisuje_poprawen_haslo() {
        System.out.println("Krok 4 Uzytkownik wpisuje poprawen haslo");
    }

    @When("Uzytkonik klika przycisk login")
    public void uzytkonik_klika_przycisk_login() {
        System.out.println("Krok 5 Uzytkonik klika przycisk login");
    }

    @Then("Uzytkownik zostaje poprawnei zalogowany do aplikacji")
    public void uzytkownik_zostaje_poprawnei_zalogowany_do_aplikacji() {
        System.out.println("Krok 6 Uzytkownik zostaje poprawnei zalogowany do aplikacji");
    }

}
