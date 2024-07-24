package com.minhaAula.aulaSpring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.minhaAula.aulaSpring.entities.User;
import com.minhaAula.aulaSpring.repositories.UserRepository;

@Configuration//diz para o Spring que esta classe e para configuraçao
@Profile("test")/*roda esta configuração somente no perfil: test*/
public class testConfig implements CommandLineRunner {
	@Autowired		
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
User u1= new User(null, "maria Brown","maria@gmail.com", "988888888", "12345");
User u2 = new User(null, "Alex Green","alex@gmail.com","984781543","123456");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
