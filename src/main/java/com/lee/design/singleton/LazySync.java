package com.lee.design.singleton;

/**
 * 懒汉式-加锁
 * 保证线程安全
 * 缺点：效率变低
 */
public class LazySync {

    private static LazySync INSTANCE;

    private LazySync(){};

    public static synchronized LazySync getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new LazySync();
        }
        return INSTANCE;
    }
}
