import java.io.* ;

class A {
    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer("Hello ");
        StringBuffer sb2 = new StringBuffer("Hello ");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));  //refrences ko compare karega

        // == compares address location of the strings.
        // .equals compares content inside the strings.
        // compare to agar string ki baat kare to wo compare karra tha or agar string builder ki baat kare to refrence variable ki tarah act karra tha


        // string jab hum declare karte hai to 2 jagah object bante h
        // pehle hai heap or dursra SCP(string constant pull)
        //fpr eg-
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "hello";
        String s4 = "hello";
        //here 3 object banenge 2 heap me or 1 scp me

    }
    // STring buffer thread safe hota hai
    // String buffer is more synchronised

    // string builder is not thread safe
    // string builder is not synchronised
}
