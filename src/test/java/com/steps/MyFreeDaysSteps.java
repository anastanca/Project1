package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.MyFreeDaysPage;

public class MyFreeDaysSteps  extends ScenarioSteps{
	private static final long serialVersionUID = -4400358920544088769L;
	MyFreeDaysPage myFreeDaysPage;
	
	 @Step
	 public void verifDifference(String labelOne,String labelTwo,int expectedValue){
		 int differenceValue = myFreeDaysPage.dif(labelOne,labelTwo);	 
//		 verifyValues(differenceValue, expectedValue);
		 myFreeDaysPage.verify(differenceValue,expectedValue); 
	 }
	 
//	 @Step
//	 public void verifyValues(int differenceValue,int expectedValue){
//		 myFreeDaysPage.verify(differenceValue,expectedValue); 
//	 }
}
