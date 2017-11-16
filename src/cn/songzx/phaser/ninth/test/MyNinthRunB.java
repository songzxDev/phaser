/**   
* @Title: MyNinthRunA.java 
* @Package cn.songzx.phaser.ninth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:29:33 
* @version V1.0   
*/
package cn.songzx.phaser.ninth.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.ninth.extthread.MyNinthThreadA;

/**
 * @ClassName: MyNinthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:29:33
 * 
 */
public class MyNinthRunB {

	/**
	 * @Date: 2017年11月16日下午9:29:33
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			Phaser phaser = new Phaser(3);
			phaser.register();
			// Phaser类的运行时机可以通过逻辑来控制，主要原理就是计数加一，然后通过逻辑代码的方式来决定线程是否继续向下运行
			for (int i = 0; i < 3; i++) {
				MyNinthThreadA threadA = new MyNinthThreadA(phaser);
				threadA.start();
			}
			Thread.sleep(5000L);
			phaser.arriveAndDeregister();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
