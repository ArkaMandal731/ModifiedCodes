
public class publictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Reverse a entire line
		String langs="My name is Arka Mandal";
		String lang[]=langs.split(" ");
		System.out.println(lang[4]+" "+lang[3]+" "+lang[2]);
		System.out.println("-------------------------------------------------------------");
		//2.Reverse a String
		String a="i am Rana";
		StringBuffer sf=new StringBuffer(a);
		System.out.println(sf.reverse());
		System.out.println("-------------------------------------------------------------");
		//3.Remove Junk/Special Characters
		String b="Hello Wordld@@#(0%^^&&";
		String c=b.replaceAll("[^A-Z,a-z, ]", "");
		System.out.println(c);
		System.out.println("-------------------------------------------------------------");
		//4.Reverse a integer
		int num=12345;
		int reverse=0;
		while(num!=0) {
			reverse= reverse *10+ num %10;
			num=num/10;
			
		}
		System.out.println(reverse);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Code changes");
		
			
		}
		
		
		






	}


