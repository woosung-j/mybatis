package ch02.ex03;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		if(mapper.insertUser(new User(11, "abel", LocalDate.now())) > 0) {
			System.out.println("����");
		} 
		
		if(mapper.insertUserNull(new User(12, null, null)) > 0) {
			System.out.println("����");
		}
		
		if(mapper.insertUser2(13, "Kianu", LocalDate.of(2022, 8, 11)) > 0) {
			System.out.println("����");
		}
		
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0) {
			System.out.println("����");
		}
	}
}
