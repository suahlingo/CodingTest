package CodingTest.sua;

import java.io.*;

public class HelloWorld_2557 {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");
        bw.flush();
        bw.close();

    }
}
