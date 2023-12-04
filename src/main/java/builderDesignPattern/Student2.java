package builderDesignPattern;

public class Student2 {
    private  String name;
    private int age;
    private String phone;
    private String batch;
    private String email;
    private String password;

    public Student2(StudentHelper2 helper){
        if(helper.name==null){
            throw new NullPointerException("name should not be null");
        }
        this.name=helper.name;
        this.age=helper.age;
        this.batch= helper.batch;
        this.email= helper.email;
        this.phone= helper.phone;
        this.password=helper.password;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", batch='" + batch + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
