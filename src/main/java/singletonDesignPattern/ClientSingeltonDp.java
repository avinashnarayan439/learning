package singletonDesignPattern;

public class ClientSingeltonDp {
    public static void main(String[] args) {
        DbConnection1 dbConnection= DbConnection1.getInstance();
        DbConnection1 dbConnection1= DbConnection1.getInstance();
        int hashCode3 = System.identityHashCode(dbConnection);
        int hashCode4 = System.identityHashCode(dbConnection1);
        System.out.println("this is the address of singleton object"+" "+Integer.toHexString(hashCode3));
        System.out.println("this is the address of singleton object1"+" "+Integer.toHexString(hashCode4));
        DbConnection2 dbConnection2=DbConnection2.getInstance();
        DbConnection2 dbConnection3=DbConnection2.getInstance();
        int hashCode1 = System.identityHashCode(dbConnection2);
        int hashCode = System.identityHashCode(dbConnection3);
        System.out.println("this is the address of singleton object"+" "+Integer.toHexString(hashCode));
       System.out.println("this is the address of singleton object1"+" "+Integer.toHexString(hashCode1));
        DbConnection3 dbConnection5= DbConnection3.getInstance();
        DbConnection3 dbConnection6= DbConnection3.getInstance();
        int hashCode5 = System.identityHashCode(dbConnection5);
        int hashCode6 = System.identityHashCode(dbConnection6);
        System.out.println("this is the address of singleton object"+" "+Integer.toHexString(hashCode5));
        System.out.println("this is the address of singleton object1"+" "+Integer.toHexString(hashCode6));

    }
}
