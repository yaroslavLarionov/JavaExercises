import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters_UsingMap {
	public static void main(String[] args) {
		// TODO
		// Write a method that accepts string as an argument. The method counts the number of appearances
		// of each char and return map. The key will be a letter and the value will be a number of appearances in the string

		System.out.println(countLetters("hello")); // -> {h=1, e=1, l=2, o=1}
		System.out.println(countLetters("aauuchhh")); // -> {a=2, u=2, c=1, h=3}
		System.out.println(countLetters("aaaaaa")); // -> {a=6}
		System.out.println(countLetters("abc")); // -> {a=1, b=1, c=1})
	}

	public static Map<Character, Integer> countLetters(String str) {
		Map<Character, Integer> myMap = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (myMap.containsKey(ch)) {
				myMap.put(ch, myMap.get(ch) + 1);
			} else {
				myMap.put(ch, 1);
			}
		}
		return myMap;
	}

}
