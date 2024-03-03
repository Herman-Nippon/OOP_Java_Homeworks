package sem5.service;

import sem5.model.Student;
import sem5.model.Teacher;
import sem5.model.Type;
import sem5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeID(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(id, firstName, secondName, lastName));
        } else if (type == Type.TEACHER) {
            userList.add(new Teacher(id, firstName, secondName, lastName));
        }
    }

    private int getFreeID(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int freeID = 1;

        for (int i = userList.size() - 1; i >= 0; i--) {
            User user = userList.get(i);
            if (user instanceof Student && isStudent) {
                return ((Student) user).getStudentID() + 1;
            } else if (user instanceof Teacher && !isStudent) {
                return ((Teacher) user).getTeacherID() + 1;
            }
        }
        return freeID;
    }

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student)
                studentList.add((Student) user);
        }
        return studentList;
    }
}
