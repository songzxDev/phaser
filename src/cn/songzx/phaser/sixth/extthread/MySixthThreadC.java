/**   
* @Title: MySixthThreadA.java 
* @Package cn.songzx.phaser.sixth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午8:16:41 
* @version V1.0   
*/
package cn.songzx.phaser.sixth.extthread;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MySixthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午8:16:41
 * 
 */
public class MySixthThreadC extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午8:16:59
	 * @Title: MySixthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySixthThreadC(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
			Thread.sleep(3000L);
			/*
			 * 方法awaitAdvance(int phase)的作用是：如果传入参数phase的值和当前getPhase()方法返回值一样，
			 * 则在屏障处等待，否则继续向下运行，有些类似于旁观者的作用，当观察的条件满足了就等待（旁观），如果 条件不满足，则程序继续向下运行。
			 */
			phaser.awaitAdvance(0);// 跨栏的栏数，并不参与parties计数的操作，仅仅具有判断的功能
			System.out.println(Thread.currentThread().getName() + " A1  end=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
