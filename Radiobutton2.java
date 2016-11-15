package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Radiobutton2 extends Initialization {

	@Test
	public void buttonenabled() throws InterruptedException {
		getDriver().findElement(By.id("u_0_i")).click();
		getDriver().findElement(By.id("u_0_h")).click();
		boolean isEnabledFemale = getDriver().findElement(By.id("u_0_i")).isSelected();
		boolean isEnabledMale= getDriver().findElement(By.id("u_0_h")).isSelected();
		if (isEnabledFemale == true  && isEnabledMale ==true) {
			System.out.println("both buttons are selected");
		} else {
			System.out.println("you can click only one button");
		}
		Thread.sleep(5000);
	}

}
