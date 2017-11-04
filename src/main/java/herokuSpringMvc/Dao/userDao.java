package herokuSpringMvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;

import herokuSpringMvc.model.*;


public class userDao {
	
	@Autowired
	private users users;

	public users getUsers() {
		return users;
	}

	public void setUsers(users users) {
		this.users = users;
	}

}
