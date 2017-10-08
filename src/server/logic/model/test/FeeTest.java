package server.logic.model.test;

import server.logic.model.*;

import static org.junit.Assert.*;

import org.junit.Test;



public class FeeTest {

	@Test
	public void feeConsuctorTesting() {
		
		assertNotNull(getFeeObject());
	


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
	
}