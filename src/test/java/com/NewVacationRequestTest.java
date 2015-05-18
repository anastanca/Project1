package com;

import mx4j.tools.config.DefaultConfigurationBuilder.Create;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.google.protobuf.TextFormat.ParseException;
import com.requirements.Application;
import com.steps.LoginSteps;
import com.steps.LoginSteps;
import com.steps.NewVacationRequestSteps;

@RunWith(ThucydidesRunner.class)
public class NewVacationRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090")
    public Pages pages;

    @Steps
    public LoginSteps loginSteps;
    
    @Steps
    public NewVacationRequestSteps newVacation;
    
 
    
    


    @Test
    public void create_your_vacation_request() throws ParseException, java.text.ParseException {
        loginSteps.is_the_home_page();
		loginSteps.starts_login();
        loginSteps.login("iulia.chifor1", "evozon10");
        loginSteps.selectVacation();
        newVacation.start_create_vacation();
        newVacation.click_start_date();
        newVacation.selectStartDate(9, 1, 2015 );
        newVacation.click_end_date();
        newVacation.selectEndDate(9, 2, 2015);
        newVacation.vacation_type();
        newVacation.vacation_type_holiday();
        newVacation.save_your_vacation();
        newVacation.message();
        newVacation.should_see_message("Your request failed to complete.");
        
        
    }
    
} 
