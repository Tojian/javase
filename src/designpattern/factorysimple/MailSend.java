package designpattern.factorysimple;
/**
 * 
 * @ClassName MailSend.java
 * @description 创建一个邮箱发送消息类，实现了抽象产品的方法
 */
public class MailSend implements Send {

	@Override
	public void send() {

		System.out.println("这个是邮箱发送");
	}

}
