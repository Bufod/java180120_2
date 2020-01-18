package com.company;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Получено: "
                + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        System.out.println("Отправлено: "
                + n);
    }
}
