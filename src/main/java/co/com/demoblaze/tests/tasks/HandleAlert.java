package co.com.demoblaze.tests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class HandleAlert implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ThucydidesWebDriverSupport.getDriver();

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();  // O usar dismiss() según tu necesidad
        } catch (NoAlertPresentException e) {
            // No hay ninguna alerta presente
        }
    }

    public static HandleAlert ifPresent() {
        return new HandleAlert();
    }
}