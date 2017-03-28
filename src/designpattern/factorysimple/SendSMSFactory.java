package designpattern.factorysimple;
/**
 * 
 * @ClassName SendSMSFactory.java
 * @description
 */
public class SendSMSFactory implements Provider {

	@Override
	public Send produce() {
		// TODO Auto-generated method stub
		return new SMSend();
	}

}
