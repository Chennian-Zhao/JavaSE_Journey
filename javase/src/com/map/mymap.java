package com.map;
import java.util.TreeMap;
public class mymap {
    public static void main(String[] args) {
       TreeMap<Student,String> tm = new TreeMap<>();
       Student s1 = new Student("zhangsan",323);
       Student s2 = new Student("fli",232);


       tm.put(s1,"jiangsu1");
       tm.put(s2,"jigewe");
       System.out.println(s1);
        System.out.println(s2);
    }


}