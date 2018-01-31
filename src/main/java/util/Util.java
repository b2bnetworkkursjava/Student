package util;

import domain.Student;
import domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class Util {

    //wyswietlic imie i nazwisko studenta o najwyzszej sredniej
    public void displayStudentWithHighestAverage(List<Student> students) {
        double maxsrednia = 0;
        Student max = students.get(0);
        for (Student i : students) {
            if (i.average() > max.average()) {
                max = i;
            }
        }
        System.out.println("imię i nazwisko studenta o najwyższej średniej " +
                max.getName() + " " + max.getSurname());
    }

    //wyswietlic imie i nazwisko studentow ktorzy maja srednia powyzej 3.0
    public void displayStudentsWithAverageOver3(List<Student> students) {
        for (Student i : students) {
            if (i.average() > 3) {
                System.out.println("Studenci ktorzy maja srednia powyzej 3 to " + i.getName() + " " + i.getSurname());
            }

        }
    }


    //zwrocic liste studentow ktorzy maja z polskiego ocene 2
    public List<Student> studentsWithDegree2InPolish(List<Student> students) {
        List<Student> lista = new ArrayList<>();
        for (Student s : students) {
            for (Subject sub : s.getSubject()) {
                if (sub.getName().equals("Polski")) {
                    for (Double d : sub.getDeegres()) {
                        if (d.equals(2.)) {
                            lista.add(s);
                        }
                    }
                }
            }
        }
        return lista;
    }

    //zwrocic liste studentow ktorzy maja srednia z polskiego powyzej 3.8
    public List<Student> studentsWithAverageOver3Coma8InPolish(List<Student> students) {

        List<Student> result = new ArrayList<>();

        for (Student student : students) {
            for (Subject sub : student.getSubject()) {

                if (sub.getName().equals("Polski")) {
                    if (student.avgOfSubject(("Polski")) >= 3.5) {
                        result.add(student);
                    }
                }
            }
        }

        return result;
    }

    //zwrócić liste studentów ktorzy mają z matematyki i polskiego ocene 2.5
    public List<Student> studentsWithDegres2_5OfPolishAndMatematic(List<Student> students) {

        List<Student> studenciki = new ArrayList<>();


        boolean matematic = false;
        boolean polish = false;

        for (Student student : students) {
            for (Subject sub : student.getSubject()) {

                if (sub.getName().equals("Polski")) {
                    for (double degres : sub.getDeegres()) {
                        if (degres == 2.5) {
                            polish = true;
                        }
                    }
                }
                if (sub.getName().equals("Matematyka")) {
                    for (double degres : sub.getDeegres()) {
                        if (degres == 2.5) {
                            matematic = true;
                        }
                    }
                }
            }

            if (matematic && polish) {
                studenciki.add(student);
            }
        }


        return studenciki;
    }


    //wyswietlic imie i nazwisko i ta nowa srednia
    // studentow ktorych numer w dzienniku jest wyzszy niz 10
    //oraz obliczyć średnia ocen bez 2.0
    public void displayStudentWithNoOver10AndAverageWithout2(List<Student> students){
        for (Student student : students) {
            if(student.getNumber()>10){
                double sum = 0;
                int counter=0;
                for (Subject subject : student.getSubject()) {
                    for (Double deg : subject.getDeegres()) {
                        if(deg.equals(2.0) == false){
                            sum +=deg;
                            counter++;
                        }
                    }
                }
                System.out.println(student.getName()+" "+student.getSurname()+" "+student.getNumber()+" "+sum/counter);
            }
        }

    }


























}
