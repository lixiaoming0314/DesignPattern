package com.ycx.mode.observer;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public interface Subject {

    void add(Observer observer);

    void delete(Observer observer);

    void notifyObserver();

    void operation();
}
