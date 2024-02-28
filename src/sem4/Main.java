package sem4;

import sem4.people.Student;
import sem4.people.StudentGroup;
import sem4.people.Teacher;
import sem4.utils.StudentGroupService;
import sem4.utils.TeacherService;
import sem4.view.TeacherView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupService sgService = getStudentGroupService();

        System.out.println("Student Sort by ID");
        for (Student student : sgService.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Student Sort by FIO");
        for (Student student : sgService.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }
        System.out.println();


        TeacherService ts = getTeacherService();

        System.out.println("ts.getTeacherList():");
        for (Teacher t : ts.getTeacherList()) {
            System.out.println(t);
        }
        System.out.println();

        System.out.println("ts.getSortedTeacherByFIO():");
        for (Teacher teacher : ts.getSortedTeacherByFIO()) {
            System.out.println(teacher);

        }
        System.out.println();
    }

    private static TeacherService getTeacherService() {
        Teacher teacher1 = new Teacher("Kirill", "Iv", "Moiseev", 1);
        Teacher teacher2 = new Teacher("Sergio", "Iv", "Kamenecii", 2);
        Teacher teacher3 = new Teacher("Ali", "A", "Ababua", 3);

        List<Teacher> teacherList = new ArrayList<>(Arrays.asList(teacher1, teacher2, teacher3));
        TeacherView teacherView = new TeacherView();
        teacherView.sendToConsole(teacherList);
        System.out.println();

        return new TeacherService(teacherList);
    }

    private static StudentGroupService getStudentGroupService() {
        Student student0 = new Student("Herman", "Puzikov", "ff", 1);
        Student student1 = new Student("Artyom", "Ivanovich", "Garmash", 2);
        Student student2 = new Student("Alex", "Serg", "Pushkin", 3);
        Student student3 = new Student("Lev", "Nik", "Tolst", 4);

        List<Student> studentList = new ArrayList<>(Arrays.asList(student0, student1, student2, student3));
        StudentGroup studentGroup = new StudentGroup(studentList);

        return new StudentGroupService(studentGroup);
    }
}
