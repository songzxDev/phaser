/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.phaser.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月14日 下午8:26:48 
* @version V1.0   
*/
package cn.songzx.phaser.forth.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.forth.extthread.MyForthThreadA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月14日 下午8:26:48
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017年11月14日下午8:26:48
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			Phaser phaser = new Phaser(7);
			MyForthThreadA[] threadArray = new MyForthThreadA[5];
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i] = new MyForthThreadA(phaser);
				threadArray[i].setName("Thread" + (i + 1));
				threadArray[i].start();
			}
			Thread.sleep(2000L);
			System.out.println("已到达：" + phaser.getArrivedParties());// getArrivedParties()获得已经被使用的parties个数
			System.out.println("未达到：" + phaser.getUnarrivedParties());// getUnarrivedParties()获得未被使用的parties个数
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
