package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class P001_Buy_A_Book {
		 WebDriver driver = null;
		
		public P001_Buy_A_Book(WebDriver driver) {
			this.driver=driver;
		}
		
		By catagbtn = By.xpath("//span[contains(text(),'ক্যাটেগরি')]");
		By bookcatag = By.xpath("//*[contains(text(),'আল কুরআনের তরজমা ও তাফসীর')]");
		By scroll = By.xpath("//a[contains(text(),'তাফসীর ইবনে কাসীর (১-১৮ খণ্ড)')]");
		By buynow =By.xpath("//a[@aria-label='Add “বাইবেল কি আল্লাহর বাণী” to your cart']");
		By checkout =By.xpath("//a[@href='https://www.islamicshopdk.com/checkout/' and @data-text='Checkout']");
		
		
	    public void clickCatagoryBtn() {
			
			driver.findElement(catagbtn).click();
		}
          public void selectCatagory() {
			
			driver.findElement(bookcatag).click();
		}
          public void scrollDown() {
        	  
        	  JavascriptExecutor js = (JavascriptExecutor) driver;
        	  js.executeScript("arguments[0].scrollIntoView();", driver.findElement(scroll));

  		}	
         public void buyBook() {
  			
  			driver.findElement(buynow).click();
  		}
          
       public void checkoutBook() {
    			
    			driver.findElement(checkout).click();
    		}
          
          
}
