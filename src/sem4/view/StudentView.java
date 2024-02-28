package sem4.view;

import sem4.people.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendToConsole(List<Student> users) {
        int count = 1;
        for (Student user : users) {
            System.out.printf("Student %d: %s\n", count++, user);
        }
    }
}
