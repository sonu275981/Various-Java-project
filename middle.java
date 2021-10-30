import java.io.*;
class middle
{
public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    if(a >b) {
        int temp = a;
        a = b;
        b = temp;
    }

    if(b >c) {
        int temp = b;
        b = c;
        c = temp;
    }

    if(a >b) {
        int temp = a;
        a = b;
        b = temp;
    }

    System.out.println(b);
    }
}
