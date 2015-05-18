package com.steps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.CalendarPage;
import com.pages.NewVacationRequestPage;
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
    CalendarPage calendarPage;
    

   
     @Step
    public void start_create_vacation() {
        vacationRequestPage.lookup_terms();
    }

     
     
     @Step
     public void click_start_date() {
         vacationRequestPage.lookup_terms2();
     } 
     
     @Step
     public void selectStartDate(int month, int day, int year) throws ParseException, java.text.ParseException {
      vacationRequestPage.lookup_terms2();
      calendarPage.setDate(month, day, year);
     }
     
     @Step
     public void click_end_date() {
         vacationRequestPage.lookup_terms3();
     } 
     
     @Step
     public void selectEndDate(int month, int day, int year) throws ParseException, java.text.ParseException {
      vacationRequestPage.lookup_terms3();
      calendarPage.setDate(month, day, year);
     }
     
     @Step
     public void vacation_type() {
         vacationRequestPage.choose_vacation_type();
     } 
     
     @Step
     public void vacation_type_holiday() {
         vacationRequestPage.choose_holiday();
     } 
       
     @Step
     public void save_your_vacation() {
         vacationRequestPage.press_button_save();
     } 
     
   
      
     }
     
   
      
    
   


