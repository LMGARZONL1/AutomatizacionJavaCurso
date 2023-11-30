package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormularioPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@data-screenset-element-id='gigya-loginID-51216659851706440' and @data-screenset-roles='instance']")
    public WebElementFacade inputCorreo;

    @FindBy(how = How.XPATH, using = "//input[@name='profile.firstName' and @data-screenset-roles='instance']")
    public WebElementFacade inputNombre;

    @FindBy(how = How.XPATH, using = "//input[@name='profile.lastName' and @data-screenset-roles='instance']")
    public WebElementFacade inputApellido;

    @FindBy(how = How.XPATH, using = "//input[@name='password' and @data-screenset-roles='instance']")
    public WebElementFacade inputContraseña;

    @FindBy(how = How.XPATH, using = "//input[@name='passwordRetype' and @data-screenset-roles='instance']")
    public WebElementFacade inputContraseñaConfirmacion;

   @FindBy(how = How.CSS, using = "label[for='gigya-checkbox-70031539084410860'] span[class='gigya-label-text gigya-checkbox-text']")
    public WebElementFacade labelTerminos;

    @FindBy(how = How.CSS, using = "label[for='gigya-multiChoice-0-98366419479004930']")
    public WebElementFacade labelAutorizacion;

    @FindBy(how = How.XPATH, using = "//input[@value='REGISTRARME']")
    public WebElementFacade inputRegistrarUsuario;
}
