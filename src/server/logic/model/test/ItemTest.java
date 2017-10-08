package server.logic.model.test;

import static org.junit.Assert.*;
import server.logic.model.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void itemConstructorPassTesting(){
		assertNotNull(new Item(gettestId(), gettestIsbn(), gettestCopynumber()));
	}
	
	public int gettestId(){
		
		return 100;
		
	}
	public String gettestIsbn(){
		
		return "1234567";
	}
	
	public String gettestCopynumber(){
		
		return "1";
	
	}
	
	public Item getItemObject(){
		
		Item i1= new Item (gettestId(), gettestIsbn(), gettestCopynumber());
		return i1;
		
	}
	

	
}
	
	
