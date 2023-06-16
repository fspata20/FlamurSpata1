package day8;

import java.util.ArrayList;
import java.util.List;

public class WhoKnowsJava {
    public static void main(String[] args) {
        Student s1 = new Student("Ben", "Jr",   "23-10-2001" ,  true);
        Student s2 = new Student("Tom", "Js",   "29-03-2003" ,  true);
        Student s3 = new Student("Miri", "Jd",   "03-03-1999" ,  true);
        Student s4 = new Student("John", "Jd",   "03-04-1999" ,  true);
        Student s5 = new Student("Muli", "Jd",   "03-05-1999" ,  true);
        Student s6 = new Student("Hemi", "Jd",   "03-06-1999" ,  true);
        Student s7 = new Student("Ledio", "Jd",   "03-12-1999" ,  true);
        Student s8 = new Student("Enard", "",   "03-11-1999" ,  true);
        Student s9 = new Student("Niko", "Po",   "03-7-1999" ,  true);
        Student s10 = new Student("Drilon", "Nj",   "09-03-1999" ,  true);
        Student s11 = new Student("Xhoi", "Km",   "03-08-1999" ,  true);
        Student s12 = new Student("Faldi", "Pl",   "13-05-1999" ,  true);
        Student s13 = new Student("Ensild", "Dp",   "17-04-1999" ,  true);
        Student s14 = new Student("Denis", "Df",   "10-04-1999" ,  true);
        Student s15 = new Student("Marvi", "Dc",   "23-04-1999" ,  true);

        Trainer trainer1 = new Trainer("Krist", "Jn", "05-02-1998", true);
        Trainer trainer2 = new Trainer("Krist", "Jn", "06-09-1999", true);
        Trainer trainer3 = new Trainer("Krist", "Jn", "07-03-1991", true);


        Group group1 = new Group("Java2Gdansk", trainer1);
        group1.addStudent(s1);
        group1.addStudent(s2);
        group1.addStudent(s3);
        group1.addStudent(s4);
        group1.addStudent(s5);
        Group group2 = new Group("Tester3Bucharest", trainer2);
        group2.addStudent(s6);
        group2.addStudent(s7);
        group2.addStudent(s8);
        group2.addStudent(s9);
        group2.addStudent(s10);
        Group group3 = new Group("TeamSystem", trainer3);
        group3.addStudent(s11);
        group3.addStudent(s12);
        group3.addStudent(s13);
        group3.addStudent(s14);
        group3.addStudent(s15);

        List<Group> list = new ArrayList<>();
        list.add(group1);
        list.add(group2);
        list.add(group3);
        StringBuilder str1 = new StringBuilder();
        str1.append(2) ;
        System.out.println(list.get(0));
    }
}

class Group{
    private final String name;
    private final Trainer trainer;
    private final List<Student> students;

    public Group(String name, Trainer trainer) {
        this.name = name;
        this.trainer = trainer;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group{name='").append(getName()).append("', trainer=").append(trainer.getFirstname()).append(", students=[");
        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i).getFirstname());
            if (i < students.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }
//    public String toString() {
//        return "Group{" +
//                "name='" + getName() + '\'' +
//                ", trainer=" + trainer.getFirstname() +
//                ", students=" +
//                '}';
//    }
}