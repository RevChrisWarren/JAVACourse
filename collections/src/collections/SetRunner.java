package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
//SET (Tree, Hash, LinkedHash

		Set<Character> treeSet = new TreeSet<>(characters);
		Set<Character> linkedHashSet = new LinkedHashSet(characters);
		System.out.println(characters);
		System.out.println(treeSet);
		System.out.println(linkedHashSet);
	}

}
