/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.phaser.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月14日 下午8:38:29 
* @version V1.0   
*/
package cn.songzx.phaser.fifth.test;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月14日 下午8:38:29
 * 
 */
public class MyFifthRunA {

	/**
	 * @Date: 2017年11月14日下午8:38:29
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(2) {

			/**
			 * @Date: 2017年11月14日下午8:41:08
			 * @Title: onAdvance
			 * @Description: TODO(这里用一句话描述这个方法的作用)
			 * @param phase
			 * @param registeredParties
			 * @return
			 * @return 返回值类型
			 */
			@Override
			protected boolean onAdvance(int phase, int registeredParties) {
				System.out.println("到达了未通过！ phase=" + phase + "，registeredParties=" + registeredParties);
				return super.onAdvance(phase, registeredParties);
			}

		};

		System.out.println("A1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
		phaser.arrive();// arrive()的功能是getArrivedParties()计数加一，不等待其他线程到达屏障，控制台多次出现getArrivedParties=0的运行结果，分析出Phaser类进过屏障点后计数能被重置
		System.out.println("A1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());

		System.out.println("A2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
		phaser.arrive();//
		System.out.println("A2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());

		System.out.println("B1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
		phaser.arrive();
		System.out.println("B1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());

		System.out.println("B2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
		phaser.arrive();
		System.out.println("B2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());

		System.out.println("C1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
		phaser.arrive();
		System.out.println("C1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());

		System.out.println("C2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
		phaser.arrive();
		System.out.println("C2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + " getArrivedParties=" + phaser.getArrivedParties());
	}

}
