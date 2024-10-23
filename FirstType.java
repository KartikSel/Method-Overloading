package MethodOverloading;
class Test1{

    public int add(int i , int j , int k)
    {
        return i+j+k;
    }
    public int add(int i , int j)
    {
        return i+j;
    }
}
public class FirstType{
    public static void main(String[] args) { // "Overloading with Numbers of Arguments"
        Test1 ob = new Test1();
       System.out.println(ob.add(10, 20, 25));
        System.out.println(ob.add(25, 25));
    }

}
