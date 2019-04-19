package pages;

import design.ProjectMethods;

public class EditSubmit extends ProjectMethods{

	public Namecheck editsubmit() throws InterruptedException  {
driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		Thread.sleep(5000);
		return new Namecheck();
	}
}