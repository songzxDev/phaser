/**   
* @Title: MyNinthThreadA.java 
* @Package cn.songzx.phaser.ninth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:27:35 
* @version V1.0   
*/
package cn.songzx.phaser.ninth.extthread;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyNinthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:27:35
 * 
 */
public class MyNinthThreadA extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午9:27:51
	 * @Title: MyNinthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MyNinthThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
		phaser.arriveAndAwaitAdvance();
		System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());
	}
}
