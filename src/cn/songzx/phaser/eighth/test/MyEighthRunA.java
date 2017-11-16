/**   
* @Title: MyEighthRunA.java 
* @Package cn.songzx.phaser.eighth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:21:15 
* @version V1.0   
*/
package cn.songzx.phaser.eighth.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.eighth.extthread.MyEighthThreadA;
import cn.songzx.phaser.eighth.extthread.MyEighthThreadB;

/**
 * @ClassName: MyEighthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:21:15
 * 
 */
public class MyEighthRunA {

	/**
	 * @Date: 2017年11月16日下午9:21:15
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		// 控制台出现了阻塞现象，因为计数未达到3
		Phaser phaser = new Phaser(3);
		MyEighthThreadA threadA = new MyEighthThreadA(phaser);
		threadA.setName("ThreadA");
		threadA.start();

		MyEighthThreadB threadB = new MyEighthThreadB(phaser);
		threadB.setName("ThreadB");
		threadB.start();

	}

}
