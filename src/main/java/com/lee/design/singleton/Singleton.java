package com.lee.design.singleton;

/**
 * 单例模式
 *
 */
public class Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new Thread(()->{
                hangry();
//                lazy();
//                lazySync();
//                lazyDoubleCheck();
//                innerClass();
//                enumSingle();
            }).start();
        }
    }

    /**
     * 饿汉式
     * 类加载到内存后，就实例化一个单例，JVM保证线程安全
     * 简单使用，推荐使用
     * 唯一群缺点，不管用到与否，类装载是就完成实例化
     */
    public static void hangry() {
        System.out.println(Hangry.getInstance().hashCode());
    }
    /**
     * 懒汉式
     * 虽然达到按需初始化的目的，但带来线程不安全的问题
     */
    public static void lazy() {
        System.out.println(Lazy.getInstance().hashCode());
    }
    /**
     * 懒汉式-加锁
     * 保证线程安全
     * 缺点：效率变低
     */
    public static void lazySync() {
        System.out.println(LazySync.getInstance().hashCode());
    }
    /**
     * 懒汉式
     * 双重检验(效率较方法加锁高，同时解决线程不安全)
     */
    public static void lazyDoubleCheck() {
        System.out.println(LazyDoubleCheck.getInstance().hashCode());
    }

    /**
     * 静态内部类方式
     * JVM保证单例
     * 加载外部类是不会加载内部类，这样可以实现懒加载
     */
    public static void innerClass() {
        System.out.println(InnerClass.getInstance().hashCode());
    }
    /**
     * 枚举
     * 不仅可以解决线程同步，还可以防止反序列化
     */
    public static void enumSingle() {
        System.out.println(EnumSingle.INSTANCE.hashCode());
    }
}
