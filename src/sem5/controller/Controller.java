package sem5.controller;

import sem5.model.Student;
import sem5.model.Teacher;
import sem5.model.Type;
import sem5.service.DataService;
import sem5.service.StudentGroupService;
import sem5.view.StudentView;

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

    public void createStudentGroup(Teacher teacher, List<Student> list) {
        groupService.create(teacher, list);
    }

    public void printStudents() {
        for (Student student : dataService.getStudents()) {
            view.printToConsole(student);
        }
    }
}
