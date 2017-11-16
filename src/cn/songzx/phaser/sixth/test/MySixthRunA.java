/**   
* @Title: MySixthRunA.java 
* @Package cn.songzx.phaser.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午8:21:29 
* @version V1.0   
*/
package cn.songzx.phaser.sixth.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.sixth.extthread.MySixthThreadA;
import cn.songzx.phaser.sixth.extthread.MySixthThreadB;
import cn.songzx.phaser.sixth.extthread.MySixthThreadC;
import cn.songzx.phaser.sixth.extthread.MySixthThreadD;

/**
 * @ClassName: MySixthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午8:21:29
 * 
 */
public class MySixthRunA {

	/**
	 * @Date: 2017年11月16日下午8:21:29
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		MySixthThreadA threadA = new MySixthThreadA(phaser);
		threadA.setName("ThreadA");
		threadA.start();

		MySixthThreadB threadB = new MySixthThreadB(phaser);
		threadB.setName("ThreadB");
		threadB.start();

		MySixthThreadC threadC = new MySixthThreadC(phaser);
		threadC.setName("ThreadC");
		threadC.start();

		MySixthThreadD threadD = new MySixthThreadD(phaser);
		threadD.setName("ThreadD");
		threadD.start();
	}

}
