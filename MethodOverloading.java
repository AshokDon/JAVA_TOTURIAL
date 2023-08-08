//Method Overloading
//
class calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        //create an object
        calculator cal = new calculator();
        int r = cal.add(10,20);
        System.out.println(r);
    

    }

}
