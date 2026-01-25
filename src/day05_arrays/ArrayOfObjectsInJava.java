package day05_arrays;

class Learner {
    String name;
    int rollNo;
    int age;
    String subject;
}

public class ArrayOfObjectsInJava {
    public static void main(String[] args) {
        Learner a1 = new Learner();
        a1.name = "Lily";
        a1.rollNo = 1;
        a1.age = 19;
        a1.subject = "English";

        Learner a2 = new Learner();
        a2.name = "Pinky";
        a2.rollNo = 2;
        a2.age = 21;
        a2.subject = "Greek";

        Learner a3 = new Learner();
        a3.name = "Robinson";
        a3.rollNo = 3;
        a3.age = 31;
        a3.subject = "Spanish";

        Learner a4 = new Learner();
        a4.name = "Hundy";
        a4.rollNo = 4;
        a4.age = 42;
        a4.subject = "French";

        // Creating array of objects:
        Learner[] learners = new Learner[3];
        learners[0] = a1;
        learners[1] = a2;
        learners[2] = a3;

        // Regular for loop
        // -----------------------
        for (int i=0; i<learners.length; i++) {
            System.out.println(learners[i].rollNo + " " + learners[i].name + " " +
                                learners[i].age + " " + learners[i].subject);
        }

        System.out.println();

        // Enhanced for loop
        // ------------------------
        for (Learner learnerObj : learners) {
            System.out.println(learnerObj.rollNo +  ". " + learnerObj.name + " " +
                    learnerObj.age + " " + learnerObj.subject );
        }
    }
}
