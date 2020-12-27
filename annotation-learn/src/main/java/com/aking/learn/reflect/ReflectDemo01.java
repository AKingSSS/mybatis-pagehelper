package com.aking.learn.reflect;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-27
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.aking.learn.pojo.Student");
        Class c2 = Class.forName("com.aking.learn.pojo.Student");
        Class c3 = Class.forName("com.aking.learn.pojo.Student");
        // 一个类中只有一个class对象
        // 一个类被加载后，类的整个结构都会被封印到class对象中
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("c1.hashcode = " + c1.hashCode());
        System.out.println("c2.hashcode = " + c2.hashCode());
        System.out.println("c3.hashcode = " + c3.hashCode());

    }
}
