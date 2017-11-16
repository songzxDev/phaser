/**   
* @Title: MySeventhThreadD.java 
* @Package cn.songzx.phaser.seventh.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:05:00 
* @version V1.0   
*/
package cn.songzx.phaser.seventh.extthread;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName: MySeventhThreadD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:05:00
 * 
 */
public class MySeventhThreadD extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午9:05:16
	 * @Title: MySeventhThreadD.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySeventhThreadD(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
			/*
			 * 方法awaitAdvanceInterruptibly(int,long,TimeUnit)
			 * 的作用是在指定的栏数等待最大的单位时间，如果在指定的时间内，栏数未变，则出现异常，否则继续向下运行。
			 */
			phaser.awaitAdvanceInterruptibly(0, 5, TimeUnit.SECONDS);
			System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
