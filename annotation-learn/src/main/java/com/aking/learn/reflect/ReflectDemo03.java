package com.aking.learn.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-27
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        //直接创建对象
        Children children = new Children();
        Class c = Class.forName("com.aking.learn.reflect.Children");

        //访问私有方法
        //getDeclaredMethod可以获取到所有方法，而getMethod只能获取public
        Method method = c.getDeclaredMethod("say", String.class);

        //压制Java对访问修饰符的检查
        method.setAccessible(true);

        //调用方法children为所在对象
        method.invoke(children, "hello world");

        //访问私有属性
        Field field = c.getDeclaredField("name");

        field.setAccessible(true);

        //为属性设置值children为所在对象
        field.set(children, "WalkingDog");

        System.out.println("The Value Of The Field is : " + children.getName());


    }
}


class Children {
    private String name;

    /**
     * 每个JavaBean都应该实现无参构造方法
     */
    public Children() {
    }

    public String getName() {
        return name;
    }

    private void say(String message) {
        System.out.println("You want to say : " + message);
    }
}

