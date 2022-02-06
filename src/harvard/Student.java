package harvard;
import java.util.HashMap;
import java.util.Date;
import java.util.Iterator;

import java.util.*;
// 全部import


public class Student {

    public void greet() {
    // 要設定成public 才能被其他包調用
        System.out.println("Hello, I'm a student from Harvard.");
    }    

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("BMW", 10000);
        map.put("Tyota", 5000);
        System.out.println(map.get("BMW")); // 10000
        System.out.println(map.get("Tyota")); // 5000
    }    
}
