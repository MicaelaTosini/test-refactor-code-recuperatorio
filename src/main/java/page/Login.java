package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    public static void login(WebDriver driver){
        /*Se inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys("micaela.tosini.89@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Almiron030");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
/*
    public static void logout(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.cssSelector("Sign out")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign in')]")));
    }*/
}
