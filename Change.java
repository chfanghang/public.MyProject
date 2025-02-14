package lqb_A;
public class Change {
	public static void main(String[] args) {
		byte c1=20;
		int c2=52;
		short c3=88;
		boolean c4=true;
		String a1=c1+"";
		String a2=c2+"";
		String a3=c3+"";
		String a4=c4+"";
		String ans=a1+a2+a3+a4;
		System.out.print("c1= "+c1+"c2= "+c2+"c3= "+c3+"c4= "+c4);
		System.out.print("\nans= "+ans);
		System.out.print("\n");
		change();
	}
	public static void change() {
		
		int num1=Integer.parseInt("123");
		byte num2=Byte.parseByte("123");
		short num3=Short.parseShort("123");
		boolean num4=Boolean.parseBoolean("123");
		System.out.println("num1 = "+num1+"num2 = "+num2+"num3 = "+num3+"num4 = "+num4);
	}

}
