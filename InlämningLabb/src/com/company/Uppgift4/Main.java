package com.company.Uppgift4;

import java.util.List;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("hej");
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            int i, count;
            int n = 350000;

            for(int j = 2; j <= n; j++) {
                count = 0;

                for(i = 1; i <= j; i++) {
                    if(j % i == 0) {
                        count++;
                    }
                }

                if(count == 2)
                    System.out.print(j + "  ");
            }

        });


        Thread thread2 = new Thread(() -> {

            int u, count2;
            int o = 500000;

            for(int k = 350001; k <= o; k++) {
                count2 = 0;

                for(u = 1; u <= k; u++) {
                    if(k % u == 0) {
                        count2++;
                    }
                }

                if(count2 == 2)
                    System.out.print(k + "  ");
            }

        });


        thread1.start();
        thread2.start();

    }

}
