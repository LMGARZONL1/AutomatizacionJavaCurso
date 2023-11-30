package com.alkosto.stepDefinitions;

import com.alkosto.steps.PaginaInicialSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegistroStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Dado("que el usuario ingrese a el navegador a la pagina de alkosto")
    public void queElUsuarioIngreseAElNavegadorALaPaginaDeAlkosto() throws InterruptedException {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.buscarProductoBarra();


    }
    @Cuando("el usuario busque un producto")
    public void elUsuarioBusqueUnProducto() {

    }
    @Cuando("selecciona un producto de forma aleatoria")
    public void seleccionaUnProductoDeFormaAleatoria() {

    }
    @Entonces("el usuario podra ver el producto seleccionado dentro del carrito")
    public void elUsuarioPodraVerElProductoSeleccionadoDentroDelCarrito() {
    }
}
