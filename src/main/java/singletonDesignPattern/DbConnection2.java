package singletonDesignPattern;

public class DbConnection2 {
     private static final DbConnection2 dbConnection2=new DbConnection2();
    private DbConnection2(){

    }
    public static DbConnection2 getInstance(){
        return dbConnection2;
    }
}
