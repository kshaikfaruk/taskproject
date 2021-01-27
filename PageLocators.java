package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageLocators {
	 @FindBy(how=How.XPATH,using="(//button[@title='Select date']/ancestor::div[@class='left'])[1]")
	  public static  WebElement   first_calender;
	 @FindBy(how=How.XPATH,using="//a[@class='next']//ancestor::div[@class='month-year-picker']")
	 public  static WebElement  month_next;
	@FindBy(how=How.XPATH,using="//table[@class='calendar']//tr[3]/td[1]/a[contains(text(),'14')]")
	 public static WebElement  first_date;
	 @FindBy(how=How.XPATH,using="//a[@class='picked-year' and contains(text(),'2021')]")
	  public static WebElement year;
	@FindBy(how=How.XPATH, using="//table/tbody/tr/td/a[contains(text(),'2021')]")
	 public  static WebElement firstyear;
	
	
	 @FindBy(how=How.XPATH,using="(//button[@title='Select date']/ancestor::div[@class='left'])[2]")
	  public static  WebElement   second_calender;
	 
 @FindBy(how=How.XPATH,using="//table[@class='calendar']//tr[3]/td[6]/a[contains(text(),'14')]")
	  public static WebElement second_date;	 

	  @FindBy(how=How.XPATH,using="//a[@class='picked-year' and contains(text(),'2021')]")
	  public static WebElement secondyear;
	@FindBy(how=How.XPATH, using="//table/tbody/tr/td/a[contains(text(),'2025')]")
	 public  static WebElement second_year;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	public static  WebElement submit;

	@FindBy(how=How.XPATH,using="//div[@class='eight columns']/h2")
	public static  WebElement verifydetails;
	 

}
