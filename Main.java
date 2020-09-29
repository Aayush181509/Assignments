package Aayush181509;


 class Student{

    private String name;
    private int roll;
    private String college;
    static private int counter=0;

    public Student(String n,int r,String c){
        this.name=n;
        this.roll=r;
        this.college=c;
        counter+=1;

    }
    public void getData(){
        System.out.println("Name:"+name+"\n"+"Roll no "+roll+"\n"+"College "+college);
        
    }
    static void total(){
        System.out.println("No of Object Created= "+counter);
    }
    
}
public class Main{
    public static void main(String[] args) {
        Student obj1=new Student("Aayush", 181509, "NCIT");
        Student obj2=new Student("Ujjwal", 181547, "NCIT");
        Student obj3=new Student("Umesh", 181548, "NCIT");
        obj1.getData();
        obj2.getData();
        obj3.getData();
        Student.total();
    }
}