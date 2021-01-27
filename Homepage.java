package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.PageLocators;
import pagesactions.PageActions;

public class Homepage {
	  BaseClass mbs;
	 
	   
	  PageActions page= new PageActions();
	  @Test(priority=1)
	 public void launchurl( ){
	mbs= new BaseClass();
		 mbs.persetup();
		 mbs.launchurl("https://www.timeanddate.com/date/duration.html");
		 
	 }
	   @Test(priority=2)
	   public void click_oncalender(){
		  
		   page.click_on_calender(PageLocators.first_calender);
	   }
	    @Test(priority=3)
	     public void select_month(){
	    	page.click_onmonth(PageLocators.month_next);
	    }
	     @Test(priority=4)
		    public void click_ondate(){
	    	//  System.out.println("date");
		    	page.click_ondate(PageLocators.first_date);
		    }
	  
	
	     @Test(priority=5)
	      public void click_on_Secondcalender(){
	    	  page.click_on_calender(PageLocators.second_date);
	      }
	     
	     
	     @Test(priority=6)
	      public void select_year(){
	    page.clickonyear(PageLocators.secondyear);
	    	 page.clickonyear(PageLocators.second_year);
	     }
	     
	     @Test(priority=7)
	      public void select_month_secondcalender(){
	    	  page.select_month(PageLocators.month_next);
	    	
	    
	      }
	     @Test(priority=8)
		    public void click_ondate_secondcalender(){
		    	page.click_ondate(PageLocators.second_date);
		    }
	  
	     @Test(priority=9)
	      public void click_calcutionduration(){
	    	 page.clickonresult(PageLocators.submit);
	     }
	     @Test(priority=10)
	     public void verify_result(){
	    	String current_result=page.verifyresult(PageLocators.verifydetails);
	    	 Assert.assertEquals(current_result, "Result: 1734 days");
	     }
	     
	

}
