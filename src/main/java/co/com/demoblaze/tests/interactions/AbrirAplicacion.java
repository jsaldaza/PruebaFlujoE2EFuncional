package co.com.demoblaze.tests.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class AbrirAplicacion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.demoblaze.com/index.html"));


    }
    public static Performable dedemoblaze(){return instrumented(AbrirAplicacion.class);}
}
