/**   
* @Title: MySeventhRunC.java 
* @Package cn.songzx.phaser.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午9:02:38 
* @version V1.0   
*/
package cn.songzx.phaser.seventh.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.seventh.extthread.MySeventhThreadC;

/**
 * @ClassName: MySeventhRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午9:02:38
 * 
 */
public class MySeventhRunC {

	/**
	 * @Date: 2017年11月16日下午9:02:38
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		MySeventhThreadC threadC = new MySeventhThreadC(phaser);
		threadC.setName("ThreadC");
		threadC.start();
	}

}
