package util;

import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudentToList(Student student){
        students.add(student);
    }

}
