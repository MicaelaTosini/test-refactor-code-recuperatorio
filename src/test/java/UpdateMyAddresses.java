import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.ViewAccess;
import page.DataUpdate;
import page.Login;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;
    private String baseURL;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
        baseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    }

    @Test
    public void updateMyAddress() {
        driver.get(baseURL);
       //logueo
        Login.login(driver);

        //Acceso a vistas
        ViewAccess vistas = new ViewAccess(driver);
        vistas.accesoVistas();

        //actualizar datos
        DataUpdate datos = new DataUpdate(driver);
        datos.actualizarDatos();

        //Validar datos modificados
        datos.validarCambios();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }
}
