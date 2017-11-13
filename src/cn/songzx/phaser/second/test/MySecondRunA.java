/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.phaser.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午9:41:59 
* @version V1.0   
*/
package cn.songzx.phaser.second.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.second.extthread.MySecondThreadA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午9:41:59
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017年11月13日下午9:41:59
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		MySecondThreadA threadA = new MySecondThreadA(phaser);
		threadA.start();

	}

}
