package com.alkosto.pageObject;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaginaInicialPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@id='js-site-search-input']")
    public WebElementFacade inputBarraBusqueda;

}
