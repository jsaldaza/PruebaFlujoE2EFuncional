package co.com.demoblaze.tests.questions;

import co.com.demoblaze.tests.userinterfaces.ComprarProductosUInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.demoblaze.tests.userinterfaces.ComprarProductosUInterface.COMPRA_EXITOSA;

public class ComprarProductosQuestion implements Question<String> {

    public static Question<String> value(){
        return new ComprarProductosQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(COMPRA_EXITOSA).getText();
    }
}
