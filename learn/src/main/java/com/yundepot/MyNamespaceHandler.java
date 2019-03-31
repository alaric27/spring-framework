package com.yundepot;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author zhaiyanan
 * @date 2018/10/8 21:03
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
