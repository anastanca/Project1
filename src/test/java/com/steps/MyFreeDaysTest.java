package com.steps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest {
	 @Managed(uniqueSession = true)
	    public WebDriver webdriver;

	    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/vacation")
	    public Pages pages;

	    @Steps
	    public LoginSteps loginSteps;

	    @Steps
	    public MainMenuSteps mainMenuSteps;
	    
	    @Steps
	    public MyFreeDaysSteps myFreeDaysSteps;
	
	@Test
    public void myFreeDaysTest(){
    	mainMenuSteps.is_the_home_page();
    	loginSteps.login("ana.stanca1","test1");
    	mainMenuSteps.clickMyFreeDays();
//    	myFreeDaysSteps.calculate("Free days given this year","Vacation days taken this year");
    	myFreeDaysSteps.verifDifference("Free days given this year","Vacation days taken this year",7);
    
    	
    	
	}
}