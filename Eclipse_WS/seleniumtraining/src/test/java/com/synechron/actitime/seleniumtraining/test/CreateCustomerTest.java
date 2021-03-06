package com.synechron.actitime.seleniumtraining.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class CreateCustomerTest {

	public static void main(String[] args) {

		WebDriver driver = ActitimeUtils.getDriver("ff");

		ActitimeUtils.launch("http://localhost/login.do");

		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.selectModule("tasks");
		
		ActitimeUtils.createCustomer("Customer4-2020", "Customer4-2020-Desc");
		ActitimeUtils.logout();
		
	}

	

}
