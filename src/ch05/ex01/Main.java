package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
		System.out.println(user);
		
		user = mapper.selectUser(new Search("john", new Post("정의", null)));
		System.out.println(user);
		
		user = mapper.selectUser(new Search("john", new Post(null, "연결")));
		System.out.println(user);
		
		user = mapper.selectUser(new Search("john", new Post("정의", "")));
		System.out.println(user);
		
//		user = mapper.selectUser(null); // error
//		System.out.println(user);
	}
}
