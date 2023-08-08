public class stringgs {
    public static void main(String args[]){
        String name = new String("Ashok");
        String name1 = "Ashok"; // another way of declering string --> address -> 101
        System.out.println(name1);
        System.out.println(name.hashCode());//hash code
        System.out.println("hello "+name);
        System.out.println(name.charAt(1));//look what character at particular index
        System.out.println(name.concat(" Marnala"));//to concanate the strings

        //String in java are immutable 
        //example
        name1 = name1 + " Don";//address whill chage let use say 105
        //it creat a new string with a new reference 

        String s1 = "Ashok";
        String s2 = "Ashok";
        //one reference is created i.e the address of s1 and s2 are same 
        System.out.println(s1==s2);

        //what if you want mutable strings
        //thats why we have two different classes
        //1.String Buffer or 2.string builder

        //let us have look on string buffer
        //it actomatically give 16 bits 
        StringBuffer sb = new StringBuffer("Ashok");
        System.out.println(sb.capacity());//capacity will be sizeof "Ashok" + 16
        System.out.println(sb.length());
        sb.append(" Marnala");
        sb.deleteCharAt(2);
        sb.insert(5,"java ");
        System.out.println(sb.substring(0,5));
        System.out.println(sb);
        

    }
}
