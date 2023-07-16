//java installation in mac
//first go to jdk in oracel and download it after that install it --> Arm 64 DMG installer
//step up the path 
//open terminal and type java --version(see the version)
//we need to set the java_home veriable
//1. creat a file -> touch ~/.zshenv
//2. open ~/.zshenv --> A file will be open (export JAVA_HOME=$(usr/libexec/java_home))
//3.source ~/.zshenv
//eacho $JAVA_HOME
//like python we have shell in jave 
//to open that go to terminal and type jshell
//to compail java code -> javac filename.java
//to run the code --> java filename
//jvm -> java virtual machine
//JRE -> jave runtime environament
//<-------------------------------------------------------------------------------------------->
//there are two types of data type
//1.primitive (integers,float,character,boolen)
//integers ->byte(1 byte->8 bits-> -2^7 to 2^7-1) , short(2 bytes) , int(4 bytes) ,long(8 bits)
//float ->double(8 bytes), float(4 bytes) in java by defult it is double 
//char -> 2 bytes -> UNICODE
//boolean -> true or false

class hello{
    public static void main(String a[])
    {
        //literals

        int num = 585;
        int num1 = 0b101;//binary
        int num2 = 0x7E; // hexa decimal
        int b = 10_00_000;//easy to count zeros
        double d = 12e10;
        char c = 'a';
        c++;
        System.out.println(c);
    }    
}
