public class Main {

    public static void method() throws NullPointerException {
        String str = null;
        str.toCharArray();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}