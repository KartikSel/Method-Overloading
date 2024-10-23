package MethodOverloading;
class Test3{

    public void show(int i)
    {
        System.out.println(i);
    }
    public void show(String k)
    {
        System.out.println(k);
    }
}
public class ThirdType{
    public static void main (String[] args)
    {          //"Overloading with Different Arguments"
        Test3 ob = new Test3();
        ob.show(60);
        ob.show("Delhi");

    }
}
