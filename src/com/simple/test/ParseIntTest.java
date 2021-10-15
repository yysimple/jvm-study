package com.simple.test;

/**
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2021-10-04 20:35
 **/
public class ParseIntTest {
    public static void main(String[] args) {
        foo(args);
    }

    private static void foo(String[] args) {
        try {
            bar(args);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void bar(String[] args) {
        if (args.length == 0) {
            throw new IndexOutOfBoundsException("no args!");
        }
        int x = Integer.parseInt(args[0]);
        System.out.println(x);
    }
}
