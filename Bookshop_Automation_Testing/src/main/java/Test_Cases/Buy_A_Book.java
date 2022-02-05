package Test_Cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Base.Driver_setup;
import Object_Model.P001_Buy_A_Book;
import Object_Model.P002_BillingAddress;


public class Buy_A_Book extends Driver_setup {
	
	public static String url = "https://www.islamicshopdk.com/";
	
	@Test()
	public static void buyBook() throws InterruptedException {
		
        driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		P001_Buy_A_Book bb = new P001_Buy_A_Book (driver);
		bb.clickCatagoryBtn();
		Thread.sleep(2000);
		bb.selectCatagory();
		Thread.sleep(2000);
		bb.scrollDown();
		Thread.sleep(2000);
		bb.buyBook();
		Thread.sleep(6000);
		bb.checkoutBook();
		Thread.sleep(2000);
		
		P002_BillingAddress ba = new P002_BillingAddress (driver);
		ba.NameField("Atik");
		Thread.sleep(2000);
		ba.BillingAddress("House no-99 and road no-4");
		Thread.sleep(2000);
		ba.selectDistrict();
		Thread.sleep(2000);
		ba.PhoneNumber("01712083236");
		Thread.sleep(2000);
		ba.Email("atikfoysal001@gmail.com");
		Thread.sleep(2000);
		ba.CreateAccount();
		Thread.sleep(2000);
		ba.CreatePassword("atif@01712083236");
		Thread.sleep(2000);
		ba.addComment("This website is amazing");
		Thread.sleep(2000);
	}

}
