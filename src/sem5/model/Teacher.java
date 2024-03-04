package sem5.model;

public class Teacher extends User {
    private int teacherID;
    private boolean inGroup;


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

    public boolean isInGroup() {
        return inGroup;
    }

    public void setInGroup(boolean inGroup) {
        this.inGroup = inGroup;
    }
}
