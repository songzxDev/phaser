/**   
* @Title: MySecondThreadB.java 
* @Package cn.songzx.phaser.second.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午9:57:04 
* @version V1.0   
*/
package cn.songzx.phaser.second.extthread;

import cn.songzx.phaser.second.service.MySecondServiceA;

/**
 * @ClassName: MySecondThreadB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午9:57:04
 * 
 */
public class MySecondThreadC extends Thread {
	private MySecondServiceA service;

	/**
	 * @Date: 2017年11月13日下午9:57:34
	 * @Title: MySecondThreadB.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MySecondThreadC(MySecondServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
