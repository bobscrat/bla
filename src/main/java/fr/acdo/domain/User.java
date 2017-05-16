package fr.acdo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;

	private String birthday;

	private String email;

	// @Pattern(regexp="^[a-zA-Z]+([\.-]?[a-zA-Z]+)*@[a-zA-Z]+([\.-]?[a-zA-Z]+)*(\.[a-zA-Z]{2,3})+$")
	private String password;

	private String active;

	private String image;

	@ManyToOne
	@JoinColumn(name = "Role_id")
	// @JsonManagedReference
	private Role roletest;

	@ManyToOne
	@JoinColumn(name = "Family_id")
	private Family familytest;

}
