public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String s1 = "hello world";
        String s2 = "hello world";

        String s3 = new String("hello world");

        // compare equals
        if( s1.equals(s2) ) {
            System.out.println("s1 equals s2");
        }

        // compare references
        if( s1 == s2 ) {
            System.out.println("s1 == s2");
        }

        // compare just values
        if(s1.equals(s3)) {
            System.out.println("s1 equals s3");
        }

        // compare references
        if( s1 == s3 ) {
            System.out.println("s1 == s3");
        }
    }
}
