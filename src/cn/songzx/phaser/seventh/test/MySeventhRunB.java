/**   
* @Title: MySeventhRunB.java 
* @Package cn.songzx.phaser.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午8:56:06 
* @version V1.0   
*/
package cn.songzx.phaser.seventh.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.seventh.extthread.MySeventhThreadB;

/**
 * @ClassName: MySeventhRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午8:56:06
 * 
 */
public class MySeventhRunB {

	/**
	 * @Date: 2017年11月16日下午8:56:06
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			Phaser phaser = new Phaser(3);
			MySeventhThreadB threadB = new MySeventhThreadB(phaser);
			threadB.setName("ThreadB");
			threadB.start();
			Thread.sleep(5000L);
			threadB.interrupt();
			System.out.println("中断了 C！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
