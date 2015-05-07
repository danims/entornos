package org.cuatrovientos.userlist.UserList;

import static org.junit.Assert.*;

import org.hamcrest.core.IsAnything;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserListTest {

	
	private UserList List;
	@Before
	public void setUp() throws Exception {
		List = new UserList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserList() {
		List = new UserList();
		assertNotNull("Testing",List.getList());
	}

	@Test
	public void testUserAt() {
		User Dani = new User();
		List.addUser(Dani);
		assertEquals("Testing",0,List.userAt(Dani));
	}

	@Test
	public void testDeleteUser() {
		User Dani = new User();
		List.addUser(Dani);
		assertEquals("Testing",0,List.userAt(Dani));
		List.deleteUser(Dani);
		assertEquals("Testing",-1,List.userAt(Dani));
		
	}

}
