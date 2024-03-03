package sem5.service;

import sem5.model.Student;
import sem5.model.StudentGroup;
import sem5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<StudentGroup> studentGroups = new ArrayList<>();

    public void create(Teacher teacher, List<Student> list) {
        studentGroups.add(new StudentGroup(teacher, list));
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }
}
