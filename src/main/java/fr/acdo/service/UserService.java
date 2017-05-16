package fr.acdo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import fr.acdo.constantes.Constantes;
import fr.acdo.domain.Family;
import fr.acdo.domain.Role;
import fr.acdo.domain.User;
import fr.acdo.repository.UserDao;

@Service
public class UserService {

	private UserDao userDao;
	private Role monRole;
	private Family maFamille;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	public User getById(@PathVariable Long id) {
		return userDao.findOne(id);
	}

	public String addUser(String firstName, String birthday) {

		Role newRole = new Role();
		newRole.setId(Constantes.ID_ROLE_ADMIN);
		newRole.setName(Constantes.ROLE_ADMIN);

		Family newFamily = new Family();
		newFamily.setId((long) 1);
		newFamily.setName("Mouse");

		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setBirthday(birthday);
		newUser.setRoletest(newRole);
		newUser.setFamilytest(newFamily);
		userDao.save(newUser);

		return "Sauvé :)";
	}

	public String createAccount(String familyName, String firstName, String email, String password, Long id) {
		Role newRole = new Role();
		newRole.setId(Constantes.ID_ROLE_ADMIN);
		newRole.setName(Constantes.ROLE_ADMIN);

		Family newFamily = new Family();
		// newFamily.setId(id);
		newFamily.setName(familyName);

		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setEmail(email);
		newUser.setPassword(password);

		newUser.setRoletest(newRole);
		newUser.setFamilytest(newFamily);
		userDao.save(newUser);

		return "Creation du compte ok!";
	}
}
