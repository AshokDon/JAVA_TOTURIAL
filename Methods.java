class Computer{
    public void PlayMusic(){
        System.out.println("yoo Yoo");
    }
    public String GetPen(int cost){
        return "PEN";
    }
}

public class Methods{
    public static void main(String[] a){
        //creat an object
        Computer HP = new Computer();
        HP.PlayMusic();
        String s = HP.GetPen(10);
        System.out.println(s);
    }
}