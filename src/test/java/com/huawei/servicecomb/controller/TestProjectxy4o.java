package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectxy4o {

        Projectxy4oDelegate projectxy4oDelegate = new Projectxy4oDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectxy4oDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}