package builderDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class ClientBuilderDesignPattern {
    public static void main(String[] args) {
//        Map<ParamValue1,Object> map=new HashMap<>();
//        map.put(ParamValue1.first_name,"avinash");
//        map.put(ParamValue1.last_name,"NARAYAN");
//        map.put(ParamValue1.roll_no,12);
//        map.put(ParamValue1.batch,"firstbatch");
//        map.put(ParamValue1.section,"c");
//        map.put(ParamValue1.city,"kanpur");
//        map.put(ParamValue1.email,"avinash@gmail.com");
//        map.put(ParamValue1.phone_no,997377838);
//        map.put(ParamValue1.standard,"5th");
//        Student1 student=new Student1(map);
//        StudentHelper2 s2=new StudentHelper2();
//        s2.setName(null);
//        s2.setAge(12);
//        s2.setBatch("firstbatch");
//        s2.setEmail("avinash@gmail.com");
//        s2.setPassword("avi123");
//        s2.setPassword("123");
//        Student2 student2=new Student2(s2);
//        System.out.println(student2.toString());
        Student3 student=new Student3.StudentBuilder().setName("avinash narayan").
                setAge(20).
                setEmail("avinsh@gmail.com").
                setBatch("firstbatch").setPhone("8728085030").build();
        System.out.println(student.toString());
    }
}
