package ch02.ex02;

import java.time.LocalDate;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map map = Configuration.getMapper(Map.class);
		
		System.out.println(map.selectUser(1));
		System.out.println(map.selectUser2("terry"));
		
		// 과제] john을 조회하라.
		System.out.println(map.selectUser3(LocalDate.of(2022, 7, 22)));
	}
}
