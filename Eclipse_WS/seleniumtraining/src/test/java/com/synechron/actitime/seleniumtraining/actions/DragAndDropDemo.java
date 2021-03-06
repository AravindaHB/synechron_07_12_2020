package com.synechron.actitime.seleniumtraining.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synechron.actitime.seleniumtraining.util.ActitimeUtils;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
	//	driver.navigate().to("");
		driver.switchTo().frame(0);
		
		WebElement dragME = ActitimeUtils.getElement("id", "draggable");
		WebElement dropHere = ActitimeUtils.getElement("id", "droppable");
		
		System.out.println("dragME" + dragME.getText());
		System.out.println("dropHere" + dropHere.getText());
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		act.dragAndDrop(dragME, dropHere).perform();
		

		System.out.println("dragME" + dragME.getText());
		System.out.println("dropHere" + dropHere.getText());
		
	}
}
