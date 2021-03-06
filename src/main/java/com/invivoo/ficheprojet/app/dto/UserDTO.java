package com.invivoo.ficheprojet.app.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class UserDTO {

    public static final int PASSWORD_MIN_LENGTH = 5;
    public static final int PASSWORD_MAX_LENGTH = 100;

    @Pattern(regexp = "^[a-z0-9]*$")
    @NotNull
    @Size(min = 1, max = 100)
    private String login;

    @NotNull
    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    @Size(max = 100)
    private String firstName;

    @Size(max = 100)
    private String lastName;

    @Email
    @Size(min = 5, max = 100)
    private String email;

    private List<String> roles;

    public UserDTO() {
    }

    public UserDTO(String login, String password, String firstName, String lastName, String email, List<String> roles) {
	this.login = login;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.roles = roles;
    }

    public String getPassword() {
	return password;
    }

    public String getLogin() {
	return login;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public String getEmail() {
	return email;
    }

    public List<String> getRoles() {
	return roles;
    }

}
