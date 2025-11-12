package com.nit.main;

import com.nit.demo.ArithmeticOperationDemo2;
import com.nit.demo.ArithmeticOperations;

public class App
{
    public static void main(String[] args) 
    {
    	ArithmeticOperations aop = new ArithmeticOperations();
    	System.out.println("sum of two numbers is: "+aop.sumOfTwoNumbers(10, 20));
//      System.out.println("Hello World!");
    	ArithmeticOperationDemo2 aop2 = new ArithmeticOperationDemo2();
    	System.out.println("Product of two numbers: "+aop2.productOfTwoNum(10, 20));
    }
}
