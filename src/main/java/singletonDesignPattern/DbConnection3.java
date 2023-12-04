package singletonDesignPattern;

public class DbConnection3 {
   private static DbConnection3 object=null;
   private DbConnection3(){

    }
    public static DbConnection3 getInstance(){
       if (object==null){
           synchronized (DbConnection3.class) {
               if (object == null) {
                   object = new DbConnection3();
               }
           }
       }
       return object;
    }
}
