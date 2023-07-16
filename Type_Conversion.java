public class Type_Conversion {
  public static void main(String a[]){
    //conversion and casting 
    byte b = 127;
    int z = 267;
   // b = a;//this can not be done because byte is a smaller container which can not
    //store int data;
    b = (byte) z;//--> casting (this conversion is done explicitly so it is call castint)
    //modulo it will divide it by 267%256 --> 1 
    z = b;//->conversion (this is done implicitly)
    float f = 5.6f;
    int x = (int) f;//we lose what ever we have after point
    System.out.println(x);




  }  
}
