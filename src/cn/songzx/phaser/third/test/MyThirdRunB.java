/**   
* @Title: MyThirdRunB.java 
* @Package cn.songzx.phaser.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月14日 下午8:07:02 
* @version V1.0   
*/
package cn.songzx.phaser.third.test;

import java.util.concurrent.Phaser;

/**
 * @ClassName: MyThirdRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月14日 下午8:07:02
 * 
 */
public class MyThirdRunB {

	/**
	 * @Date: 2017年11月14日下午8:07:02
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(10);
		System.out.println(phaser.getRegisteredParties());
		
		phaser.bulkRegister(10);// bulkRegister(int nums) 可以批量增加parties数目
		System.out.println(phaser.getRegisteredParties());
		
		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());
		
		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());
		
		phaser.bulkRegister(10);
		System.out.println(phaser.getRegisteredParties());
	}

}
