/**   
* @Title: MyFifthServiceA.java 
* @Package cn.songzx.phaser.fifth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午7:56:27 
* @version V1.0   
*/
package cn.songzx.phaser.fifth.service;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyFifthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午7:56:27
 * 
 */
public class MyFifthServiceA {
	public Phaser phaser;

	/**
	 * @Date: 2017年11月16日下午7:56:53
	 * @Title: MyFifthServiceA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MyFifthServiceA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin A1 " + System.currentTimeMillis());
			Thread.sleep(3000L);
			System.out.println(phaser.getArrivedParties());
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + "   end A1 " + System.currentTimeMillis());

			System.out.println(Thread.currentThread().getName() + " begin A2 " + System.currentTimeMillis());
			Thread.sleep(3000L);
			System.out.println(phaser.getArrivedParties());
			System.out.println(Thread.currentThread().getName() + "   end A2 " + System.currentTimeMillis());

			System.out.println(Thread.currentThread().getName() + " begin A3 " + System.currentTimeMillis());
			Thread.sleep(3000L);
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + "   end A3 " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void testMethodB() {
		System.out.println(Thread.currentThread().getName() + " begin A1 " + System.currentTimeMillis());
		phaser.arrive();
		System.out.println(Thread.currentThread().getName() + "   end A1 " + System.currentTimeMillis());

		System.out.println(Thread.currentThread().getName() + " begin A2 " + System.currentTimeMillis());
		phaser.arrive();
		System.out.println(Thread.currentThread().getName() + "   end A2 " + System.currentTimeMillis());

		System.out.println(Thread.currentThread().getName() + " begin A3 " + System.currentTimeMillis());
		phaser.arrive();
		System.out.println(Thread.currentThread().getName() + "   end A3 " + System.currentTimeMillis());
	}
}
