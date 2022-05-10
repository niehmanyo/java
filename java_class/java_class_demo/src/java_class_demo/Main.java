package java_class_demo;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
            String a="a";
            String a1 = a+1; //
        // 现在字符常量区里找到a，存在，就不创建新的，然后+1 就把 “a1” 放在栈区
            String a2 = "a1";
        System.out.println(a1==a2);
            String x1 = getString();
            String x2 = getString()+2;
        System.out.println(x1.getClass());
        System.out.println(x2.getClass());
    }
    private  static  String getString()
    {
        return "c";
    }
}
