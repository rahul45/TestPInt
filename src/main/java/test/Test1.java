package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        s2=s2.intern();
        System.out.println(s1==s2);

        List<String> list = new LinkedList<>();

        System.out.println(s1.equals(s2));
    }

    public void test(){

        try{

        }finally {
            System.out.printf("Finally");
        }
    }
}
