package co.com.demoblaze.stepdefinitions;


import co.com.demoblaze.tests.interactions.AbrirAplicacion;
import co.com.demoblaze.tests.questions.ComprarProductosQuestion;
import co.com.demoblaze.tests.tasks.ComprarProductosTasks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.demoblaze.tests.models.builder.ComprarProductosBuilder.informacionCompraProductos;
import static co.com.demoblaze.tests.userinterfaces.ComprarProductosUInterface.COMPRA_EXITOSA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ComprarProductosStepDefinition {


    @Dado("que {string} se encuentra en la aplicacion")
    public void queSeEncuentraEnLaAplicacion(String actor) {
        theActorCalled(actor).attemptsTo(AbrirAplicacion.dedemoblaze());
    }

    @Cuando("agrega productos al carro de compras y llena cada uno de los campos de la orden de compra")
    public void agregaProductosAlCarroDeComprasYLlenaCadaUnoDeLosCamposDeLaOrdenDeCompra(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                ComprarProductosTasks.endemoblaze(informacionCompraProductos()
                        .withname(data.get(0).get("Name"))
                        .withcountry(data.get(0).get("Country"))
                        .withcity(data.get(0).get("City"))
                        .withcreditCard(data.get(0).get("CreditCard"))
                        .withmonth(data.get(0).get("Month"))
                        .withyear(data.get(0).get("Year")))
        );
    }
    @Entonces("podra completar de manera exitosa la compra de sus productos")
    public void podraCompletarDeManeraExitosaLaCompraDeSusProductos() {
        System.out.println(ComprarProductosQuestion.value().answeredBy(theActorInTheSpotlight()));
        WaitUntil.the(COMPRA_EXITOSA, isPresent());
    }



}
