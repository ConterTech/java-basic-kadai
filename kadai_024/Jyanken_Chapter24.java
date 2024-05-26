package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscirrorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		while(true) {
			choice = scanner.next();
			
			if(choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				break;
			}
			else {
				System.out.println("入力エラー　正しい値を入力してください");
			}
		}
		scanner.close();		
		return choice;
	}
	
	public String getRandom() {
		String[] allChoice = {"r", "s", "p"};
		
		String pcChoice = allChoice[(int)Math.floor(Math.random()*3)];
		
		return pcChoice;
	}
	
	public void playGame(String myChoice, String rivalChoice) {
		HashMap<String, String> play = new HashMap<String, String>();
		play.put("r","グー");
		play.put("s","チョキ");
		play.put("p","パー");
		
		System.out.println("自分の手は"+play.get(myChoice)+",対戦相手の手は"+play.get(rivalChoice));
		
		if(myChoice.equals("r")) {
			if(rivalChoice.equals("r")) {
				System.out.println("あいこです");
			}
			else if(rivalChoice.equals("s")) {
				System.out.println("自分の勝ちです");
			}
			else {
				System.out.println("自分の負けです");
			}
		}
		
		if(myChoice.equals("s")) {
			if(rivalChoice.equals("s")) {
				System.out.println("あいこです");
			}
			else if(rivalChoice.equals("p")) {
				System.out.println("自分の勝ちです");
			}
			else {
				System.out.println("自分の負けです");
			}
		}
		
		if(myChoice.equals("p")) {
			if(rivalChoice.equals("p")) {
				System.out.println("あいこです");
			}
			else if(rivalChoice.equals("r")) {
				System.out.println("自分の勝ちです");
			}
			else {
				System.out.println("自分の負けです");
			}
		}
	}
	
}
