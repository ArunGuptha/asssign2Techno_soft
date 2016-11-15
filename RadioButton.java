package selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends Initialization {

	@Test
	public void malebutton() {
		boolean isSelected;
		getDriver().findElement(By.id("u_0_i")).click();
		isSelected = getDriver().findElement(By.id("u_0_i")).isSelected();
		if (isSelected == true) {
			System.out.println("only male is selected");
		} else {
			Assert.fail("none is selected");
		}
	}

	@Test
	public void femalebutton() {
		boolean Selected;
		getDriver().findElement(By.id("u_0_h")).click();
		Selected = getDriver().findElement(By.id("u_0_h")).isSelected();
		if (Selected == true) {
			System.out.println("only female  is selected");
		} else {
			Assert.fail("none is selected");
		}
	}

}
