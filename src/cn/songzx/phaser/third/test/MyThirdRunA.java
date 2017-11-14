/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.phaser.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月14日 下午8:02:30 
* @version V1.0   
*/
package cn.songzx.phaser.third.test;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月14日 下午8:02:30
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017年11月14日下午8:02:30
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(5);
		System.out.println(phaser.getRegisteredParties());// getRegisteredParties()获得注册的parties数量
		phaser.register();
		System.out.println(phaser.getRegisteredParties());
		phaser.register();
		System.out.println(phaser.getRegisteredParties());
		phaser.register();// register()动态添加一个parties值
		System.out.println(phaser.getRegisteredParties());
		phaser.register();
		System.out.println(phaser.getRegisteredParties());
		phaser.register();
	}

}
