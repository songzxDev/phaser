/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.phaser.first.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午8:54:17 
* @version V1.0   
*/
package cn.songzx.phaser.first.extthread;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.first.tools.MyFirstPrintTools;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午8:54:17
 * 
 */
public class MyFirstThreadE extends Thread {
	private Phaser phaser;

	/**
	 * @Date: 2017年11月13日下午8:54:47
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param phaser
	 */
	public MyFirstThreadE(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		MyFirstPrintTools.methodD();
	}
}
