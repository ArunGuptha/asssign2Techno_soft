package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class VerificationError extends Initialization {

	@Test
	public void enterdetails() {

		getDriver().findElement(By.id("u_0_1")).sendKeys("arun");
		getDriver().findElement(By.id("u_0_3")).sendKeys("dasa");
		getDriver().findElement(By.id("u_0_5")).sendKeys("123456789987654321");
		getDriver().findElement(By.id("u_0_8")).sendKeys("123456789987654321");
		getDriver().findElement(By.id("u_0_a")).sendKeys("Abcabc123@");

	}

	@Test
	public void selectFromDropDown() {

		Select dropdown = new Select(getDriver().findElement(By.id("month")));
		dropdown.selectByIndex(3);
				Select daydropdown = new Select(getDriver().findElement(By.id("day")));
		daydropdown.selectByIndex(24);
		Select monthDropdown = new Select(getDriver().findElement(By.xpath(".//*[@id='year']")));
		monthDropdown.selectByIndex(23);
		getDriver().findElement(By.id("u_0_i")).click();
		getDriver().findElement(By.id("u_0_e")).click();
	}

	@Test
	public void verification() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String expected = ("Please enter a valid mobile number or email address. ");
		String actual = getDriver().findElement(By.xpath(".//*[@class = '_5633 _5634 _53ij' and text() = 'Please enter a valid mobile number or email address.']"))
				.getText();
		Assert.assertEquals(actual, expected);

	}

}
