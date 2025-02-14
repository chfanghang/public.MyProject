package object;

public class object05 {
	/*克隆
	 * 编写一个方法copyPerson，可以复制一个Person对象，返回的对象
	 * 克隆对象，注意要求得到的新对象和原来的对象是两个独立的对象，
	 * 只是他们的属性相同
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
		System.out.println(man==p2);			//判断是否为同一个对象
	}
}
class person{
	String name;
	int age;
}
class copyPerson{
	public person copyOb(person p) {		//不同的类要创建
		person man=new person();
		man.name=p.name;
		man.age=p.age;
		return man;
	}
}