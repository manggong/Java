package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("init!!!");
		
		UserBean userBean = (UserBean)ac.getBean("userBean");
		userBean.setName("kim");
		
		System.out.println(userBean.getName());
	}
	
}
