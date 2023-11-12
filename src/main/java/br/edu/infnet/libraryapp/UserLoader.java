package br.edu.infnet.libraryapp;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.libraryapp.model.business.User;
import br.edu.infnet.libraryapp.model.service.UserService;

@Order(8)
@Component
public class UserLoader implements ApplicationRunner {

	@Autowired
	private UserService userService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/user.txt");
		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();
		String[] fields = null;

		while (line != null) {

			fields = line.split(";");

			User user = new User();
			user.setEmail(fields[0]);
			user.setName(fields[1]);
			user.setPswd(fields[2]);
			
			userService.insert(user);

			line = reader.readLine();

		}

		reader.close();
	}
}
