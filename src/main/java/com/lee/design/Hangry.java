package com.lee.design;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单使用，推荐使用
 * 唯一群缺点，不管用到与否，类装载是就完成实例化
 */
public class Hangry {
    private static final Hangry INSTANCE = new Hangry();

    private Hangry(){};

    public static Hangry getInstance() {return INSTANCE;}

    public static void main(String[] args) {
        Hangry h1 = Hangry.getInstance();
        Hangry h2 = Hangry.getInstance();

        System.out.println(h1 == h2);
    }
}
