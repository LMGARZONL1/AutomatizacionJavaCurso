package com.haceb.stepDefinitions;

import com.haceb.steps.FormularioDetalleSteps;
import com.haceb.steps.FormularioSteps;
import com.haceb.steps.PaginaInicialSteps;
import com.haceb.steps.PerfilSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegistroHacebStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    FormularioSteps formularioSteps;

    @Steps
    FormularioDetalleSteps formularioDetalleSteps;

    @Steps
    PerfilSteps perfilSteps;

    @Dado("que el usuario ingrese a el navegador a la pagina de haceb")
    public void queElUsuarioIngreseAElNavegadorALaPaginaDeHaceb(){
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.seleccionarIconoPerfil();
    }

    @Cuando("el usuario se registre en la pagina de haceb")
    public void elUsuarioSeRegistreEnLaPaginaDeHaceb(){
        paginaInicialSteps.ingresaralRegistro();
        paginaInicialSteps.cerrarVentanaEmerg();
        paginaInicialSteps.ingresarRegistroDatos();
        paginaInicialSteps.nuevaPagina();

        formularioSteps.registrarDatos();
        formularioSteps.clickTerminos();
        formularioSteps.clickAutorizacion();
        formularioSteps.registrodeUsuario();

        formularioDetalleSteps.datosAdicionales();
        formularioDetalleSteps.nuevaPaginaDetalles();
        perfilSteps.ingresarPerfil();
    }

    @Entonces("el usuario validara su cuenta")
    public void elUsuarioValidaraSuCuenta(){
        perfilSteps.validarCuenta();
    }
}
