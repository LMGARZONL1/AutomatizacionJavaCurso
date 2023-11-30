package com.alkosto.steps;

import com.alkosto.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {

    @Page
    PaginaInicialPage paginaInicialPage;



    @Step("Abril Navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://www.alkosto.com/");
    }

    @Step("Buscar un producto")
    public void buscarProductoBarra() throws InterruptedException {
        paginaInicialPage.inputBarraBusqueda.typeAndEnter("Celular");
        Thread.sleep(15000);
    }

}
