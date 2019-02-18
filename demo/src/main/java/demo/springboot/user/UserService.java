package demo.springboot.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		
		//List<User> users = new ArrayList<>();
		//call aadhar details
		return (List<User>) userRepository.findAll();
		
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}
	
	public boolean addUser(User user) {
		if(user != null) {
			userRepository.save(user);
			return true;
		}
		return false;
	}
}
