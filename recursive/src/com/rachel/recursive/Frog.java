package com.rachel.recursive;

import org.junit.Test;

/**
 * 题目：一只青蛙可以一次跳 1 级台阶或一次跳 2 级台阶,例如:
 * 跳上第 1 级台阶只有一种跳法：直接跳 1 级即可。跳上第 2 级台阶
 * 有两种跳法：每次跳 1 级，跳两次；或者一次跳 2 级。
 * 问要跳上第 n 级台阶有多少种跳法？
 * @author wangyx
 * @see Frog
 * @since 2020/1/20
 */
public class Frog {

    /**
     *  1.定义一个函数，这个函数代表了跳上n级台阶的跳法
     *  2.寻找问题与子问题之间的关系，这两者之前的关系确实看不出什么头绪，但仔细看题目，
     *  一只青蛙只能跳一步或两部台阶，自上而下思考，也就是说如果要跳到n级台阶只能从n-1或者n-2级跳
     *  所以问题就转换为跳上n-1和n-2级台阶的跳法了
     */

    public int jump(int n){
        if(n ==  1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return jump(n-1) + jump(n-2);
    }

    @Test
    public void test(){
        int n = 100;
        int result = jump(n);
        System.out.println(result);
    }
}
