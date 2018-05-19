package com.javase.designpattern.factorysimple;
/**
 * @ClassName SMSend.java
 * @description 短信发送，也是实现了抽象产品类Send.java
 */
public class SMSend  implements Send{

	@Override
	public void send() {

		System.out.println("这是短信发送");
	}

}
