package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownYearDateMonth extends Initialization{

	int count=0;

	@Test
	public void month() {
		Select MonthDropdown = new Select(getDriver().findElement(By.id("month")));
		List<WebElement> size1 = MonthDropdown.getOptions();
		//boolean duplicate = false;
		for (int i = 0; i < size1.size() - 1; i++) {
			for (int j = 1; j < size1.size(); j++) {
				if (size1.get(i).getText() == size1.get(j).getText()) {
					System.out.println("duplicate values :" + " " + size1.get(i).getText() + size1.get(j).getText());
					count++;
				}
			}
		}
		if (count>1) {
			System.out.println("there are duplicate values in month");
		}
		else{
			System.out.println("There are no duplicate values");
		}
	}

	

}
