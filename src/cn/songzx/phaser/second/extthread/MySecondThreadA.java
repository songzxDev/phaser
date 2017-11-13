/**   
* @Title: MySecondThreadA.java 
* @Package cn.songzx.phaser.second.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午9:38:42 
* @version V1.0   
*/
package cn.songzx.phaser.second.extthread;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MySecondThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午9:38:42
 * 
 */
public class MySecondThreadA extends Thread {

	private Phaser phaser;

	/**
	 * @Date: 2017年11月13日下午9:39:12
	 * @Title: MySecondThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySecondThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println("屏障点A Begin！");
		phaser.arriveAndAwaitAdvance();
		System.out.println("屏障点A   end！phase value=" + phaser.getPhase());// 方法getPhase()获取的是已经到达第几个屏障

		System.out.println("屏障点A Begin！");
		phaser.arriveAndAwaitAdvance();
		System.out.println("屏障点A   end！phase value=" + phaser.getPhase());

		System.out.println("屏障点A Begin！");
		phaser.arriveAndAwaitAdvance();
		System.out.println("屏障点A   end！phase value=" + phaser.getPhase());

		System.out.println("屏障点A Begin！");
		phaser.arriveAndAwaitAdvance();
		System.out.println("屏障点A   end！phase value=" + phaser.getPhase());
	}

}
