/**   
* @Title: MyFifthThreadA.java 
* @Package cn.songzx.phaser.fifth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午8:02:48 
* @version V1.0   
*/
package cn.songzx.phaser.fifth.extthread;

import cn.songzx.phaser.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午8:02:48
 * 
 */
public class MyFifthThreadB extends Thread {
	private MyFifthServiceA service;

	/**
	 * @Date: 2017年11月16日下午8:03:22
	 * @Title: MyFifthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyFifthThreadB(MyFifthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
