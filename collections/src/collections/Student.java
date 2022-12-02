package collections;

public class Student implements Comparable<Student> {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student that) {
		// sort by id
		return Integer.compare(this.id, that.id);
	}
}
