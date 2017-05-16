package fr.acdo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.acdo.domain.User;
import fr.acdo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	private UserService user;

	public UserController(UserService user) {
		this.user = user;
	}

	@GetMapping("/users")
	public List<User> listUser() {
		List<User> listOfUser = null;

		try {
			listOfUser = user.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfUser;
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		User myUser = null;

		try {
			myUser = user.getById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myUser;
	}

	@PostMapping("/user/save")
	public String addUser(@RequestParam String firstName, @RequestParam String birthday) {
		return user.addUser(firstName, birthday);
	}

	@PostMapping("/create")
	public String createUser(@RequestParam String familyName, @RequestParam String firstname,
			@RequestParam String email, @RequestParam String password, Long id) {
		return user.createAccount(familyName, firstname, email, password, id);
	}
}
