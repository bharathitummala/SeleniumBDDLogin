package com.bharathi.selenium.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath = "//p[@id='result']")
	WebElement message;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String usernametxt) {
		username.sendKeys(usernametxt);
	}

	public void setPassword(String passwordtxt) {
		password.sendKeys(passwordtxt);
	}

	public void clickSubmit() {
		submit.click();
	}

	public String getMessage() {
		return message.getText();
	}

}
