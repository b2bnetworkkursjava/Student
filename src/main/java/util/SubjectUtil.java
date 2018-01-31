package util;

import domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectUtil {
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    private List<Subject> subjects = new ArrayList<>();

    public void addSubject(String name, List<Double> score){
        Subject subject = new Subject(name, score);
        subjects.add(subject);
    }
}
