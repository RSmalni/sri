package bom;

import org.lib.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book {

	
	public class BookHotel extends LibGlobal {
		
		public BookHotel() {
			
			PageFactory.initElements(driver, this);
		}
		
		 @FindBy(id="first_name")
		 private WebDriver first;
		 
		 @FindBy(id="last_name")
		 private WebDriver last;
		 
		 @FindBy(id="address")
		 private WebDriver textadd;
		 
		 @FindBy(id="cc_num")
		 private WebDriver txtnum;
		 
		 @FindBy(id="cc_type")
		 private WebDriver txttype;
		 
		 @FindBy(id="cc_exp_month")
		 private WebDriver txtmonth;
		 
		 @FindBy(id="cc_exp_year")
		 private WebDriver txtyear;
		 
		 @FindBy(id="cc_cvv")
		 private WebDriver typeccv;
		 
		 @FindBy(id="book_now")
		 private WebDriver book;
		 
		 @FindBy(id="order_no")
		 private WebDriver txtorder;
		 
		 

		public WebDriver getFirst() {
			return first;
		}

		public WebDriver getLast() {
			return last;
		}

		public WebDriver getTextadd() {
			return textadd;
		}

		public WebDriver getTxtnum() {
			return txtnum;
		}

		public WebDriver getTxttype() {
			return txttype;
		}

		public WebDriver getTxtmonth() {
			return txtmonth;
		}

		public WebDriver getTxtyear() {
			return txtyear;
		}

		public WebDriver getTypeccv() {
			return typeccv;
		}

		public WebDriver getBook() {
			return book;
		}

		public WebDriver getTxtorder() {
			return txtorder;
		}

	}

}
