package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int userAge = 30;
		int serviceCost = 0;
		
		serviceCost = switch(userAge) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30 -> 3000;
			case 40 -> 3000;
			case 50 -> 4000;
			case 60 -> 4000;
			case 70 -> 4000;
			case 80 -> 5000;
			default -> 500;
		};
		System.out.println(userAge+"代の料金は"+serviceCost+"円");
	}
}
