package designpattern.factorysimple;

public class FactoryTest {

	public static void main(String[] args) {
		SendSimpleFactory ssf=new SendSimpleFactory();
	/*	Send send=ssf.produce("sms");
		send.send();*/
		/*Send send=ssf.produceMail();
		send.send();*/
		
		Provider provider=new SendMailFactory();
		Send send=provider.produce();
		send.send();
	}
}
