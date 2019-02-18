package demo.springboot.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hi";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public String getUser(@RequestBody User user) {
		boolean isUserAdded = userService.addUser(user);
		return isUserAdded ? "Added Successfully" : "Not Added Usefully";
	}
}
