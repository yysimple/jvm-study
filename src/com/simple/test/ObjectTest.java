package com.simple.test;

/**
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2021-10-04 12:25
 **/
public class ObjectTest {
    public static void main(String[] args) {
        Object obj1 = new ObjectTest();
        Object obj2 = new ObjectTest();
        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj1));
    }
}
