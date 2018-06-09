package com.qycDo.app.wow.test.TaskTest;

public  class Task  {

    public void task1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ss");
            }
        };

    }
    
    public static void main(String[] args) {
        new Task().task1();
    }
}
