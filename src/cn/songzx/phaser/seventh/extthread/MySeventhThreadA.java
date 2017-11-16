/**   
* @Title: MySeventhThreadA.java 
* @Package cn.songzx.phaser.seventh.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午8:29:53 
* @version V1.0   
*/
package cn.songzx.phaser.seventh.extthread;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MySeventhThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午8:29:53
 * 
 */
public class MySeventhThreadA extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午8:30:25
	 * @Title: MySeventhThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySeventhThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
		phaser.awaitAdvance(0);
		System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());
	}
}
