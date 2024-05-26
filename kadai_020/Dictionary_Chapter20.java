package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String,String> fruitsMap = new HashMap<String,String>();
	{
		fruitsMap.put("apple","リンゴ");
		fruitsMap.put("peach","桃");
		fruitsMap.put("banana","バナナ");
		fruitsMap.put("lemon","レモン");
		fruitsMap.put("pear","梨");
		fruitsMap.put("kiwi","キウイ");
		fruitsMap.put("strawberry","いちご");
		fruitsMap.put("grape","ぶどう");
		fruitsMap.put("muscat","マスカット");
		fruitsMap.put("cherry","さくらんぼ");
	}
	
	public void check(String name) {
		
		String fruits = fruitsMap.get(name);
			
		if(fruits == null){
			System.out.println(name+"は辞書に存在しません");
		}
		else {
			System.out.println(name+"の意味は"+fruits);
		}
	}
}
