package resoruces;

public class SingleTonClass {
    public static void main(String[] args) {
        singleTonExample obj = singleTonExample.getInstance();


    }
}


//SingleTon class allows only one instance
class singleTonExample{

    //you can use the Singleton design pattern to ensure that certain objects or components are instantiated only once and accessed globally throughout your automation code
    //Has Static instantiation
    static singleTonExample obj=new singleTonExample();

    //Has private constructor
    private singleTonExample(){

    }

    //has static method returns instances
    public static singleTonExample getInstance(){
        return obj;
    }
}
