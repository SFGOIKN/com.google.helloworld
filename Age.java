public class Age{
	public static void main(String[] args){
		int MOINOR = 35;
		
		System.out.print("请输入你的年龄：");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		System.out.print("你的年龄是"+age);
		
		if( age < MINOR)
			System.out.println("年轻是美好的");
	}
	
}