package com.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void enters_user(String word) {
        loginPage.enter_user(word);
    }
    @Step
    public void enters_password(String word) {
        loginPage.enter_password(word);
    }
    @Step
    public void starts_login() {
        loginPage.signIn();
    }
    @Step	
    public void selectVacation(){
    	loginPage.selectVacation();
    }
   
    @Step
    public void is_the_home_page() {
        loginPage.open();
    }
    @Step
    public void login(String user, String password){
    	enters_user(user);
		enters_password(password);
		starts_login();
    }
   
}