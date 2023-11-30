package com.haceb.steps;

import com.haceb.pageObject.FormularioPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;

public class FormularioSteps {

    @Page
    FormularioPage formularioPage;

    @Step("Registro de datos")
    public void registrarDatos() {
        formularioPage.inputCorreo.sendKeys(Data.extractTo().get(0).get("Correo"));
        formularioPage.inputNombre.sendKeys(Data.extractTo().get(0).get("Nombre"));
        formularioPage.inputApellido.sendKeys(Data.extractTo().get(0).get("Apellido"));
        formularioPage.inputContraseña.sendKeys(Data.extractTo().get(0).get("Contraseña"));
        formularioPage.inputContraseñaConfirmacion.sendKeys(Data.extractTo().get(0).get("VerificacionContraseña"));
    }

    @Step("Click en Terminos")
    public void clickTerminos() {
        JavascriptExecutor executor = (JavascriptExecutor) formularioPage.getDriver();
        executor.executeScript("arguments[0].click()", formularioPage.labelTerminos);
    }

    @Step("Click en Autorizacion")
    public void clickAutorizacion() {
        JavascriptExecutor executor = (JavascriptExecutor) formularioPage.getDriver();
        executor.executeScript("arguments[0].click()", formularioPage.labelAutorizacion);
    }

    @Step()
    public void registrodeUsuario(){
        formularioPage.inputRegistrarUsuario.click();
    }
}
