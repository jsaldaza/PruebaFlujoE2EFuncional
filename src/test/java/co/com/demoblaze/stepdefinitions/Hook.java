package co.com.demoblaze.stepdefinitions;

import co.com.demoblaze.tests.utils.Utilities;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

public class Hook {

    private WebDriver driver;

    public Hook() {
        // Constructor vacío requerido para instanciación
    }

    @Before
    public void setScenario() {
        driver = getWebdriverManager().getWebdriver(Utilities.getDriver());
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
    }
}