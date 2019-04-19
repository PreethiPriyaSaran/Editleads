package pages;

import org.openqa.selenium.WebElement;

import design.ProjectMethods;

public class Namecheck extends ProjectMethods{

	public Namecheck checkName() throws InterruptedException  {
		WebElement element = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		if (element.isDisplayed()) {
			System.out.println("Is displayed");
			}
			else {
			System.out.println("not displayed");
			}
		Thread.sleep(5000);
		return new Namecheck();
	}
}