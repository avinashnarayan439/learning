package singletonDesignPattern;

public class DbConnection1 {
    static DbConnection1 object=null;
    private DbConnection1(){
    }
    public static DbConnection1 getInstance(){
        if(object==null){
            object=new DbConnection1();
        }
        return object;
    }

}
