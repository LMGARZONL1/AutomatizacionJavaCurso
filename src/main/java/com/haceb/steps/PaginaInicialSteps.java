package com.haceb.steps;

import com.haceb.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.util.Set;


public class PaginaInicialSteps {

    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Abril Navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://www.haceb.com/");
    }

    @Step("Seleccionar icono de mi perfil")
    public void seleccionarIconoPerfil(){
        paginaInicialPage.spanMiperfil.click();
    }

    @Step("Ingresar a registro")
    public void ingresaralRegistro() {
        paginaInicialPage.alnkIngreso.click();
    }

    @Step("Cerrar Ventana Emergente")
    public void cerrarVentanaEmerg() {
        paginaInicialPage.divVentanaEmergente.click();
    }


    @Step("Ingresar a registro")
    public void ingresarRegistroDatos()  {
        paginaInicialPage.buttonIngresoaRegistro.click();
    }

    @Step("Abrir la nueva pantalla")
    public  void nuevaPagina(){
        Set<String> ventana= paginaInicialPage.getDriver().getWindowHandles();
        for(String actual: ventana){
                paginaInicialPage.getDriver().switchTo().window(actual);
        }
        paginaInicialPage.getDriver().manage().window();
    }
}
