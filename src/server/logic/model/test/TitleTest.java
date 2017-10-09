package server.logic.model.test;

import server.logic.model.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TitleTest {


	@Test
	public void TitleConstructorPassTesting(){
		
		assertNotNull(new Title ("23456789987","Mobi Dick"));	
		
	}
	
	public Title getTitleObject(){
		
		Title t1;
		t1= new Title ("23456789987","Mobi Dick");	
		return t1;
		
	}
	
	@Test
	public void gettestISBN(){
			
		Title t1= getTitleObject();
		assertEquals("23456789987", t1.getISBN());
			
	}
	
	@Test
	public void settestISBN(){
		Title t1= getTitleObject();
		t1.setISBN("1212121212");
		assertEquals("1212121212", t1.getISBN());
	}
	
	

}
