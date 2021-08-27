public class MyClass {
    int rollno;
    String name;

  void insertRecord(int r, String n){//method
  rollno=r;
  name=n;
 }

 void displayInformation(){System.out.println(rollno+" "+name);}//method

    public static void main(String args[]) {
     MyClass s1=new MyClass();
     MyClass s2=new MyClass();

  s1.insertRecord(111,"Karan");
  s2.insertRecord(222,"Aryan");

  s1.displayInformation();
  s2.displayInformation();
    }
}