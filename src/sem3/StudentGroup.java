package sem3;

import java.util.List;

public class StudentGroup {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Student student : studentList) {
            result.append(student.toString()).append(";\n");
        }
        return result.toString();
    }
}
