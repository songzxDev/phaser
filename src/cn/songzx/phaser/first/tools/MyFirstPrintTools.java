/**   
* @Title: MyFirstPrintTools.java 
* @Package cn.songzx.phaser.first.tools 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午8:49:51 
* @version V1.0   
*/
package cn.songzx.phaser.first.tools;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyFirstPrintTools
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午8:49:51
 * 
 */
public class MyFirstPrintTools {

	public static Phaser phaser;

	public static void methodA() {
		System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
		/*
		 * 方法arriveAndAwaitAdvance()的作用与CountDownLatch类中的await()方法大体一致，
		 * 通过从方法名称解析看，arrive是到达的意思，wait是等待的意思，advance是前进，促进的意思，
		 * 所以执行这个方法的作用是当前线程已经到达屏障，在此等待一段时间，等条件满足后继续向 下一个屏障继续执行。
		 */
		phaser.arriveAndAwaitAdvance();
		System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());

		System.out.println(Thread.currentThread().getName() + " A2 begin=" + System.currentTimeMillis());
		phaser.arriveAndAwaitAdvance();
		System.out.println(Thread.currentThread().getName() + " A2   end=" + System.currentTimeMillis());
	}

	public static void methodB() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
			Thread.sleep(5000L);
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());

			System.out.println(Thread.currentThread().getName() + " A2 begin=" + System.currentTimeMillis());
			Thread.sleep(5000L);
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + " A2   end=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void methodC() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
			Thread.sleep(5000L);
			phaser.arriveAndAwaitAdvance();// 计数不足时，arriveAndAwaitAdvance()方法会导致线程呈现阻塞状态
			System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void methodD() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
			Thread.sleep(5000L);
			System.out.println("A: " + phaser.getRegisteredParties());
			phaser.arriveAndDeregister();// 方法arriveAndDeregister()的作用是使当前线程退出比赛，并使parties值减一
			System.out.println("B: " + phaser.getRegisteredParties());
			System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
