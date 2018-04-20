package com.ch01.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestFileSystemApplicationContext {
    public static void main(String[] args)
    {
        try{
            ApplicationContext context = new
                    FileSystemXmlApplicationContext("d:\\beans_fileSystem.xml");
            System.out.println("container created successfully");
        }
        catch (BeansException e){
            e.printStackTrace();
        }
    }

}
