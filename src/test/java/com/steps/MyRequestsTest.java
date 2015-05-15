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
public class MyRequestsTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/")
    public Pages pages;

    @Steps
    public MyRequestsSteps myRequestsSteps;  
    
    @Steps
    public EndUserSteps endUserSteps;  
    
    @Test
    public void myRequestsTest() {
    	endUserSteps.is_the_home_page();
    	endUserSteps.login("ana.stanca1","test1");
    	endUserSteps.selectVacation();
    	myRequestsSteps.selectMyRequests();
		
    }
} 