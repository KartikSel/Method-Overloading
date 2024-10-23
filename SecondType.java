package MethodOverloading;

class Test2{

    public void show(int i , String j)
    {
        System.out.println("Welcome" +i);
    }
    public void show(String j, int i )
    {
        System.out.println("Welcome" +i);
    }
}
public class SecondType { //"Overloading with Different Sequence of Arguments"
    public static void main ( String [] args)
    {
        Test2 ob = new Test2();
        ob.show(14,"Java");
        ob.show("Home",15);
    }
}
