package com.yundepot;

import com.yundepot.bean.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author zhaiyanan
 * @date 2019/3/31 20:50
 */
public class UserTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("user.xml"));

		User user = (User) beanFactory.getBean("testbean");
		System.out.println(user.getEmail());
		System.out.println(user.getUserName());

	}
}
