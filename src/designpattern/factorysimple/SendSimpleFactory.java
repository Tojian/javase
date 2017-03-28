package designpattern.factorysimple;
/**
 * 
 * @ClassName SendSimpleFactory.java
 * @description 简单工厂类
 */
public class SendSimpleFactory {

	//Send send=null;
	public Send produceMail(){
		return new MailSend();
	}

	public Send produceSMS(){
		return new SMSend();
	}
	
}
