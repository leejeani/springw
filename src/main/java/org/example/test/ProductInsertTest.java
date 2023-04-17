package org.example.test;

import org.example.frame.Service;
import org.example.vo.ProductVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ProductVO> service =
				(Service<Integer,ProductVO>) factory.getBean("pservice");
		
		ProductVO p = new ProductVO(100, "pants", 10000);
		service.register(p);
	}

}






