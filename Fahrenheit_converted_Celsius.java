import java.util.*;
public class Fahrenheit_converted_Celsius {
	public static void main(String[] args) {
		double Fahrenheit=0;
		double Celsius=0;
		System.out.print("请输入华氏温度：\n");
		try (Scanner scanner = new Scanner(System.in)) {
			Fahrenheit=scanner.nextDouble();
		}
		Celsius=5.0/9*(Fahrenheit-100);
		System.out.print("摄氏温度为：\n"+Celsius);
	}
	
}
