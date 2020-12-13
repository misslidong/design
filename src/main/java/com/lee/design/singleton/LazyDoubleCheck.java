package com.lee.design.singleton;

/**
 * 懒汉式
 * 双重检验(效率较方法加锁高，同时解决线程不安全)
 */
public class LazyDoubleCheck {

    private static volatile LazyDoubleCheck INSTANCE;

    private LazyDoubleCheck(){};

    public static LazyDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyDoubleCheck.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new LazyDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
