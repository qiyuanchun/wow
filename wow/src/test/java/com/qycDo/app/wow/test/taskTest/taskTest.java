package com.qycDo.app.wow.test.TaskTest;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by qiyuanchun on 18/1/21.
 */
public class taskTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            new Timer("timer -" + i).schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "run" );
                }
            },1000);




        }


    }
}
