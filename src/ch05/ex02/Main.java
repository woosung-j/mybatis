package ch05.ex02;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", new Post(null, null)));
		System.out.println(user);
		
		user = mapper.selectUser(new Search("john", new Post("정의", null)));
		System.out.println(user);
		
		user = mapper.selectUser(new Search("john", new Post(null, "연결")));
		System.out.println(user);
	}
}
