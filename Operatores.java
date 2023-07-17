public class Operatores {
    public static void main(String a[]){
        // Arthmatic  + , - , * , / 
        int num1 = 70;
        int num2 = 50;
        //int res = num1 / num2;//
        int rem = num1 % num2;
        //increment and decrement ++ , --
        //num1 = num1 + 2;
        num1+=2;
        //System.out.println(++num1);

        //Relational --> < , > , == ,!=

        int x = 6;
        int y = 5;
        boolean ans = x != y;
        //System.out.println(ans);

        //logical operatores && , || , !
        boolean res = (x > y) || (x < y);
        System.out.println(!res);
    }

}

