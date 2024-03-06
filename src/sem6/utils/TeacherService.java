package sem6.utils;

import sem6.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    //sort by fio
    public List<Teacher> getTeacherList(){
        return teacherList;
    }
    public List<Teacher>getSortedTeacherByFIO(){
        List<Teacher> teacherListToSort = new ArrayList<>(this.teacherList);
        teacherListToSort.sort(new UserComparator<Teacher>());
        return teacherListToSort;
    }

}
