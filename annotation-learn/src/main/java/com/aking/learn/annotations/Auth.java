package com.aking.learn.annotations;

import com.aking.learn.enums.ApplicationTypeEnum;

import java.lang.annotation.*;

/**
 * @author Y10003453
 */
@Documented//可以被例如 javadoc 此类的工具文档化
@Target({ElementType.METHOD, ElementType.TYPE}) // 类&方法
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
    /**
     * 是否必须登录，默认是。
     * 如果没有默认，则必须传。
     * 注意：这是注解的参数：参数类型 + 参数名()
     */
    boolean requireLogin() default true;

    /**
     * 应用类型
     * @return
     */
    ApplicationTypeEnum applicationType();
}
