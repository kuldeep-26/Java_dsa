// public class OOPS{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.name = "Harsh";
//         s1.roll = 26;
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);

//         s1.marks[2] = 100;

//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }
//     }
// }
// class Student{
//     String name;
//     int roll;
//     int marks[];

//     // Shallow copy....
//     // Student(Student s1){
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;
//     // }

//     // Deep copy.....
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0; i<3; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called......");
//     }

//     Student(String name){
//         marks = new int[3];        
//         this.name = name;
//     }

//     Student(int roll){
//         marks = new int[3];        
//         this.roll = roll;
//     }
// }

abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class OOPS extends Car {
    {
        System.out.print("4");
    }

    public OOPS() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        new OOPS();
    }
}
