//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("117.16.243.99", 5500);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String recv = bufferedReader.readLine();
            System.out.println(recv);
        } catch (IOException var6) {
            System.out.println("에러 발생\n");
        }
    }
}
