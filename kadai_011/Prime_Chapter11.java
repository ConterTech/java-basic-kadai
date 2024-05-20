package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean [] judgePrime = new boolean[101];
		
		for(int i = 0; i < judgePrime.length; i++) {
			judgePrime[i] = true;
		}
		
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					judgePrime[i] = false;
					break;
				}
			}
		}
		
		for(int i = 2; i < judgePrime.length; i++) {
			if(judgePrime[i] == true) {
				System.out.println(i);
			}
		}
	}
}
