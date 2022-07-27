package ch05.ex03;

import java.util.List;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers(new Search(null, null));
		users.forEach(System.out::println);
		System.out.println();
		
		users = mapper.selectUsers(new Search("john", null));
		users.forEach(System.out::println);
		System.out.println();
		
		users = mapper.selectUsers(new Search(null, new Post("����", null)));
		users.forEach(System.out::println);
		System.out.println();
		
		users = mapper.selectUsers(new Search(null, new Post(null, "��")));
		users.forEach(System.out::println);
		System.out.println();
	}
}
