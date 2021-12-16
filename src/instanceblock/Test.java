package instanceblock;

public class Test {

	Test()
	{
		System.out.println("0-arg cons");
	}
	Test(int a)
	{
		System.out.println("1-arg cons");
	}
	Test(int a,int b)
	{
		System.out.println("2-arg cons");
	}
	
	{
		System.out.println("Instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Test t=new Test();
         Test t1=new Test(10);
         Test t2=new Test(10,20);
         
	}

}
