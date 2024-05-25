package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		String[] checkList = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < checkList.length; i++) {
			dictionary.check(checkList[i]);
		}
	}
}
