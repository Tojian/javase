package com.javase.designpattern.factorysimple;
/**
 * 
  @ClassName SendMailFactory.java
 * @description 这个是发送邮件的工厂
 */
public class SendMailFactory implements Provider{

	@Override
	public Send produce() {
		// TODO Auto-generated method stub
		return new MailSend();
	}

}
