package sem5.model;

public class Teacher extends User {
    private int teacherID;

    public Teacher(int id, String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
        this.teacherID = id;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() + ", Teacher ID: " + teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }
}
