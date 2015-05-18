package com;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginSteps;
import com.steps.MyRequestsSteps;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/")
    public Pages pages;

    @Steps
    public MyRequestsSteps myRequestsSteps;  
    
    @Steps
    public LoginSteps endUserSteps;  
    
    @Test
    @Title("Verify 'Maternity Leave' checkbox.")
    public void myRequestsTest5() {    	
    	endUserSteps.is_the_home_page();
    	endUserSteps.login("ana.stanca1","test1");
    	endUserSteps.selectVacation();
    	myRequestsSteps.selectMyRequests();		
		myRequestsSteps.selectMaternityLeave();
		myRequestsSteps.selectApplyButton();
		myRequestsSteps.verifyType("Maternity Leave");
    }
    
    @Test
    @Title("Verify 'Sick Leave' checkbox.")
    public void myRequestsTest4() {    	
    	endUserSteps.is_the_home_page();
    	endUserSteps.login("ana.stanca1","test1");
    	endUserSteps.selectVacation();
    	myRequestsSteps.selectMyRequests();		
		myRequestsSteps.selectSickLeave();
		myRequestsSteps.selectApplyButton();
		myRequestsSteps.verifyType("Sick Leave");
    }
    
    @Test
    @Title("Verify 'Special Vacation' checkbox.")
    public void myRequestsTest3() {    	
    	endUserSteps.is_the_home_page();
    	endUserSteps.login("ana.stanca1","test1");
    	endUserSteps.selectVacation();
    	myRequestsSteps.selectMyRequests();		
		myRequestsSteps.selectSpecialVacation();
		myRequestsSteps.selectApplyButton();
		myRequestsSteps.verifyType("Special Vacation");
    }
    
    @Test
    @Title("Verify 'Vacation Without Payment' checkbox.")
    public void myRequestsTest2() {    	
    	endUserSteps.is_the_home_page();
    	endUserSteps.login("ana.stanca1","test1");
    	endUserSteps.selectVacation();
    	myRequestsSteps.selectMyRequests();		
		myRequestsSteps.selectWithoutPayment();
		myRequestsSteps.selectApplyButton();
		myRequestsSteps.verifyType("Vacation Without Payment");
    }
    
    @Test
    @Title("Verify 'Holiday' checkbox.")
    public void myRequestsTest() {    	
    	endUserSteps.is_the_home_page();
    	endUserSteps.login("ana.stanca1","test1");
    	endUserSteps.selectVacation();
    	myRequestsSteps.selectMyRequests();
		myRequestsSteps.selectHoliday();
		myRequestsSteps.selectApplyButton();
		myRequestsSteps.verifyType("Holiday");
    }    
   
} 