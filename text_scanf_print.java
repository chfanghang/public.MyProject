package java.text;
import java.io.IOException;
import java.util.*;
public class text_scanf_print {
	public static void main(String[] args)throws IOException {
	name_age();
	file_in_output();
	}
	public static void name_age() {
		Scanner in=new Scanner (System.in);
		System.out.print("What's you name?\n");
		String name=in.nextLine();//�ܹ�д��ո����
	//	String firstname=in.next();//����д��հ׷��ţ�����ᱨ��
		System.out.print("How old are you?\n");
		int age=in.nextInt();
		System.out.print("Hello!,"+name+"��һ�꣬����"+(age+1));
	}
	public static void file_in_output() throws IOException{
		PrintWriter out=new PrintWriter("myfile.txt",Standardcharsets.UTF_8);
		Scanner in=new Scanner(Path.of("myfile.txt"),Standardcharsets.UTF_8);
	}
}
