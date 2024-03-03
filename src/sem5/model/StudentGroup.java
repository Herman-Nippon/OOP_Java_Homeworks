package sem5.model;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
