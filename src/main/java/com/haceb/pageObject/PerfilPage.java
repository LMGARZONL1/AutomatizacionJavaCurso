package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PerfilPage  extends PageObject {

    @FindBy(how = How.XPATH, using = "//a[@href='#/profile']")
    public WebElementFacade aPerfil;

}
