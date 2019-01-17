package com.dragon.cate.service.learn.StringDemo;

public class StringIntern {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a";
        String s3 = "bc";
        String s4 = new String("abc");
        String s5 = s1.intern();
        String s6 = s2 + s3;

        // false
        System.out.println("s1==s4 = [" + (s1 == s4) + "]");

        // true
        System.out.println("s1==s4.intern = [" + (s1 == s4.intern()) + "]");

        // true
        System.out.println("s1==s5 = [" + (s1 == s5) + "]");

        // false
        System.out.println("s1==s6 = [" + (s1 == s6) + "]");

        // true
        System.out.println("s4==s5 = [" + (s4 == s5) + "]");

        // true
        System.out.println("s4.intern==s5 = [" + (s4.intern() == s5) + "]");

        // false
        System.out.println("s4==s6 = [" + (s4 == s6) + "]");

        // false
        System.out.println("s5==s6 = [" + (s5 == s6) + "]");

        // true
        System.out.println("s5.intern==s6.intern = [" + (s5 == s6.intern()) + "]");
    }
}
