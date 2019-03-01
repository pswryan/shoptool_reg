package shop_tool_regression_qa;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Konami_shop_tool_regression {
	WebDriver driver;
	public String baseUrl = "http://shopadmin-qa.playstudios.com/shopadmin/#/konamishop/management/shopevents";

	// Runs before test
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("launching Chrome browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	// Upload JSON config from tester's local
	@BeforeTest
	public void importJSON() throws Exception {

		Thread.sleep(1500);
		// following uploads config file from user's local
		driver.findElement(By.xpath("//input[@id='rootfileInput']"))
				.sendKeys("C:/Users/ryan.wahid/Videos/winterooc.json");

		Thread.sleep(1500);
		// following confirms file upload
		WebElement elem1 = driver.findElement(By.xpath("//div[@class='mat-body-1']"));
		boolean el1 = elem1.isDisplayed();
		if (el1)
			System.out.println("Config Upload: Successful");
		else
			System.out.println("Config Upload: Failed");

		// following clicks on edit icon
		driver.findElement(By.xpath("(//mat-icon[@class='mat-icon material-icons' and ./text()='edit'])[2]")).click();
	}

	// verify_field_present checks for element present
	@Test(priority = 1)
	public void verify_field_present() throws Exception {

		/*
		 * This bit checks for Element present. DO NOT DELETE.
		 * 
		 * if(driver.findElements(By.xpath("//input[@id='Name']")).size() != 0){
		 * System.out.println("Element is Present"); }else{
		 * System.out.println("Element is Absent"); }
		 */

		// checking name field
		WebElement elem2 = driver.findElement(By.xpath("//input[@ng-reflect-id=\"Name\"]"));
		boolean el2 = elem2.isDisplayed();
		if (el2)
			System.out.println("Present: Name");
		else
			System.out.println("Absent: Name");

		// checking PlayerID
		if (driver.findElements(By.xpath("//input[@id='PlayerIds']")).size() != 0) {
			System.out.println("Present: PlayerID");
		} else {
			System.out.println("Absent: PlayerID");
		}
		// checking ModGroup
		if (driver.findElements(By.xpath("//input[@id='ModGroup']")).size() != 0) {
			System.out.println("Present: ModGroup");
		} else {
			System.out.println("Absent: ModGroup");
		}
		// checking ModValues
		if (driver.findElements(By.xpath("//input[@id='ModValues']")).size() != 0) {
			System.out.println("Present: ModValues");
		} else {
			System.out.println("Absent: ModValues");
		}
		// checking Levels
		if (driver.findElements(By.xpath("//input[@id='Levels']")).size() != 0) {
			System.out.println("Present: Levels");
		} else {
			System.out.println("Absent: Levels");
		}
		// checking BonusMultiplier
		if (driver.findElements(By.xpath("//input[@id='BonusMultiplier']")).size() != 0) {
			System.out.println("Present: BonusMultiplier");
		} else {
			System.out.println("Absent: BonusMultiplier");
		}
		// checking Bonus Type-Decimal
		if (driver.findElements(By.xpath("//div[contains(text(),'Decimal')]")).size() != 0) {
			System.out.println("Present: Bonus Type-Decimal");
		} else {
			System.out.println("Absent: Bonus Type-Decimal");
		}
		// checking Bonus Type-Percent
		if (driver.findElements(By.xpath("//div[contains(text(),'Percent')]")).size() != 0) {
			System.out.println("Present: Bonus Type-Decimal");
		} else {
			System.out.println("Absent: Bonus Type-Decimal");
		}
		// checking Bonus Type-ClientAuthoritative
		if (driver.findElements(By.xpath("//div[contains(text(),'ClientAuthoritative')]")).size() != 0) {
			System.out.println("Present: Bonus Type-ClientAuthoritative");
		} else {
			System.out.println("Absent: Bonus Type-ClientAuthoritative");
		}
		// checking Priority
		if (driver.findElements(By.xpath("//input[@id='Priority']")).size() != 0) {
			System.out.println("Present: Priority");
		} else {
			System.out.println("Absent: Priority");
		}
		// checking Start Time
		if (driver.findElements(By.xpath("   //div[@class='mat-form-field-infix']/input[@id='mat-input-7']"))
				.size() != 0) {
			System.out.println("Present: Start Time");
		} else {
			System.out.println("Absent: Start Time");
		}
		// checking End Time
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-8']"))
				.size() != 0) {
			System.out.println("Present: End Time");
		} else {
			System.out.println("Absent: End Time");
		}
		// checking Type
		if (driver.findElements(By.xpath("   //div[@class='mat-form-field-infix']/input[@id='Type']")).size() != 0) {
			System.out.println("Present: Type");
		} else {
			System.out.println("Absent: Type");
		}
		// checking Platforms
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/mat-select[@id='mat-select-0']"))
				.size() != 0) {
			System.out.println("Present: Platforms");
		} else {
			System.out.println("Absent: Platforms");
		}
		// checking Shop Event Theme: Add New Shop Event Themes button
		if (driver.findElements(By.xpath("//div[@formarrayname='ShopEventThemes']//mat-icon[text()='add_circle']"))
				.size() != 0) {
			System.out.println("Present: Shop Event Theme: Add New Shop Event Themes button");
		} else {
			System.out.println("Absent: Shop Event Theme: Add New Shop Event Themes button");
		}
		// checking Shop Event Theme: Delete button
		if (driver.findElements(By.xpath("//div[@formarrayname='ShopEventThemes']//mat-icon[text()='delete']"))
				.size() != 0) {
			System.out.println("Present: Shop Event Theme: Delete button");
		} else {
			System.out.println("Absent: Shop Event Theme: Add New Shop Event Themes button");
		}
		// checking Shop Event Theme: Name
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-10']"))
				.size() != 0) {
			System.out.println("Present: Shop Event Theme: Name");
		} else {
			System.out.println("Absent: Shop Event Theme: Name");
		}
		// checking Shop Event Theme: Asset Name/Theme Id
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-11']"))
				.size() != 0) {
			System.out.println("Present: Shop Event Theme: Asset Name/Theme Id");
		} else {
			System.out.println("Absent: Shop Event Theme: Asset Name/Theme Id");
		}

		// checking Shop Event Theme: Start Time
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-12']"))
				.size() != 0) {
			System.out.println("Present: Shop Event Theme: Start Time");
		} else {
			System.out.println("Absent: Shop Event Theme: Start Time");
		}
		// checking Shop Event Theme: End Time
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-13']"))
				.size() != 0) {
			System.out.println("Present: Shop Event Theme: End Time");
		} else {
			System.out.println("Absent: Shop Event Theme: End Time");
		}
		// checking Shops: Add new Shop button
		if (driver.findElements(By.xpath("//div[@formarrayname='FormShopLogics']//mat-icon[text()='add_circle']"))
				.size() != 0) {
			System.out.println("Present: Shops: Add new Shop button");
		} else {
			System.out.println("Absent: Shops: Add new Shop button");
		}
		// checking Shops: Delete Shop button
		if (driver.findElements(By.xpath("//div[@formarrayname='FormShopLogics']//mat-icon[text()='delete']"))
				.size() != 0) {
			System.out.println("Present: Shops: Delete Shop button");
		} else {
			System.out.println("Absent: Shops: Delete Shop button");
		}
		// checking Shops: Edit Shop button
		if (driver.findElements(By.xpath("//div[@formarrayname='FormShopLogics']//mat-icon[text()='edit']"))
				.size() != 0) {
			System.out.println("Present: Shops: Edit Shop button");
		} else {
			System.out.println("Absent: Shops: Edit Shop button");
		}
		// checking Shops: Copy Shop button
		if (driver.findElements(By.xpath("//div[@formarrayname='FormShopLogics']//mat-icon[text()='file_copy']"))
				.size() != 0) {
			System.out.println("Present: Shops: Copy Shop button");
		} else {
			System.out.println("Absent: Shops: Copy Shop button");
		}
		// checking Shops: Priority
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-14']"))
				.size() != 0) {
			System.out.println("Present: Shops: Priority");
		} else {
			System.out.println("Absent: Shops: Priority");
		}
		// checking Shops: Name
		if (driver.findElements(By.xpath("//div[@class='mat-form-field-infix']/input[@id='mat-input-15']"))
				.size() != 0) {
			System.out.println("Present: Shops: Name");
		} else {
			System.out.println("Absent: Shops: Name");
		}
		// checking PBW: Add new PBW
		if (driver.findElements(By.xpath(
				"//h3[contains(text(),'PBW')]//div[@class='mat-button-ripple mat-ripple mat-button-ripple-round']"))
				.size() != 0) {
			System.out.println("Present: PBW: Add new PBW");
		} else {
			System.out.println("Absent: PBW: Add new PBW");
		}
		// checking PBW: PBW Override toggle
		if (driver
				.findElements(By
						.xpath("//span[@class='mat-slide-toggle-content']/mat-label[contains(text(),'PBW Override')]"))
				.size() != 0) {
			System.out.println("Present: PBW: PBW Override toggle");
		} else {
			System.out.println("Absent: PBW: PBW Override toggle");
		}
		// checking Cancel editing Shop Event
		if (driver.findElements(By.xpath("//button[@class='mat-raised-button']//span[contains(text(),'Cancel')]"))
				.size() != 0) {
			System.out.println("Present: Cancel editing Shop Event");
		} else {
			System.out.println("Absent: Cancel editing Shop Event");
		}
		// checking Save edited Shop Event
		if (driver
				.findElements(
						By.xpath("//button[@class='mat-raised-button']//span[contains(text(),'Save Shop Event')]"))
				.size() != 0) {
			System.out.println("Present: Save edited Shop Event");
		} else {
			System.out.println("Absent: Save edited Shop Event");
		}

	} // end of verify_field_present
	

	// Inputs or changes field values under Shop Event Details
	@Test(priority = 2)

	public void tests_field_values() throws Exception {

		// Enters a PlayerID that Starts with 2 and 3 random digit
		try {
			String randoPID = RandomStringUtils.randomNumeric(3); /* This generates random String */
			WebElement pid = driver.findElement(By.xpath("//input[@id='PlayerIds']"));
			pid.sendKeys("2" + randoPID);
			pid.getText();
			System.out.println("PlayerID: is set");

		} catch (Exception e) {

			System.out.println("PlayerID: Failed to set");

			throw (e);
		}

		// Enters a ModGroup that stays within 0-5
		final int expectedMinLengthInclusive = 1;
		try {
			String randoModG = RandomStringUtils.randomNumeric(expectedMinLengthInclusive);
			WebElement ModG = driver.findElement(By.xpath("//input[@id='ModGroup']"));
			ModG.clear();
			Thread.sleep(1000);
			ModG.sendKeys(randoModG);
			ModG.getText();
			System.out.println("ModGroup: is set");

		} catch (Exception e) {

			System.out.println("ModGroup: Failed to set");

			throw (e);
		}
		// Enters a Mod Value
		try {
			String randoModV = RandomStringUtils.randomNumeric(expectedMinLengthInclusive);
			WebElement ModV = driver.findElement(By.xpath("//input[@id='ModValues']"));
			ModV.clear();
			Thread.sleep(1000);
			ModV.sendKeys(randoModV + "+");
			ModV.getText();
			System.out.println("ModValues: is set to");

		} catch (Exception e) {

			System.out.println("ModValues: Failed to set");

			throw (e);
		}
		// Enters Levels
		try {
			String randoLevels = RandomStringUtils.randomNumeric(expectedMinLengthInclusive);
			WebElement Levels = driver.findElement(By.xpath("//input[@id='Levels']"));
			Levels.clear();
			Thread.sleep(1000);
			Levels.sendKeys(randoLevels + "+");
			Levels.getText();
			System.out.println("Levels: is set to");

		} catch (Exception e) {

			System.out.println("Levels: Failed to set");

			throw (e);
		}
		// Enters BonusMultiplier
		try {
			String randoBM = RandomStringUtils.randomNumeric(1);
			WebElement BM = driver.findElement(By.xpath("//input[@id='BonusMultiplier']"));
			BM.sendKeys(randoBM);
			Thread.sleep(1000);
			BM.getText();
			System.out.println("BonusMultiplier: is set");

		} catch (Exception e) {

			System.out.println("BonusMultiplier: Failed to set");

			throw (e);
		}
		// Selects Bonus Type Decimal
		try {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver
					.findElement(By.xpath("//mat-radio-group[@role='radiogroup']//input[@id='mat-radio-2-input']")));
			System.out.println("Selected Bonus Type Decimal");

		} catch (Exception e) {

			System.out.println("Failed to Select Bonus Type Decimal");

			throw (e);
		}
		// Enters (Shop Event) Priority
		try {
			String randoPriority = RandomStringUtils.randomNumeric(1);
			WebElement Priority = driver.findElement(By.xpath("//input[@id='Priority']"));
			Thread.sleep(1000);
			Priority.sendKeys(randoPriority);
			Thread.sleep(500);
			Priority.getText();
			System.out.println("Event Priority: is set");

		} catch (Exception e) {

			System.out.println("Event Priority: Failed to set");

			throw (e);
		}
		// Enters (Shop Event) Type: buychips
		try {
			WebElement Type = driver.findElement(By.xpath("//input[@id='Type']"));
			Type.clear();
			Thread.sleep(1000);
			Type.sendKeys("buychips");
			System.out.println("Event Type: is set to buychips");

		} catch (Exception e) {

			System.out.println("Event Type: Failed to set buychips");

			throw (e);
		}
		
	} /* This is where tests_field_values end */


	// tests Shop Event Start Date/Time picker
	@Test(priority = 3)
	public void testing_event_start_time() throws Exception {

		// clicks Start Time(UTC) field to launch Calendar
		driver.findElement(By.xpath("//input[@id='mat-input-7']")).click();
		// clicks Year drop-down button
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement yrDropDown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@class='owl-dt-control-button-arrow']")));
		yrDropDown.click();
		// selects year 2020
		WebElement pickAyr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@class='owl-dt-calendar-table owl-dt-calendar-multi-year-table']//span[text()='2020']")));
		pickAyr.click();
		// selects month of May for year 2020
		WebElement pickAmonth = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'May')]")));
		pickAmonth.click();
		// selects 10th day of May 2020
		WebElement pickAdate = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'10')]")));
		pickAdate.click();
		// selects an hour
		WebElement pickANhr = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Add a hour']")));
		pickANhr.click();
		// selects minutes
		WebElement pickMinutes = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='owl-dt-timer-input'])[2]")));
		pickMinutes.clear();
		pickMinutes.sendKeys("30");
		// Read Start Date
		Thread.sleep(1500);
		String StartFrom = driver
				.findElement(By.xpath("(//div[@role='radiogroup']//span[@class='owl-dt-container-info-value'])[1]"))
				.getText();
		System.out.println("Shop Event Starts from " + StartFrom);
		// Clicking Set after selection
		WebElement SetStart = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Set')]")));
		SetStart.click();
		Thread.sleep(1500);
	}

	// tests Shop Event End Date/Time picker
	@Test(priority = 4)
	public void testing_event_end_time() throws Exception {

		// clicks Start Time(UTC) field to launch Calendar
		driver.findElement(By.xpath("//input[@id='mat-input-8']")).click();
		// clicks Year drop-down button
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement yrDropDown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@class='owl-dt-control-button-arrow']")));
		yrDropDown.click();
		// selects year 2020
		WebElement pickAyr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@class='owl-dt-calendar-table owl-dt-calendar-multi-year-table']//span[text()='2021']")));
		pickAyr.click();
		// selects month of May for year 2020
		WebElement pickAmonth = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'Aug')]")));
		pickAmonth.click();
		// selects 10th day of May 2020
		WebElement pickAdate = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'15')]")));
		pickAdate.click();
		// selects an hour
		WebElement pickANhr = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Add a hour']")));
		pickANhr.click();
		// selects minutes
		WebElement pickMinutes = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='owl-dt-timer-input'])[2]")));
		pickMinutes.clear();
		pickMinutes.sendKeys("10");
		// Read Start Date
		Thread.sleep(1500);
		String EndsAt = driver
				.findElement(By.xpath("(//div[@role='radiogroup']//span[@class='owl-dt-container-info-value'])[2]"))
				.getText();
		System.out.println("Shop Event Ends at " + EndsAt);
		// Clicking Set after selection
		WebElement SetEnd = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Set')]")));
		SetEnd.click();
		Thread.sleep(1500);
	}

	// tests Shop Event Theme Start Date/Time picker
	@Test(priority = 4)
	public void testing_Theme_Start_time() throws Exception {

		// clicks Start Time(UTC) field to launch Calendar
		WebDriverWait wait = new WebDriverWait(driver, 20); /* making it wait */

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", /* \\\\\This is the new JS Executor\\\\\ */
				driver.findElement(By.xpath("//div[@class='mat-form-field-wrapper']//input[@id='mat-input-12']")));

		/*
		 * *******This bit right here may be going out******** WebElement ThemeStart =
		 * wait.until(ExpectedConditions .elementToBeClickable(By.xpath(
		 * "//div[@class='mat-form-field-wrapper']//input[@id='mat-input-12']")));
		 * ThemeStart.click();
		 */

		// clicks Year drop-down button
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement yrDropDown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@class='owl-dt-control-button-arrow']")));
		yrDropDown.click();
		// selects year 2020
		WebElement pickAyr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@class='owl-dt-calendar-table owl-dt-calendar-multi-year-table']//span[text()='2021']")));
		pickAyr.click();
		// selects month of May for year 2020
		WebElement pickAmonth = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'Mar')]")));
		pickAmonth.click();
		// selects 10th day of May 2020
		WebElement pickAdate = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'12')]")));
		pickAdate.click();
		// selects an hour
		WebElement pickANhr = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Add a hour']")));
		pickANhr.click();
		// selects minutes
		WebElement pickMinutes = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='owl-dt-timer-input'])[2]")));
		pickMinutes.clear();
		pickMinutes.sendKeys("40");
		// Read Start Date
		Thread.sleep(1500);
		String StartsFrom = driver
				.findElement(By.xpath("(//div[@role='radiogroup']//span[@class='owl-dt-container-info-value'])[2]"))
				.getText();
		System.out.println("Shop Event Theme Starts from " + StartsFrom);
		// Clicking Set after selection

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//span[contains(text(),'Set')]")));

		/*
		 * WebElement SetStart = wait
		 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[contains(text(),'Set')]"))); SetStart.click();
		 */
		Thread.sleep(1500);
	}

	// tests Shop Event Theme End Date/Time picker
	@Test(priority = 5)
	public void testing_Theme_End_time() throws Exception {

		// clicks Start Time(UTC) field to launch Calendar

		WebDriverWait wait = new WebDriverWait(driver, 10); /* making it wait WebElement */

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", /* \\\\\This is the new JS Executor\\\\\ */
				driver.findElement(By.xpath("//div[@class='mat-form-field-wrapper']//input[@id='mat-input-13']")));
		// clicks Year drop-down button
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//span[@class='owl-dt-control-button-arrow']")));
		// selects year 2023
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(
				"//table[@class='owl-dt-calendar-table owl-dt-calendar-multi-year-table']//span[text()='2023']")));

		// selects month of Dec for year 2023
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'Dec')]")));

		// selects 12th day of Dec 2023

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//span[contains(text(),'12')]")));

		// selects an hour

		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//button[@aria-label='Add a hour']")));

		// selects minutes
		WebElement pickMinutes = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='owl-dt-timer-input'])[2]")));
		pickMinutes.clear();
		pickMinutes.sendKeys("20");
		// Read Start Date
		Thread.sleep(1500);
		String EndAt = driver
				.findElement(By.xpath("(//div[@role='radiogroup']//span[@class='owl-dt-container-info-value'])[2]"))
				.getText();
		System.out.println("Shop Event Theme Ends At " + EndAt);
		// Clicking Set after selection
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//span[contains(text(),'Set')]")));

		Thread.sleep(1000);
	} 			/* This is where testing_Theme_End_time ends */

	
	@Test(priority = 6) public void checking_Platform() throws Exception{
		
		// De-selects Platform: Amazon 
		try {
			WebElement Platform = driver.findElement(By.xpath("//div[@class='mat-select-arrow']"));
			Platform.click();
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver
					.findElement(By.xpath("//mat-option[@id='mat-option-2']//mat-pseudo-checkbox[@class='mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted mat-pseudo-checkbox-checked']")));
			
			WebElement pp = driver.findElement(By.xpath("//mat-option[@id='mat-option-2']"));
			pp.sendKeys(Keys.ESCAPE);
			
			
			System.out.println("Platform: Amazon de-selected");

		} catch (Exception e) {

			System.out.println("Failed to de-select Platform: Amazon");

			throw (e);
		}
		
		/* Waits for a bit before selecting again */ Thread.sleep(1000);
		
		// Selects Platform: Amazon after de-selecting Amazon Platform
		try {
			WebElement Platform = driver.findElement(By.xpath("//div[@class='mat-select-arrow']"));
			Platform.click();
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver
					.findElement(By.xpath("//mat-pseudo-checkbox[@class='mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted']")));
			
			WebElement pp = driver.findElement(By.xpath("//mat-option[@id='mat-option-2']"));
			pp.sendKeys(Keys.ESCAPE);
			
			
			System.out.println("Platform: Amazon selected");

		} catch (Exception e) {

			System.out.println("Failed to select Platform: Amazon");

			throw (e);
		}
		
	} 	/* This is where checking_Platform() ends */
	
	/*
	 * @Test(priority = 10) public void Saving_Edited_Event() throws Exception{
	 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement saveEvent =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//button[@class='mat-raised-button']//span[contains(text(),'Save Shop Event')]"
	 * ))); saveEvent.click(); }
	 */
	 
	

} // Don't delete
