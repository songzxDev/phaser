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
public class MySixthThreadB extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午8:16:59
	 * @Title: MySixthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySixthThreadB(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
		phaser.arriveAndAwaitAdvance();
		System.out.println(Thread.currentThread().getName() + " A1  end=" + System.currentTimeMillis());
	}
}
