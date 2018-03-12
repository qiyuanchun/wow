package com.qycDo.app.wow.test.ioTest;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qiyuanchun on 18/3/12.
 */
public class TraditionalSocketDemo {


    /**
     *
     * 阻塞
     * 调用结果返回之前,当前线程会被挂起。方法(函数)只有在得到结果之后才会返回。
     *
     * 做某件事情,直到完成,除非超时否则一直等待。
     *
     *
     * 非阻塞
     * 指在不能立刻得到结果之前,该方法不会阻塞当前线程,而会立刻返回;
     * 尝试去做,如果不能做,就不做(直接返回),如果能做,就做。
     */


    /**
     * 传统IO阻塞点
     *  1.Socket socket = serverSocket.accept();
     *  2. int data = is.read(b);
     *
     *
     *  现象:
     *  当前服务端只能为一个客户端服务
     *
     */

    public static void main(String[] args) throws IOException {
        ExecutorService threadPool = Executors.newCachedThreadPool();


        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务端启动...端口 7777");


        while (true){
            //获取socket客户端套接字
             final  Socket socket = serverSocket.accept();

             threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("有新客户连接上。。。。");
                        //获取客户端输入流
                        InputStream is = socket.getInputStream();
                        byte[] b = new byte[1024];
                        while (true){
                            //循环读取数据
                            int data = is.read(b);
                            if (data != -1){
                                String info = new String(b,0,data,"GBK");
                                System.out.println(info);
                            }else {
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });


        }
    }



}



