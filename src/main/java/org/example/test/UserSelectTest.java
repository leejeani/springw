package org.example.test;

import org.example.frame.Service;
import org.example.vo.UserVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, UserVO> service =
				(Service<String, UserVO>) factory.getBean("uservice");
		
		UserVO user = null;
		user = service.get("id01");
		
		System.out.println(user);
	}

}






