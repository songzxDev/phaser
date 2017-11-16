/**   
* @Title: MyFifthRunB.java 
* @Package cn.songzx.phaser.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月16日 下午8:04:25 
* @version V1.0   
*/
package cn.songzx.phaser.fifth.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.fifth.extthread.MyFifthThreadA;
import cn.songzx.phaser.fifth.extthread.MyFifthThreadB;
import cn.songzx.phaser.fifth.extthread.MyFifthThreadC;
import cn.songzx.phaser.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月16日 下午8:04:25
 * 
 */
public class MyFifthRunB {

	/**
	 * @Date: 2017年11月16日下午8:04:25
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		MyFifthServiceA service = new MyFifthServiceA(phaser);

		MyFifthThreadA threadA = new MyFifthThreadA(service);
		threadA.setName("ThreadA");
		threadA.start();

		MyFifthThreadB threadB = new MyFifthThreadB(service);
		threadB.setName("ThreadB");
		threadB.start();

		MyFifthThreadC threadC = new MyFifthThreadC(service);
		threadC.setName("ThreadC");
		threadC.start();
	}

}
