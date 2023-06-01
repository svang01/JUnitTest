package org.example;

public class MethodReturnType {
    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(num());
        System.out.println(boo());
    }
    public static String text() {
        return "Java is Okay";
    }
    public static double num() {
        return 3.14;
    }
    public static boolean boo() {
        return false;
    }
}
