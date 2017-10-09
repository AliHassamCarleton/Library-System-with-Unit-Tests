package server.logic.model.test;

import server.logic.model.*;
import static org.junit.Assert.*;


import org.junit.Test;

public class UserTest {

	@Test
	public void userConstructorPassTesting(){
		assertNotNull(new User(1, "User 1", "user 1 password"));
	}
	
	public User getUserObject(){
		
		User u1= new User(1, "User 1", "user 1 password");	
		return u1;
		
	}
	
	@Test
	public void getUserIDTesting(){
		
		User u1= getUserObject();
		assertEquals(1,u1.getUserid());
		
	}

}
