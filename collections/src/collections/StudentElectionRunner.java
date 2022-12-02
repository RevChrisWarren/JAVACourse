package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class StudentElectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("John", 100), new Student("Jake", 22), new Student("Josh", 34));

		List<Student> studentsAl = new ArrayList<>(students);

		System.out.println(students);

		Collections.sort(studentsAl);
		System.out.println("Ascending: " + studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());
		// or
		// studentsAl.sort(new DescendingStudentComparator());
		System.out.println("Descending: " + studentsAl);
	}

}
