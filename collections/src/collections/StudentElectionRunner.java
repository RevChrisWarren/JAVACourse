package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentElectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("John", 100), new Student("Jake", 22), new Student("Josh", 34));

		List<Student> studentsAl = new ArrayList<>(students);

		System.out.println(students);

		Collections.sort(studentsAl);
		System.out.println(studentsAl);
	}

}
