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
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;


    
    @Test
    public void loginTest() {
        endUser.is_the_home_page();
        endUser.login("ana.stanca1","test1");
		endUser.selectVacation();
		//endUser.getMenu("");
		//stepsvacation.clik_free_days_history();
    }
} 