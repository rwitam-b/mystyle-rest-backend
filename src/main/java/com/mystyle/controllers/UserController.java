package com.mystyle.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class UserController {
	@RequestMapping("/passwordHash")
	public String getAllProducts() {
		// Create instance
		Argon2 argon2 = Argon2Factory.create();
		List<String> passwords = new ArrayList<>();
		List<String> passwordHashes = new ArrayList<>();
		passwords.add("Password");
		passwords.add("Password2");
		passwords.add("Password3");
		passwords.add("Password4");

		try {
			// Hash password
			for (String password : passwords) {
				passwordHashes.add(argon2.hash(2, 65536, 1, password.toCharArray()));

			}
		} catch (Exception e) {
			System.out.println("failed");
		}
		for (String passwordHash : passwordHashes) {
			System.out.println(passwordHash);
		}
		return passwordHashes.toString();
	}
}
