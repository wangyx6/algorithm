package com.rachel.recursive;

import org.junit.Test;

/**
 * 主要使用递归求解阶乘
 * 题目：输入一个正整数n，输出n!的值。其中n!=123*…*n,即求阶乘
 * @author wangyx
 * @see Factorial
 * @since 2020/1/20
 */
public class Factorial {

    //

    /**
     * 1.定义一个函数，明确这个函数的功能，我们知道这个函数
     * 的功能是求n的阶乘，之后求n-1，n-2的阶乘就可以调用此函数了
     *
     * 2.寻找问题与子问题的关系，阶乘的关系比较简单，我们以f(n)来表示阶乘，
     * 显然f(n)=n*f(n-1),同时临界条件是f(1)=1
     *
     * 3.将第二步递推出来的公式用代码表示出来补充到步骤一定义的函数中
     *
     */
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    @Test
    public void test(){
        int n = 10;
        int result = factorial(n);
        System.out.println(result);
    }
}
