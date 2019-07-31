package com.xiedaimala.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> gender= new HashMap<String,String>();// 哈希表实现的一个Map，声明一个哈希表
        //每个人对应的性别

        //增
        gender.put("Yves","male");
        gender.put("Yvnnoe","female");
        gender.put("carl","male");

        //查
        if(gender.containsKey("Yves")){
            System.out.println(gender.get("Yves"));
        }
        String result = gender.get("Yves");
        if(result != null){
            System.out.println(result);
        }

        //改 和增是一样的，只是同样的键值会覆盖

        gender.put("fly","male");

        //删
        gender.remove("fly");

        //栈
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(3);
        stack.push(5);

        System.out.println(stack.pop());//5
        System.out.println(stack.pop());//3
        //只看顶部但是不删除
        stack.peek();
        //检查是否为空

        stack.empty();


        //队列
        //Queuews是一个接口，不能实例化
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(3);
        queue.add(6);

        System.out.println(queue.poll());//3
        System.out.println(queue.poll());//6

        queue.isEmpty();
    }
}
