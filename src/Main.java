import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Phong", 22, "HN");
        Student student2 = new Student("Em", 22, "HN");
        Student student3 = new Student("Cac", 22, "HN");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("....Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}