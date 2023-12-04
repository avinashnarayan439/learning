package builderDesignPattern;

import java.security.InvalidParameterException;

public class Student3 {
    private String name;
    private int age;
    private String phone;
    private String batch;
    private String email;

//    public static StudentBuilder getBuilder() {
//        return new StudentBuilder();
//    }

    private Student3() {

    }

    public static class StudentBuilder {
        private Student3 student = new Student3();

        public StudentBuilder setName(String name) {
            student.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            student.age = age;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            student.phone = phone;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            student.batch = batch;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            student.email = email;
            return this;
        }
        public Student3 build(){
            if(student.age<18){
                throw new InvalidParameterException("under age student are not allowed");
            }
            if(student.name==null){
                throw new NullPointerException("must fill name in the space given");
            }
            return student;
        }
    }

//    @Override
//    public String toString() {
//        return "Student3{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", phone='" + phone + '\'' +
//                ", batch='" + batch + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
