
public class Holiday_week_questions {

	public static void main(String[] args) {
		int Holiday_days=88888;
		int Remaining_weeks=0;
		int Remaining_days=0;
		Remaining_weeks=Holiday_days/7;
		Remaining_days=Holiday_days%7;
		System.out.println(Holiday_days+"天 :\n"+"需要"+Remaining_weeks+"个星期0"+Remaining_days+"天");
	}
}
