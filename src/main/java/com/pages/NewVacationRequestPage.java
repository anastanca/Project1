package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://")
public class NewVacationRequestPage extends PageObject {

 

    @FindBy(css="a[href*='menuItem=new-request']")
    private WebElementFacade lookupButton;

    @FindBy(id="_evovacation_WAR_EvoVacationportlet_startDate")
    private WebElementFacade lookupButton2;
    
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_endDate")
    private WebElementFacade lookupButton3;
    
    
    @FindBy(css=".vacationType")
    private WebElementFacade lookupButton4;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_saveButton")
    private WebElementFacade lookupButton5;
    
    

    public void lookup_terms() {
        lookupButton.click();
    }
    
    public void lookup_terms2() {
        lookupButton2.click();
    }
    
    public void lookup_terms3() {
        lookupButton3.click();
    }
    
    public void choose_vacation_type() {
        lookupButton4.click();
    }
    
    public void press_button_save() {
        lookupButton5.click();
    }
    
    

    public List<String> vacationsType() {
        WebElementFacade vacationList = find(By.tagName("ol"));
        List<WebElement> results = vacationList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}