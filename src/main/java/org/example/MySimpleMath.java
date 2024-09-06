package org.example;

public class MySimpleMath {

    public String checkSign(int number) {
        if (number >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
    public double divide(int num,int demo){
        if(demo == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }else{
            return num/(double)demo;
        }
    }
}