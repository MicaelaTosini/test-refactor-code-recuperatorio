package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataUpdate {
    private WebDriver driver;

    //constructor
    public DataUpdate(WebDriver driver) {
        this.driver = driver;
    }

       //Actualizamos los datos
    public void actualizarDatos() {
        /*
           En la vista "YOUR ADDRESSES", se actualizan los datos:
            phone, phone_mobile,address1,company y alias
         */
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("123456789");

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys("987654321");

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("Street 443");

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys("UTN");

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("UTN AUTOMATION");

        driver.findElement(By.cssSelector("#submitAddress > span")).click();
    }

    //Validamos los cambios realizados
    public void validarCambios() {
        /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
        assertEquals("UTN AUTOMATION", driver.findElement(By.cssSelector(".page-subheading")).getText());
    }
}
