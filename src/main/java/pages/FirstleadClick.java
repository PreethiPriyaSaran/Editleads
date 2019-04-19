package pages;

import design.ProjectMethods;

public class FirstleadClick  extends ProjectMethods{

	public ClickEditLead firstLeads() throws InterruptedException  {
		driver.findElementByXPath("(//*[@class='linktext'])[4]").click();
		Thread.sleep(5000);
        String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		return new ClickEditLead();
	}
}