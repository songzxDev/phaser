/**   
* @Title: MyForthThreadA.java 
* @Package cn.songzx.phaser.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月14日 下午8:11:09 
* @version V1.0   
*/
package cn.songzx.phaser.forth.extthread;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyForthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月14日 下午8:11:09
 * 
 */
public class MyForthThreadA extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月14日下午8:13:41
	 * @Title: MyForthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MyForthThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
		phaser.arriveAndAwaitAdvance();
		System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());
	}
}
