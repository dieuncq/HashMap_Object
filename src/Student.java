import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    public String s_Name;
    public Integer i_Age;
    public String s_Class;

    public Student(String s_Name, Integer i_Age, String s_Class) {
        this.s_Name = s_Name;
        this.i_Age = i_Age;
        this.s_Class = s_Class;
    }
}

class HashMap_Exercise {
    public static void Exercise() {
        Map<Integer, Student> map_Student = new HashMap<Integer, Student>();

        map_Student.put(1, new Student("Nguyen Van A", 18, "14DN1"));
        map_Student.put(2, new Student("Le Thi B", 20, "14DN2"));
        map_Student.put(3, new Student("Truong Ngoc C", 19, "14DN1"));
        map_Student.put(4, new Student("Hoang Hoa D", 18, "14DN3"));
        map_Student.put(5, new Student("Ngo Thi E", 20, "15DN2"));
        map_Student.put(6, new Student("Luong Thi F", 20, "15DN3"));

        System.out.println("\nList student:");

        Student x;
        for (Integer i_Index : map_Student.keySet()) {
            x= map_Student.get(i_Index);
            System.out.println("Student " + i_Index + ":");
            System.out.println("Name: " + x.s_Name);
            System.out.println("Age: " + x.i_Age);
            System.out.println("Class: " + x.s_Class + "\n");
        }

        System.out.println("List students before remove");
        for (Map.Entry<Integer, Student> y : map_Student.entrySet()) {
            System.out.println("Student " + y.getKey() + ":");
            System.out.println("Name: " + y.getValue().s_Name);
            System.out.println("Age: " + y.getValue().i_Age);
            System.out.println("Class: " + y.getValue().s_Class + "\n");
        }

        System.out.println("List students after removed");
        map_Student =
            map_Student
                .entrySet()
                .stream()
                .filter(z -> z.getValue().i_Age < 20)
                .collect(Collectors.toMap(z->z.getKey(), z->z.getValue()));

        for (Map.Entry<Integer, Student> y : map_Student.entrySet()) {
            System.out.println("Student " + y.getKey() + ":");
            System.out.println("Name: " + y.getValue().s_Name);
            System.out.println("Age: " + y.getValue().i_Age);
            System.out.println("Class: " + y.getValue().s_Class + "\n");
        }
    }
}