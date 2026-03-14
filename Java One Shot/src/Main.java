

class Human {
    public void speak() {
        System.out.println("i am a normal human yay");
    }
}
//student is a human
class Student extends Human {
//    name, id,dept

    private String name;
    private int id;
    private  String department;
   public static int studentCount=0;
    //setters
    public void setName(String name) {
        this.name=name; //reference
//        this->name=name;
        System.out.println("name is set in the object");

    }

    @Override
    public void speak() {
        System.out.println("i am a student ");
    }
    public void getName() {
        System.out.println(name + " is the name inside the object");
    }

    Student() {
//default
        studentCount++;
    }

    Student(int id,String name,String department) {
        this.id=id;
        this.name=name;//paramterizd
        this.department=department;
        studentCount++;

    }
    public static void showCOunt(){
        System.out.println(Student.studentCount);
    }
}
class Main {


    public static void main () {

        System.out.println("hello");
        Student s1=new Student();
        Student s2=new Student(2,"abc","def");
//        System.out.println(s2.name);

        //50 students data

        Student s3= new Student();
        s3.setName("XYZ");
        s3.getName();
        Student.showCOunt();
    s3.speak();
    }

}

