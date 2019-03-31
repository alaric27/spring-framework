package com.yundepot;

import com.yundepot.bean.SimpleBean;
import com.yundepot.bean.Student;
import com.yundepot.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


/**
 * @author zhaiyanan
 * @date 2019/3/31 13:52
 */
public class BeanFactoryTest {

	private DefaultListableBeanFactory  beanFactory = null;

	@Before
	public void before() {
		beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
	}


	@Test
	public void defaultListableBeanFactoryTest() {


		SimpleBean simpleBean = beanFactory.getBean(SimpleBean.class);
		System.out.println(beanFactory.getBeanDefinition("simpleBean").getAttribute("abc"));
	}

	@Test
	public void studentTest() {
		System.out.println(beanFactory.getBean(Student.class).getUserInfo().getName());
	}

}
