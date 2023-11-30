package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormularioDetallePage  extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@name='data.cedula' and @data-display-name='Cedula']")
    public WebElementFacade inputCedula;

    @FindBy(how = How.XPATH, using = "//option[text()='Femenino']")
    public WebElementFacade optionGenero;

    @FindBy(how = How.XPATH, using = "//input[@name='data.fechaNacimiento' and @data-screenset-roles='instance']")
    public WebElementFacade inputFechaNacimiento;

    @FindBy(how = How.XPATH, using = "//option[text()='Colombia (+57)']")
    public WebElementFacade optionCodigoTelefono;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Numero de contacto']")
    public WebElementFacade inputNumeroCelular;

    @FindBy(how = How.XPATH, using = "//option[text()='Cundinamarca']")
    public WebElementFacade optionDepartamento;

    @FindBy(how = How.XPATH, using = "//option[text()='Bogotá']")
    public WebElementFacade optionCiudad;


    @FindBy(how = How.XPATH, using = "//input[@value='Enviar']")
    public WebElementFacade inputEnviar;

}
