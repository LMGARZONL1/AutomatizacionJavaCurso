package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaginaInicialPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//span[@class='icon-user']")
    public WebElementFacade spanMiperfil;

    @FindBy(how = How.XPATH, using = "//a[text()='Registrarte']")
    public WebElementFacade alnkIngreso;

    @FindBy(how = How.XPATH, using = "//div[@class='gigya-screen-dialog-top']")
    public WebElementFacade divVentanaEmergente;

    @FindBy(how = How.XPATH, using = "//button[@id='vtexIdUI-custom-oauth']")
    public WebElementFacade buttonIngresoaRegistro;

}
