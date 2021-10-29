package com.simple.gc;

import java.util.ArrayList;

/**
 * 功能描述: 测试
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author: WuChengXing
 * @create: 2021-10-19 00:13
 **/
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<OOMTest> list = new ArrayList<>();

        int count = 0;
        try {
            while (true) {
                list.add(new OOMTest());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
