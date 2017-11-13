/**   
* @Title: MySecondRunB.java 
* @Package cn.songzx.phaser.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月13日 下午9:59:15 
* @version V1.0   
*/
package cn.songzx.phaser.second.test;

import java.util.concurrent.Phaser;

import cn.songzx.phaser.second.extthread.MySecondThreadB;
import cn.songzx.phaser.second.extthread.MySecondThreadC;
import cn.songzx.phaser.second.service.MySecondServiceA;

/**
 * @ClassName: MySecondRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月13日 下午9:59:15
 * 
 */
public class MySecondRunB {

	/**
	 * @Date: 2017年11月13日下午9:59:15
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(2) {
			@Override
			protected boolean onAdvance(int phase, int registeredParties) {
				System.out.println("onAdvance(int phase, int registeredParties) 被调用！");
				return false;// 返回true不等待了，Phaser呈无效/销毁的状态，返回false则Phaser继续工作
			}
		};

		MySecondServiceA service = new MySecondServiceA(phaser);
		MySecondThreadB threadA = new MySecondThreadB(service);
		threadA.setName("A");
		threadA.start();

		MySecondThreadC threadB = new MySecondThreadC(service);
		threadB.setName("B");
		threadB.start();

	}

}
