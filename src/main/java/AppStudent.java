import domain.Student;
import domain.Subject;
import util.StudentUtil;
import util.SubjectUtil;
import util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {

        List<Student> students = createListOfStudents();
        Util util = new Util();
//        util.displayStudentWithHighestAverage(students);
//        util.displayStudentsWithAverageOver3(students);

//        for(Student x:util.studentsWithDegree2InPolish(students)){
//            System.out.println(x.getName());
//        }

//    List<Student> studentsWithGoodPolish = util.studentsWithDegres2_5OfPolishAndMatematic( students);
//    for (Student s : studentsWithGoodPolish){
//        System.out.println(s.getName());
//    }

        util.displayStudentWithNoOver10AndAverageWithout2(students);
    }

    private static List<Student> createListOfStudents() {
        SubjectUtil subjectUtilJanka = new SubjectUtil();
        subjectUtilJanka.addSubject("Matematyka", Arrays.asList(new Double[]{2.5,3.5,4.0}));
        subjectUtilJanka.addSubject("Polski",Arrays.asList(new Double[]{2.0,3.0,5.0}));
        List<Subject> subjectsJanka = subjectUtilJanka.getSubjects();

        Student janek = new Student("Janek","Kowalski", subjectsJanka,10);

        SubjectUtil subjectUtilMaria = new SubjectUtil();
        subjectUtilMaria.addSubject("Matematyka", Arrays.asList(new Double[]{4.5,4.5,5.0}));
        subjectUtilMaria.addSubject("Polski",Arrays.asList(new Double[]{4.0,3.5,3.0}));
        List<Subject> subjectsMaria = subjectUtilMaria.getSubjects();

        Student maria = new Student("Maria","Talaska", subjectsMaria, 8);


        SubjectUtil subjectUtilStaszka = new SubjectUtil();
        subjectUtilStaszka.addSubject("Matematyka", Arrays.asList(new Double[]{2.5,3.5,4.5}));
        subjectUtilStaszka.addSubject("Polski",Arrays.asList(new Double[]{2.5,3.5,4.0}));
        List<Subject> subjectsStaszka = subjectUtilStaszka.getSubjects();

        Student staszek = new Student("Stanisław","Kokoszka", subjectsStaszka, 20);


        StudentUtil studentUtil = new StudentUtil();
        studentUtil.addStudentToList(janek);
        studentUtil.addStudentToList(maria);
        studentUtil.addStudentToList(staszek);

        return studentUtil.getStudents();
    }

}
