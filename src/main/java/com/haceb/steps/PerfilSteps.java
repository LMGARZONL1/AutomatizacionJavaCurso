package com.haceb.steps;

import com.haceb.pageObject.FormularioPage;
import com.haceb.pageObject.PerfilPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class PerfilSteps {


    @Page
    PerfilPage perfilPage;
    FormularioPage formularioPage;

    @Step()
    public void ingresarPerfil() {
        perfilPage.aPerfil.click();
    }

    @Step()
    public void validarCuenta(){
       String nombreExcel= Data.extractTo().get(0).get("Nombre");
       String nombrePerfil=formularioPage.inputNombre.getValue();


        Assert.assertEquals(nombreExcel,nombrePerfil);

        if(nombreExcel.equals(nombrePerfil)){
            System.out.println("Validación correcta");
        }else{
            System.out.println("Validación erronea");
        }
    }
}
