package com.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.MyRequestsPage;
import com.pages.LoginPage;

public class MyRequestsSteps extends ScenarioSteps {

    MyRequestsPage MyRequestsPage;
    LoginPage loginPage;

    @Step	
    public void selectMyRequests(){
    	MyRequestsPage.selectMyRequests();
    }
   
    @Step     
    public void is_the_home_page() {
        MyRequestsPage.open();
    }
    
    @Step
    public void selectHoliday() {
        MyRequestsPage.selectHoliday();
    }
    
    @Step
    public void selectWithoutPayment() {
        MyRequestsPage.selectWithoutPayment();
    }
    
    @Step
    public void selectSpecialVacation() {
        MyRequestsPage.selectSpecialVacation();
    }
    
    @Step
    public void selectSickLeave() {
        MyRequestsPage.selectSickLeave();
    }
    
    @Step
    public void selectMaternityLeave() {
        MyRequestsPage.selectMaternityLeave();
    }
    
    @Step
    public void selectApplyButton() {
        MyRequestsPage.selectApplyButton();
    } 
   	
    @Step
    public void verifyType(String definition) {
        assertThat(MyRequestsPage.getType(), hasItem(containsString(definition)));
    }
   
}