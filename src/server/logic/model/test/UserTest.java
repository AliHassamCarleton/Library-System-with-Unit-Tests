package server.logic.model.test;

import server.logic.model.*;
import static org.junit.Assert.*;


import org.junit.Test;

public class UserTest {

	@Test
	public void userConstructorPassTesting(){
		assertNotNull(new User(1, "User 1", "User 1 password"));
	}
	
	public User getUserObject(){
		
		User u1= new User(1, "User 1", "User 1 password");	
		return u1;
		
	}
	
	@Test
	public void getUserIDTesting(){
		
		User u1= getUserObject();
		assertEquals(1,u1.getUserid());
		
	}
	
	@Test
	public void setUserIDTesting(){
			User u1= getUserObject();
			u1.setUserid(2);
			assertEquals(2, u1.getUserid());
	}
	
	@Test
	public void getUserNameTesting(){
		
		User u1= getUserObject();
		assertEquals("User 1",u1.getUsername());
		
	}
	
	@Test
	public void setUserNameTesting(){
			User u1= getUserObject();
			u1.setUsername("User Ali");
			assertEquals("User Ali", u1.getUsername());
	}
	
	@Test
	public void getPasswordTesting(){
		
		User u1= getUserObject();
		assertEquals("User 1 password",u1.getPassword());
		
	}
	
	@Test
	public void setPasswordTesting(){
			User u1= getUserObject();
			u1.setPassword("User 1 new password");
			assertEquals("User 1 new password", u1.getPassword());
	}
	
	
	
	

}
