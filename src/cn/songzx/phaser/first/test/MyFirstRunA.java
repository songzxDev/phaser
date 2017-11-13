/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.phaser.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午8:56:15 
* @version V1.0   
*/
package cn.songzx.phaser.first.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.first.extthread.MyFirstThreadA;
import cn.songzx.phaser.first.extthread.MyFirstThreadB;
import cn.songzx.phaser.first.extthread.MyFirstThreadC;
import cn.songzx.phaser.first.extthread.MyFirstThreadD;
import cn.songzx.phaser.first.tools.MyFirstPrintTools;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午8:56:15
 * 
 */
public class MyFirstRunA {

	/**
	 * @Date: 2017年11月13日下午8:56:15
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(4);
		MyFirstPrintTools.phaser = phaser;

		MyFirstThreadA threadA = new MyFirstThreadA(phaser);
		threadA.setName("A");
		threadA.start();

		MyFirstThreadB threadB = new MyFirstThreadB(phaser);
		threadB.setName("B");
		threadB.start();

		MyFirstThreadC threadC = new MyFirstThreadC(phaser);
		threadC.setName("C");
		threadC.start();
		
		MyFirstThreadD threadD = new MyFirstThreadD(phaser);
		threadD.setName("D");
		threadD.start();
		
	}

}
