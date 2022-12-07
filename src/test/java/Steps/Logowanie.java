package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logowanie {
    static WebDriver driver;

    @BeforeAll
    public static void setDriver(){
        driver =  new ChromeDriver(); //konstruktor wywolujacy przegladarke
    }
    @Given("Uzytkownik otwiera przegladarke")
    public void uzytkownik_otwiera_przegladarke() {
        System.out.println("Krok 1 Uzytkownik otwiera przegladarke");
        driver.manage().window().maximize();
    }

    @Given("Uzytkownik wpisuje adres strony internetowej")
    public void uzytkownik_wpisuje_adres_strony_internetowej() {
        System.out.println("Krok 2 Uzytkownik wpisuje adres strony internetowej");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @When("Uzytkownik wpisuje poprawny login")
    public void uzytkownik_wpisuje_poprawny_login() {
        System.out.println("Krok 3 Uzytkownik wpisuje poprawny login");
        //driver.findElement(By.id("username")).sendKeys("tomsmith")
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.clear();
        usernameInput.sendKeys("tomsmith");
    }

    @When("Uzytkownik wpisuje poprawen haslo")
    public void uzytkownik_wpisuje_poprawen_haslo() {
        System.out.println("Krok 4 Uzytkownik wpisuje poprawen haslo");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
    }

    @When("Uzytkonik klika przycisk login")
    public void uzytkonik_klika_przycisk_login() {
        System.out.println("Krok 5 Uzytkonik klika przycisk login");
        WebElement loginButton = driver.findElement(By.tagName("button"));
        String textButton = loginButton.getText();
        System.out.println("PRZYCISK ZAWIERA TEKST: "  + textButton);
        loginButton.click();
        //driver.findElement(By.tagName("button")).click();
    }

    @Then("Uzytkownik zostaje poprawnei zalogowany do aplikacji")
    public void uzytkownik_zostaje_poprawnei_zalogowany_do_aplikacji() {
        System.out.println("Krok 6 Uzytkownik zostaje poprawnei zalogowany do aplikacji");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure",driver.getCurrentUrl());

    }


    @When("Uzytkownik wpisuje niepoprawne haslo")
    public void uzytkownik_wpisuje_niepoprawne_haslo() {
        driver.findElement(By.name("password")).sendKeys("xyz!");
    }

    @Then("Uzytkownik nie zostaje poprawnie zalogowany do aplikacji")
    public void uzytkownik_nie_zostaje_poprawnie_zalogowany_do_aplikacji() {
        Assert.assertEquals("https://the-internet.herokuapp.com/login",driver.getCurrentUrl());

    }

    // and Uzytkownik wpisuje adres strony internetowej https://the-internet.herokuapp.com/login
    @Given("Uzytkownik wpisuje adres strony internetowej {string}")
    public void uzytkownik_wpisuje_adres_strony_internetowej(String adresStrony) {
        // adresStrony https://the-internet.herokuapp.com/login
        driver.navigate().to(adresStrony);

    }
    @When("Uzytkownik wpisuje poprawny login {string}")
    public void uzytkownik_wpisuje_poprawny_login(String userNane) {
        driver.findElement(By.id("username")).sendKeys(userNane);
    }
    @When("Uzytkownik wpisuje poprawen haslo {string}")
    public void uzytkownik_wpisuje_poprawen_haslo(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("^Uzytkownik wpisuje poprawny loginek (.+)$")
    public void uzytkownik_wpisuje_poprawny_login2(String loginek) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(loginek);
    }

    @And("^Uzytkownik wpisuje poprawen haselko (.+)$")
    public void uzytkownik_wpisuje_poprawen_haslo2(String haselko) throws Throwable {
        driver.findElement(By.name("password")).sendKeys(haselko);
    }

        @AfterAll
    public static void tear(){
        driver.close();
    }
}



