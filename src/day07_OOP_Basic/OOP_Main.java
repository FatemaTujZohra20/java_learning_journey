package day07_OOP_Basic;

public class OOP_Main {
    public static void main(String[] args) {

        Student s1 = new Student();   // object 1
        Student s2 = new Student();   // object 2

        // Assign values to object s1
        s1.id = 1;
        s1.name = "Fatema";
        s1.age = 22;

        // Assign values to object s2
        s2.id = 2;
        s2.name = "Ayaan";
        s2.age = 20;

        // Call method using objects
        s1.displayInfo();
        System.out.println("--------");
        s2.displayInfo();
        System.out.println("##########################");

        // Array of objects
        Student[] studs = new Student[2];
        studs[0] = s1;
        studs[1] = s2;

        // Enhanced For Loop
        for (Student studentObj : studs) {
            studentObj.displayInfo();
            System.out.println("----------------------");
        }

    }
}
