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
		
		Fee f1= new Fee (1, 2);
		return f1;
		
	}

	
}