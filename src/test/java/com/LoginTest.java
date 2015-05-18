package com;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MainMenuSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/")
    public Pages pages;

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public MainMenuSteps mainMenuSteps;
     
    @Test
    public void loginandselectVacationTest() {
    	loginSteps.is_the_home_page();
    	loginSteps.login("ana.stanca1","test1");
    	loginSteps.selectVacation();		
    }
    
    @Test
    public void login_and_select_VacationTest_inv() {
    	loginSteps.is_the_home_page();
    	loginSteps.login("ana.stanca","test1");
    	loginSteps.selectVacation();		
    }
    

} 