package com.steps;

import com.pages.MainMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainMenuSteps extends ScenarioSteps {

	MainMenuPage mainMenuPage;

	@Step
	public void clickNewVacation() {
		mainMenuPage.new_vacation_click();
	}
	
	@Step
	public void clickRequestVacation(){
		mainMenuPage.my_request_click();
	}
	
	@Step
	public void clickMyFreeDays(){
		mainMenuPage.free_days_click();
	}
	
	@Step
	public void clickMyFreeDaysHistory(){
		mainMenuPage.free_days_hiostory_click();
	}
	
	@Step
    public void is_the_home_page() {
        mainMenuPage.open();
    }

}
