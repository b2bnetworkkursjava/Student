package domain;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String surname;
    private List<Subject> subject = new ArrayList<>();
    private int number;
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public double avgOfSubject(String name){

        double sum = 0;
        int counter = 0;
        for (Subject sub : subject){
            if(sub.getName().equals(name)){
                for(Double d : sub.getDeegres()){
                    sum += d;
                    counter++;
                }
            }
        }
        return sum/counter;
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

    public Student(String name, String surname, List<Subject> subject, int number) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.number = number;
    }

    public Student (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public double average(){
        double suma=0;
        double srednia=0;
        double counter=0;
        for (Subject j:subject){
            for (Double x:j.getDeegres()){
                suma+=x;
                counter++;
            }

        }
        srednia=suma/counter;
        return srednia;
    }
}
