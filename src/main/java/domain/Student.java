package domain;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String surname;
    private List<Subject> subject = new ArrayList<>();

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public Student(String name, String surname, List<Subject> subject) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
    }

    public Student (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
