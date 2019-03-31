package com.yundepot;

import com.yundepot.bean.SimpleBean;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


/**
 * @author zhaiyanan
 * @date 2019/3/31 13:52
 */
public class BeanFactoryTest {



	@Test
	public void defaultListableBeanFactoryTest() {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

		beanFactory.getBean(SimpleBean.class).send();
	}
}
