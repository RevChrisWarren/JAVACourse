package collections;

import java.util.HashMap;
import java.util.Map;

public class StringAnalysisRunner {

	public static void main(String[] args) {
		String str = new String("This is an awesome occasion. This has never happened before.");

		Map<Character, Integer> occurrences = new HashMap<>();

		char[] chars = str.toCharArray();
		for (char character : chars) {
			Integer integer = occurrences.get(character);
			if (integer == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, integer + 1);
			}

		}
		System.out.println(occurrences);

		Map<String, Integer> occurrences2 = new HashMap<>();

		String[] strings = str.split(" ");

		for (String string : strings) {
			Integer integer = occurrences2.get(string);
			if (integer == null) {
				occurrences2.put(string, 1);
			} else {
				occurrences2.put(string, integer + 1);
			}

		}
		System.out.println(occurrences2);

	}
}
