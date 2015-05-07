
package org.cuatrovientos.userlist.UserList;

import java.util.Vector;

/**
 * @author PC
 *
 */
public class UserList {
	
	private Vector<User> list;
	
	/**
	 * Default constructor
	 */
	public UserList() {
		
		list = new Vector<User>();
	}
	
	/**
	 * @return the list
	 */
	public Vector<User> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(Vector<User> list) {
		this.list = list;
	}

	
	
	public void addUser(User user) {
		list.add(user);
	}
	
	public int userAt(User user) {
		int position = 0;
		for (int i = 0; i < list.size();i++) {
			if (user == list.elementAt(i)) {
			position = i;
			return position;
			}
		}
		return -1;
	}
	
	public void deleteUser(User user) {
		list.remove(user);
	}

}
