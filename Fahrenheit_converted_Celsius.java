import java.util.*;
public class Fahrenheit_converted_Celsius {
	public static void main(String[] args) {
		double Fahrenheit=0;
		double Celsius=0;
		System.out.print("�����뻪���¶ȣ�\n");
		try (Scanner scanner = new Scanner(System.in)) {
			Fahrenheit=scanner.nextDouble();
		}
		Celsius=5.0/9*(Fahrenheit-100);
		System.out.print("�����¶�Ϊ��\n"+Celsius);
	}
	
}
