package ch05.ex07;

import java.util.Arrays;
import java.util.List;

import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers(new int[] {1,2});
		users.forEach(System.out::println);
		System.out.println();
		
		users = mapper.selectUsers2(Arrays.asList("john", "king"));
		users.forEach(System.out::println);
	}
}
