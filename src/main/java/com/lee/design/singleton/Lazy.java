package com.lee.design.singleton;

/**
 * 懒汉式
 * 虽然达到按需初始化的目的，但带来线程不安全的问题
 */
public class Lazy {
    private static Lazy INSTANCE;

    private Lazy(){};

    public static Lazy getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Lazy();
        }
        return INSTANCE;
    }
}
