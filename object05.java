package object;

public class object05 {
	/*��¡
	 * ��дһ������copyPerson�����Ը���һ��Person���󣬷��صĶ���
	 * ��¡����ע��Ҫ��õ����¶����ԭ���Ķ��������������Ķ���
	 * ֻ�����ǵ�������ͬ
	 */
	public static void main(String[] args) {
		person man=new person();
		man.name="jack";
		man.age=24;
		copyPerson copy=new copyPerson();
		person p2=copy.copyOb(man);
		System.out.print("p2.name= "
				+p2.name+"\tp2.age="+p2.age);
		System.out.println();
		System.out.println("man.name= "
				+man.name+"\tman.age="+man.age);
		System.out.println(man==p2);			//�ж��Ƿ�Ϊͬһ������
	}
}
class person{
	String name;
	int age;
}
class copyPerson{
	public person copyOb(person p) {		//��ͬ����Ҫ����
		person man=new person();
		man.name=p.name;
		man.age=p.age;
		return man;
	}
}