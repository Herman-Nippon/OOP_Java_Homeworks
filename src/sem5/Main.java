package sem5;

import sem5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Herman", "Stan", "Puzikov");
        controller.createStudent("Artyom", "Man", "Ivanovich");
        controller.createTeacher("Kirill", "Ivanov", "Moiseev");
        controller.createStudent("Alex", "Serg", "Pushkin");
        controller.printStudents();
    }
}
