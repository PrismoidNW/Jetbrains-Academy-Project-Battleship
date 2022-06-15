import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String str = inputStream.readLine();
        inputStream.close();
        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte);
        }
    }
}