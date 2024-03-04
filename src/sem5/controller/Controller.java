package sem5.controller;

import sem5.model.Student;
import sem5.model.StudentGroup;
import sem5.model.Teacher;
import sem5.model.Type;
import sem5.service.DataService;
import sem5.service.StudentGroupService;
import sem5.view.StudentView;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private DataService dataService = new DataService();
    private StudentView view = new StudentView();
    private StudentGroupService groupService = new StudentGroupService();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void createStudentGroup() {
        List<Teacher> teachers = dataService.getTeachers();
        List<Student> students = dataService.getStudents();
        Teacher chosenTeacher = null;
        List<Student> chosenStudents = new ArrayList<>();

        for (int i = 0; i < teachers.size(); i++) {
            if (!teachers.get(i).isInGroup()) {
                chosenTeacher = teachers.get(i);
                teachers.get(i).setInGroup(true);
                break;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            if (!students.get(i).isInGroup()) {
                if (chosenStudents.size() == 3)
                    break;
                chosenStudents.add(students.get(i));
                students.get(i).setInGroup(true);
            }
        }

        if (chosenTeacher != null && !chosenStudents.isEmpty())
            groupService.create(chosenTeacher, chosenStudents);
        else
            System.out.println("Not enough teachers or students");
    }

    public void printStudents() {
        for (Student student : dataService.getStudents()) {
            view.printToConsole(student);
        }
        System.out.println();
    }

    public void printGroups() {
        for (StudentGroup studentGroup : groupService.getStudentGroups()) {
            System.out.println(studentGroup);
        }
    }
}
