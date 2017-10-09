package server.logic.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import server.logic.model.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LoanTest {
	
	DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	
	@Test
	public void loanConstructorPassTesting(){
		
		assertNotNull(new Loan (1, "1234567", "1", gettestDate(), "renewed"));	
		
	}
	
	public Date gettestDate(){
		
		Date date = new Date();
		
		return date;
		
	}
	
	public Loan gettestLoan(){
		
		Loan l1= new Loan (1, "1234567", "1", gettestDate(), "renewed");	
		return l1;
		
	}
	
	@Test
	public void getUserIDtesting(){
			
		Loan l1= gettestLoan();
		assertEquals(1,l1.getUserid());
			
	}
	
	@Test
	public void setUserIDtesting(){
			Loan l1 = gettestLoan();
			l1.setUserid(2);
			assertEquals(2, l1.getUserid());
	}
	
	
	@Test
	public void getISBNtesting(){
		
		Loan l1= gettestLoan();
		assertEquals("1234567",l1.getIsbn());
			
	}
	
	@Test
	public void setISBNtest(){
		Loan l1 = gettestLoan();
		l1.setIsbn("2345678");
		assertEquals("2345678", l1.getIsbn());
	}
	
	
	@Test
	public void getCopynumbertesting(){
		
		Loan l1= gettestLoan();
		assertEquals("1",l1.getCopynumber());
			
	}
	
	@Test
	public void setCopynumbertesting(){
		Loan l1 = gettestLoan();
		l1.setCopynumber("2");;
		assertEquals("2", l1.getCopynumber());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
