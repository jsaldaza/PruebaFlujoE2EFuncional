package co.com.demoblaze.tests.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class HandlePopupWithEnter implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ThucydidesWebDriverSupport.getDriver();

        try {
            Alert alert = driver.switchTo().alert();
            Actions actions = new Actions(driver);
            actions.sendKeys(org.openqa.selenium.Keys.ENTER).perform();
        } catch (NoAlertPresentException e) {
            // No hay ninguna alerta presente, continuar con la ejecución normalmente
        }
    }

    public static HandlePopupWithEnter ifPresent() {
        return new HandlePopupWithEnter();
    }
}