package java_class_demo;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ST<String,Integer> string_table = new ST<>();
        System.out.println(string_table.size);
        string_table.add("niewenyu",123);
        string_table.add("niewenyu",123);
        string_table.add("niewenyu1",123);
        System.out.println(string_table.size);
        string_table.PrintKey();
        
    }
}

