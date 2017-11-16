/**   
* @Title: MySeventhThreadC.java 
* @Package cn.songzx.phaser.seventh.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:00:11 
* @version V1.0   
*/
package cn.songzx.phaser.seventh.extthread;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MySeventhThreadC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:00:11
 * 
 */
public class MySeventhThreadC extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午9:00:33
	 * @Title: MySeventhThreadC.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySeventhThreadC(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
			phaser.awaitAdvanceInterruptibly(10);// 不符合栏数就继续运行
			System.out.println(Thread.currentThread().getName() + " A1   end=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			System.out.println("进入catch了！");
			e.printStackTrace();
		}
	}
}
