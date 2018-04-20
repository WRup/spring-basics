package com.ch01.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestBeanFactory {

    public static void main(String[] args){

//        BeanFactory beanFactory = new XmlBeanFactory(
//                new ClassPathResource("beans_classpath.xml"));
        BeanFactory beanFatory1 = new XmlBeanFactory(new
                FileSystemResource("d:\\beans_fileSystem.xml"));
        System.out.println("beanFactory created successfully");

    }
}
