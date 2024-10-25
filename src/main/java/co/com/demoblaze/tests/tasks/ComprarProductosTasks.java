package co.com.demoblaze.tests.tasks;

import co.com.demoblaze.tests.models.ComprarProductos;
import co.com.demoblaze.tests.models.builder.ComprarProductosBuilder;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static co.com.demoblaze.tests.userinterfaces.ComprarProductosUInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ComprarProductosTasks implements Task {

    private ComprarProductos comprarProductos;

    public ComprarProductosTasks(ComprarProductos comprarProductos) {
        this.comprarProductos = comprarProductos;
    }

    @Override
    @Step("{0} maneja la alerta emergente si está presente")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ThucydidesWebDriverSupport.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        actor.attemptsTo(
                WaitUntil.the(CATEGORIA_LAPTOPS, isPresent()),
                Click.on(CATEGORIA_LAPTOPS),
                Click.on(PRODUCTO_SONY_VAIO_I7),
                Click.on(BTN_ADD_CAR)
        );

        // Manejar la alerta si está presente
        handleAlert(wait);

        actor.attemptsTo(
                WaitUntil.the(BTN_HOME, isPresent()),
                Click.on(BTN_HOME),
                Click.on(CATEGORIA_MONITORS),
                Click.on(PRODUCTO_APPLE_MONITOR),
                Click.on(BTN_ADD_CAR)
        );

        // Manejar la alerta si está presente
        handleAlert(wait);

        actor.attemptsTo(
                Click.on(BTN_CART),
                Click.on(PLACE_ORDER),
                Enter.theValue(comprarProductos.getName()).into(TXT_NAME),
                Enter.theValue(comprarProductos.getCountry()).into(TXT_COUNTRY),
                Enter.theValue(comprarProductos.getCity()).into(TXT_CITY),
                Enter.theValue(comprarProductos.getCreditCard()).into(TXT_CREDIT_CARD),
                Enter.theValue(comprarProductos.getMonth()).into(TXT_MONTH),
                Enter.theValue(comprarProductos.getYear()).into(TXT_YEAR),
                Click.on(BTN_PURCHASE)
        );
    }

    private void handleAlert(WebDriverWait wait) {
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept(); // O alert.dismiss() si quieres descartar la alerta
        } catch (Exception e) {
            System.out.println("No hay alerta presente");
        }
    }

    public static Performable endemoblaze(ComprarProductosBuilder datosRegistroBuilder) {
        return instrumented(ComprarProductosTasks.class, datosRegistroBuilder.builder());
    }
}