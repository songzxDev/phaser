/**   
* @Title: MySeventhRunD.java 
* @Package cn.songzx.phaser.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:09:07 
* @version V1.0   
*/
package cn.songzx.phaser.seventh.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.seventh.extthread.MySeventhThreadD;

/**
 * @ClassName: MySeventhRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:09:07
 * 
 */
public class MySeventhRunD {

	/**
	 * @Date: 2017年11月16日下午9:09:07
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		testC();
	}

	public static void testA() {
		// 因为5秒之后phaser阶段值没有发生变化，抛出超时异常
		Phaser phaser = new Phaser(3);
		MySeventhThreadD threadD = new MySeventhThreadD(phaser);
		threadD.setName("ThreadD");
		threadD.start();
	}

	public static void testB() {
		try {
			// 5秒内phaser的阶段值发生了变化，没有抛出异常
			Phaser phaser = new Phaser(3);
			MySeventhThreadD threadD = new MySeventhThreadD(phaser);
			threadD.setName("ThreadD");
			threadD.start();
			Thread.sleep(1000L);
			phaser.arrive();
			Thread.sleep(1000L);
			phaser.arrive();
			Thread.sleep(1000L);
			phaser.arrive();
			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void testC() {
		try {
			// 提前还未到达5秒的线程进行了中断操作，抛出了异常
			Phaser phaser = new Phaser(3);
			MySeventhThreadD threadD = new MySeventhThreadD(phaser);
			threadD.setName("ThreadD");
			threadD.start();
			Thread.sleep(1000L);
			threadD.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
