package org.example.test;

import org.example.frame.Service;
import org.example.vo.UserVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, UserVO> service =
				(Service<String, UserVO>) factory.getBean("uservice");
		
		UserVO u = new UserVO("id01", "pwd01", "lee");
		service.register(u);
	}

}






