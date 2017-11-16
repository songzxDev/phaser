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
public class MyNinthRunA {

	/**
	 * @Date: 2017年11月16日下午9:29:33
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		for (int i = 0; i < 3; i++) {
			MyNinthThreadA threadA = new MyNinthThreadA(phaser);
			threadA.start();
		}
	}

}
