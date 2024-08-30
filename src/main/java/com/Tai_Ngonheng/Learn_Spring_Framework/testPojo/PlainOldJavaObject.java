package com.Tai_Ngonheng.Learn_Spring_Framework.testPojo;
public class PlainOldJavaObject {
    static class First{
        private String name;
        private int age;

        public String fromFirst(){
            return name+":"+age;
        }
    }

    public static void main(String[] args) {
        First importfirst = new First();



        System.out.println(importfirst);
    }
}
