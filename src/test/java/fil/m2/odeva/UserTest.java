package fil.m2.odeva;

import junit.framework.TestCase;


public class UserTest extends TestCase {

	public void testUserCreationOK()
    {
		//GIVEN
        User user = new User("Amandine",24,"France");
        //THEN
		assertEquals("Amandine",user.getName());
		assertEquals(24,user.getAge());
		assertEquals("France",user.getCountry());
    }
	
	
	public void testUserChangeName()
    {
		//GIVEN
        User user = new User("Florian",24,"France");
        //THEN
		assertSame("Florian",user.getName());
		user.setName("Flo");
		assertSame("Flo",user.getName());
		
    }
	
}
