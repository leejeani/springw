package org.example.test;

import java.util.List;

import org.example.frame.Service;
import org.example.vo.UserVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, UserVO> service =
				(Service<String, UserVO>) factory.getBean("uservice");
		
		List<UserVO> list = null;
		list = service.get();
		
		for (UserVO userVO : list) {
			System.out.println(userVO);
		}
		
	}

}






