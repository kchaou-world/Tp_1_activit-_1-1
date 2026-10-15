package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            IO.println("Je suis un client pas encore connecté…");

            Socket socket = new Socket("localhost", 1234);
            IO.println("je suis un client connecté");

            socket.close();
        } catch (IOException _) {
        }
    }
}