package week3.day1;

public class Smartmobile extends Androidmobile
{

	public void  ConnectWhatsapps() {
		
		System.out.println("whatsapp");
	}


	public static void main(Strings[]args) {
	Smartmobile n =new Smartmobile();
		n.sendmsg();
		 n.makecall();
		 n.savecontact();
		 n.takevideo();
		n.ConnectWhatsapps();
		}
	}
