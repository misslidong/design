package com.lee.design.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类是不会加载内部类，这样可以实现懒加载
 */
public class InnerClass {
    private InnerClass() {}

    private static class InnerOrder {
        private final static InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return InnerOrder.INSTANCE;
    }
}
