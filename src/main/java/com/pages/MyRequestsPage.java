package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class MyRequestsPage extends PageObject {

	@FindBy(css="a[href*='menuItem=my-requests']")
	private WebElementFacade MyRequests;
	 
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade ApplyButton;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade Holiday;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade WithoutPayment;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade SpecialVacation;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade SickLeave;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade MaternityLeave;
	
	public void selectMyRequests(){
		MyRequests.click();	    	
	    }
	
	public void selectApplyButton(){
		ApplyButton.click();	    	
	    }
	
	public void selectHoliday(){
		Holiday.click();	    	
	    }
	
	public void selectWithoutPayment(){
		WithoutPayment.click();	    	
	    }
	
	public void selectSpecialVacation(){
		SpecialVacation.click();	    	
	    }
	
	public void selectSickLeave(){
		SickLeave.click();	    	
	    }
	
	public void selectMaternityLeave(){
		MaternityLeave.click();	    	
	    }
	
		
	  public List<String> getType() {
		  WebElementFacade TypeList = find(By.className("taglib-search-iterator"));		  
	      List<WebElement> results = TypeList.findElements(By.xpath("//*[contains(@id, '_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-my.request.column.header.type')]"));
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
