package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.User;

@Service
public class UserService {
	
	Map<String, User> userMap = new HashMap<String, User>();

	public Collection<User> getUser() {
		return userMap.values();
	};
	
	public void insert(User user) {
		userMap.put(user.getEmail(), user);
		System.out.println("[User] successfully included: " + user);
	};
	
	public void delete(String email) {
		userMap.remove(email);
	};
	
	public User validate(String email, String pswd) {
		
		User user = userMap.get(email);
		if(user!=null) {
			if(pswd.equalsIgnoreCase(user.getPswd())){
				return user;
			}
		};	
		
		return null;
	};

}
