import domain.Student;
import domain.Subject;
import util.StudentUtil;
import util.SubjectUtil;

import java.util.Arrays;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {

        List<Student> students = createListOfStudents();



    }

    private static List<Student> createListOfStudents() {
        SubjectUtil subjectUtilJanka = new SubjectUtil();
        subjectUtilJanka.addSubject("Matematyka", Arrays.asList(new Double[]{2.5,3.5,4.0}));
        subjectUtilJanka.addSubject("Polski",Arrays.asList(new Double[]{2.0,3.0,5.0}));
        List<Subject> subjectsJanka = subjectUtilJanka.getSubjects();

        Student janek = new Student("Janek","Kowalski", subjectsJanka);


        SubjectUtil subjectUtilMaria = new SubjectUtil();
        subjectUtilMaria.addSubject("Matematyka", Arrays.asList(new Double[]{4.5,4.5,5.0}));
        subjectUtilMaria.addSubject("Polski",Arrays.asList(new Double[]{4.0,3.5,3.0}));
        List<Subject> subjectsMaria = subjectUtilMaria.getSubjects();

        Student maria = new Student("Maria","Talaska", subjectsMaria);


        SubjectUtil subjectUtilStaszka = new SubjectUtil();
        subjectUtilStaszka.addSubject("Matematyka", Arrays.asList(new Double[]{2.5,3.5,4.5}));
        subjectUtilStaszka.addSubject("Polski",Arrays.asList(new Double[]{2.5,3.5,4.0}));
        List<Subject> subjectsStaszka = subjectUtilStaszka.getSubjects();

        Student staszek = new Student("Stanisław","Kokoszka", subjectsStaszka);


        StudentUtil studentUtil = new StudentUtil();
        studentUtil.addStudentToList(janek);
        studentUtil.addStudentToList(maria);
        studentUtil.addStudentToList(staszek);

        return studentUtil.getStudents();
    }

}
