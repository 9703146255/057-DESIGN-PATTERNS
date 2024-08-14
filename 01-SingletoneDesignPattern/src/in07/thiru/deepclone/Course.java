package in07.thiru.deepclone;

import java.util.ArrayList;
import java.util.List;

public class Course implements Cloneable {
	private String name;
	private List<String> subjects;

	public Course(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Course cloned = (Course) super.clone();
		cloned.subjects = new ArrayList<>(this.subjects);
		return cloned;
	}

	public String getName() {
		return name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	@Override
	public String toString() {
		return "Course{name='" + name + "', subjects=" + subjects + "}";
	}
}


