public class Student {

    private String name;
    private int age;

    public Student(){
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void sayHello (){
        System.out.println("Xin chào, tôi là " + name + ", năm nay tôi " + age +" tuổi");
    }
}