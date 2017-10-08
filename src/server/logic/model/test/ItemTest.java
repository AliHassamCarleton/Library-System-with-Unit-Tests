package server.logic.model.test;

import static org.junit.Assert.*;
import server.logic.model.*;
import temp.Item;

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
	
	@Test
	public void getItemIDtesting(){
		
		Item i1;
		i1=getItemObject();
		assertEquals(gettestId(),i1.getItemid() );
	}
	
	@Test
	public void setItemIDtesting(){
		Item i1;
		i1=getItemObject();
		i1.setItemid(101);
		assertEquals(101, i1.getItemid());
	}
	

	
}
	
	
