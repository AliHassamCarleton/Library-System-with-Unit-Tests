package server.logic.model.test;

import server.logic.model.*;

import static org.junit.Assert.*;

import org.junit.Test;



public class FeeTest {

	@Test
	public void feeConsuctorTesting() {
		
		assertNotNull(new Fee (1, 2));
	


}

	public Fee getFeeObject(){
		
		int userid=1;
		int fee= 2;
		Fee f1= new Fee (userid, fee);
		return f1;
		
	}
	
	@Test
	public void getUseridTesting(){

		assertEquals(1,getFeeObject().getUserid());
		
	}
	
	@Test
	public void setUseridTesting(){
		
		assertEquals(1, getFeeObject().getUserid());
		
	}
	@Test
	public void getFeeTesting(){
		
		assertEquals(2,getFeeObject().getFee());
		
	}
	
	@Test
	public void setFeeTesting(){
		
		Fee f1= getFeeObject();
		f1.setFee(3);
		assertEquals(3,f1.getFee());
		
	}
	

	
}