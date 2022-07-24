package com.atguigu.demoreactor.reactor8;

import java.util.Observable;

/**
 * @author cuikai
 * @date 2022/5/30 17:44:36
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        observerDemo.addObserver((o,arg)->{
            System.out.println("发生了变化");
        });observerDemo.addObserver((o,arg)->{
            System.out.println("收到了被观察者通知，准备改变");
        });
        observerDemo.setChanged();
        observerDemo.notifyObservers();
    }

}
