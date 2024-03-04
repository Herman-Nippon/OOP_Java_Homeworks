package sem5.service;

import sem5.model.Student;
import sem5.model.Teacher;
import sem5.model.Type;
import sem5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeID(type);
        if (type == Type.STUDENT) {
            studentList.add(new Student(id, firstName, secondName, lastName));
        } else if (type == Type.TEACHER) {
            teacherList.add(new Teacher(id, firstName, secondName, lastName));
        }
    }

    private int getFreeID(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int freeID = 1;

        if (type == Type.STUDENT) {
            if (!studentList.isEmpty())
                freeID = studentList.getLast().getStudentID() + 1;
        } else {
            if (!teacherList.isEmpty())
                freeID = teacherList.getLast().getTeacherID() + 1;
        }

        return freeID;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public List<Teacher> getTeachers() {
        return teacherList;
    }
}
