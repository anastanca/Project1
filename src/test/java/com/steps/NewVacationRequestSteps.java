package com.steps;

import com.pages.DictionaryPage;
import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class NewVacationRequestSteps extends ScenarioSteps {

    NewVacationRequestPage vacationRequestPage;

   
     @Step
    public void starts_create_vacation() {
        vacationRequestPage.lookup_terms();
    }

     
     
     @Step
     public void click_start_date() {
         vacationRequestPage.lookup_terms2();
     } 
     
     @Step
     public void click_end_date() {
         vacationRequestPage.lookup_terms3();
     } 
     
     
     @Step
     public void vacation_type() {
         vacationRequestPage.choose_vacation_type();
     } 
       
     @Step
     public void save_your_vacation() {
         vacationRequestPage.press_button_save();
     } 
    }
