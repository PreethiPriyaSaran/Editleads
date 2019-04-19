package pages;

import design.ProjectMethods;

public class EditField extends ProjectMethods{

	public EditSubmit editfield() throws InterruptedException  {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		Thread.sleep(5000);
		return new EditSubmit();
	}
}