package br.edu.infnet.libraryapp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.libraryapp.model.business.User;
import br.edu.infnet.libraryapp.model.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	Map<String, User> userMap = new HashMap<String, User>();

	public Collection<User> getUser() {
		
		return (Collection<User>) userRepository.findAll();
	};
	
	public void insert(User user) {
		
		userRepository.save(user);
		
		userMap.put(user.getEmail(), user);
	};
	
	public void delete(Integer id) {
		
		userRepository.deleteById(id);
	};
	
	public User validate(String email, String pswd) {
		
//		User users = userRepository.findByEmail(email);
		
		User user = userMap.get(email);
		if(user!=null) {
			if(pswd.equalsIgnoreCase(user.getPswd())){
				return user;
			}
		};	
		
		return null;
	};

}
