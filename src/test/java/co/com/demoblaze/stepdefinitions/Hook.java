package co.com.demoblaze.stepdefinitions;

import co.com.demoblaze.tests.utils.Utilities;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

public class Hook {
    WebDriver driver=getWebdriverManager().getWebdriver(Utilities.getDriver());
    @Before
    public void setScenario(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
    }
}
