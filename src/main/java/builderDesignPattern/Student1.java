package builderDesignPattern;

import java.util.Map;

public class Student1 {
    private String first_name;
    private String last_name;
    private int roll_no;
    private String batch;
    private String standard;
    private String section;
    private double phone_no;
    private String email;
    private String city;
    public Student1(Map<ParamValue1,Object> parameter){
        this.first_name=(String) parameter.get(ParamValue1.first_name);
        this.last_name=(String) parameter.get(ParamValue1.last_name);
        this.roll_no=(int)parameter.get(ParamValue1.roll_no);
        this.batch=(String) parameter.get(ParamValue1.batch);
        this.standard=(String) parameter.get(ParamValue1.standard);
        this.section=(String) parameter.get(ParamValue1.section);
        this.phone_no=(int) parameter.get(ParamValue1.phone_no);
        this.email=(String) parameter.get(ParamValue1.email);
        this.city=(String) parameter.get(ParamValue1.city);
    }

}
