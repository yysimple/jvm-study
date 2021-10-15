package com.simple.test;

/**
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2021-09-25 19:26
 **/
public class MyObject {
    public static int staticVar;
    public int instanceVar;

    public static void main(String[] args) {
        int x = 32768; // ldc
        MyObject myObj = new MyObject(); // new
        MyObject.staticVar = x; // putstatic
        x = MyObject.staticVar; // getstatic
        myObj.instanceVar = x; // putfield
        x = myObj.instanceVar; // getfield
        Object obj = myObj;
        if (obj instanceof MyObject) { // instanceof
            myObj = (MyObject) obj; // checkcast
            System.out.println(myObj.instanceVar);
        }
    }

}
