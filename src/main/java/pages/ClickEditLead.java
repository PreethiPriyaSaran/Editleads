package pages;

import design.ProjectMethods;

public class ClickEditLead extends ProjectMethods{

	public EditField clickEdit() throws InterruptedException  {
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new EditField();
	}
}