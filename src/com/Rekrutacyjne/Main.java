package com.Rekrutacyjne;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

class ZadanieRekrutacyjne {
    public void MethodZadanieRekrutacyjne() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Przemeu\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev-1.clicktrans.pl/register-test/courier");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_register_company_name")).sendKeys("Nazwa Firmy");
        driver.findElement(By.id("user_register_email")).sendKeys("Tester@mail.com");
        driver.findElement(By.id("user_register_name")).sendKeys("Imię Nazwisko");
        Select dropdown = new Select(driver.findElement(By.id("user_register_phoneCode")));
        dropdown.selectByVisibleText("(+355) Albania");
        driver.findElement(By.id("user_register_phone")).sendKeys("123456789");
        driver.findElement(By.id("user_register_plainPassword")).sendKeys("123456789");
        driver.findElement(By.id("user_register_settings_agreementRegulations")).click();
        driver.findElement(By.id("user_register_settings_agreementPersonalData")).click();
        driver.findElement(By.id("user_register_submit")).click();

    }
}
public class Main {

    public static void main(String[] args) {

        ZadanieRekrutacyjne zadanie = new ZadanieRekrutacyjne(); zadanie.MethodZadanieRekrutacyjne();
    }
}
