package com.dragon.cate.service.learn.algorithm;

/**
 * 异或运算符满足
 * 1. 归零律：a ⊕ a = 0
 * 2. 恒等律：a ⊕ 0 = a
 * 3. 交换律：a ⊕ b = b ⊕ a
 * 4. 结合律：a ⊕b ⊕ c = a ⊕ (b ⊕ c) = (a ⊕ b) ⊕ c;
 * 5. 自反：a ⊕ b ⊕ a = b.
 * 6. d = a ⊕ b ⊕ c 可以推出 a = d ⊕ b ⊕ c.
 */
public class ABSwap {

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("four operation swap result is = a = " + a + ", b = " + b);
    }

    public static void bitSwap(int a, int b) {
        a = a ^ b;
        //b =  a ^ b ^ b = a, 因为 b ^ b =0 的归零律,所以在此异或后,b=a
        b = a ^ b;
        a = a ^ b;
        System.out.println("bit operation swap result is = a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 11, b = 22;
        swap(a, b);
        bitSwap(a, b);
    }
}
