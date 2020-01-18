package com.company;

public class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель")
                .start();
    }

    @Override
    public void run() {
        while (q.get() < 10){
//            q.get();
        }
    }
}
