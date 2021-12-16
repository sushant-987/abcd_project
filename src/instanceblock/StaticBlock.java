package instanceblock;

public class StaticBlock {

	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
	static
	{
		System.out.println("static block-1");	
		
	}
	static
	{
		System.out.println("static block-2");
	}
	
	StaticBlock(){
		System.out.println("0-arg cons");
	}
	StaticBlock(int a){
		System.out.println("1-arg cons");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StaticBlock sb=new StaticBlock();
       StaticBlock sb2=new StaticBlock(10);
	}

}
