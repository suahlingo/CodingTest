package CodingTest.sua;

import java.io.*;

public class MultiplicationTable_2739 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++){
            bw.write(N + " * " + i + " = " + N*i);
            bw.newLine();
        }
        //꼭 쓰기 안쓰면 출력안됨
        bw.flush();
        bw.close();

    }

}
