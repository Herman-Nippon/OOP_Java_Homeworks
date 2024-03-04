package sem5.model;

public class Student extends User {
    private int studentID;
    private boolean inGroup;

    public Student(int id, String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
        this.studentID = id;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ", Student ID: " + studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public boolean isInGroup() {
        return inGroup;
    }

    public void setInGroup(boolean inGroup) {
        this.inGroup = inGroup;
    }
}
