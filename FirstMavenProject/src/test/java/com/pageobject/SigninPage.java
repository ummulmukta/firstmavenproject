package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	public WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement submit;




	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath="")
	
	
	
}
