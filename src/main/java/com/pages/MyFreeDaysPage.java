package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyFreeDaysPage extends PageObject {

	@FindBy(id = "_58_login")
	private WebElementFacade freedays_given_this_year;

	@FindBy(id = "_58_login")
	private WebElementFacade vacation_days_taken_this_year;

	@FindBy(id = "_58_login")
	private WebElementFacade total_available_free_days;

	@FindBy(css = "table[class='my-free-days-table'] tr")
	private List<WebElement> myFreeDaysRows;

	public int convertStringToInt(String number) {
		int result = 0;

		try {
			result = Integer.parseInt(number);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public int getDaysNumber(String daysType) {
		int result = 0;
		for (WebElement row : myFreeDaysRows) {
			if (row.getText().toLowerCase().contains(daysType.toLowerCase())) {
				String daysNumberText = row.findElement(
						By.cssSelector("td:nth-child(2)")).getText();
				result = convertStringToInt(daysNumberText);
				break;
			}
		}
		return result;
	}

	public int dif(String daysType_a, String daysType_b) {
		int a = getDaysNumber(daysType_a);
		int b = getDaysNumber(daysType_b);
		return a - b;
	}

	public void verify(int actualValue,int expectedValue) {
		Assert.assertTrue("Failure: result was not as expected.Expected: " + expectedValue + " Actual: " + actualValue, actualValue == expectedValue);
	}
}
