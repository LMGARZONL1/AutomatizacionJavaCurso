package com.haceb.steps;

import com.haceb.utils.Data;
import com.haceb.pageObject.FormularioDetallePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class FormularioDetalleSteps {

    @Page
    FormularioDetallePage formularioDetallePage;

    @Step()
    public void datosAdicionales(){
        formularioDetallePage.inputCedula.sendKeys(Data.extracion().get(0).get("Cedula"));
        formularioDetallePage.optionGenero.click();
        formularioDetallePage.inputFechaNacimiento.sendKeys(Data.extracion().get(0).get("FechaNacimiento"));
        formularioDetallePage.optionCodigoTelefono.click();
        formularioDetallePage.inputNumeroCelular.sendKeys(Data.extracion().get(0).get("NumeroTelefono"));
        formularioDetallePage.optionDepartamento.click();
        formularioDetallePage.optionCiudad.click();
        formularioDetallePage.inputEnviar.click();
    }

    @Step("Abrir la nueva pantalla")
    public  void nuevaPaginaDetalles() {
        for (String windowHandle : formularioDetallePage.getDriver().getWindowHandles()) {
            if(!formularioDetallePage.getDriver().getWindowHandles().equals(windowHandle)) {
                formularioDetallePage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }
}
