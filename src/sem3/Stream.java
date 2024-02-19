package sem3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    public List<StudentGroup> studentGroupList;

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public Integer getStreamSize() {
        return studentGroupList.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return (index < studentGroupList.size());
            }

            @Override
            public StudentGroup next() {
                if (!this.hasNext())
                    return null;
                return studentGroupList.get(index++);
            }
        };
    }
}
