/**   
* @Title: MySecondServiceA.java 
* @Package cn.songzx.phaser.second.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午9:50:03 
* @version V1.0   
*/
package cn.songzx.phaser.second.service;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MySecondServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午9:50:03
 * 
 */
public class MySecondServiceA {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月13日下午9:50:25
	 * @Title: MySecondServiceA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MySecondServiceA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void testMethodA() {
		try {
			System.out.println("A begin ThreadName=" + Thread.currentThread().getName() + "               " + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("B")) {
				Thread.sleep(5000L);
			}
			phaser.arriveAndAwaitAdvance();
			System.out.println("A   end ThreadName=" + Thread.currentThread().getName() + " end phaser value=" + phaser.getPhase() + "   " + System.currentTimeMillis());

			System.out.println("B begin ThreadName=" + Thread.currentThread().getName() + "               " + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("B")) {
				Thread.sleep(5000L);
			}
			phaser.arriveAndAwaitAdvance();
			System.out.println("B   end ThreadName=" + Thread.currentThread().getName() + " end phaser value=" + phaser.getPhase() + "   " + System.currentTimeMillis());
			
			System.out.println("C begin ThreadName=" + Thread.currentThread().getName() + "               " + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("B")) {
				Thread.sleep(5000L);
			}
			phaser.arriveAndAwaitAdvance();
			System.out.println("C   end ThreadName=" + Thread.currentThread().getName() + " end phaser value=" + phaser.getPhase() + "   " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
