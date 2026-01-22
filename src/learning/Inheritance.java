package learning;

class Facebook
{
	int notification =20;
	void chat()
	{
		System.out.println("30members");
	}
	
}
class Version extends Facebook
{
	void videocall()
	{
		System.out.println("videocall is on");
	}
	void comment()
	{
		System.out.println("comment color shoukd be black");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Version a1 = new Version();
		a1.videocall();
		a1.chat();
		a1.comment();
		System.out.println(a1.notification);
	}
	public void test(){
		System.out.println("develop branch");
	}
	
	
}
