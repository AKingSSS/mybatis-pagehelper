package com.aking.learn.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-27
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是" + person.name);
        // 方式一
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());
        // 方式二
        Class c2 = Class.forName("com.aking.learn.reflect.Student");
        System.out.println(c2.hashCode());
        // 方式三
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        Class c4 = Integer.TYPE;
        System.out.println(c4);

        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    public String name;
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}