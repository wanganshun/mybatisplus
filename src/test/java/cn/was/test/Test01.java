package cn.was.test;

import cn.was.entity.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.rmi.runtime.Log;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @program: mybatisplus01
 * @author: WangAnShun
 * @create: 2022-08-19 17:51
 **/

@Slf4j(topic = "c.Test")
public class Test01 {
    static int r=0;

    public static void main(String[] args) throws InterruptedException {
         test1();

    }
    private static void test1() throws InterruptedException {
        log.debug("开始");
        Thread t1 = new Thread(() -> {
            log.debug("开始");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            log.debug("结束");
            r=10;

        },"t1");

        t1.start();
        t1.join();
        log.debug("结果为:{}",r);
        log.debug("结束");


    }


   private static void method1(int x){
        int y=x+1;
       Object m = method2();
       System.out.println(m);



   }
   private static Object method2(){
       Object n = new Object();
       return n;


   }


}
