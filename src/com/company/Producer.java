package com.company;

public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик")
                .start();
    }

    @Override
    public void run() {
        int i = 0;

        while (i < 11){
            q.put(i++);
        }
    }
}
