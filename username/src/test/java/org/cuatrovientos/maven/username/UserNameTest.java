/**
 * 
 */
package org.cuatrovientos.maven.username;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author PC
 *
 */
public class UserNameTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.maven.username.UserName#UserName()}.
	 */
	@Test
	public void testUserName() {
		UserName target = new UserName();
		String expectedName = "";
		String actualName = target.getName();
		
		assertEquals("Equals default",expectedName,actualName);
	}

	/**
	 * Test method for {@link org.cuatrovientos.maven.username.UserName#UserName(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUserNameStringString() {
		UserName target = new UserName("jon","snow");
		String expectedName = "jon_snow";
		String actualName = target.getName();
		
		assertEquals("Equals default",expectedName,actualName);
	}

}
