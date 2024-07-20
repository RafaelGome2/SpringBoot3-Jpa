package com.minhaAula.aulaSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaAula.aulaSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class userResource {
	@GetMapping
		public ResponseEntity<User> findAll(){
			User u1= new User(1l, "ALex", "Alex@gmail.com", "(41)984778000","123" ) ;
			return ResponseEntity.ok().body(u1);
			
			
		}
}
