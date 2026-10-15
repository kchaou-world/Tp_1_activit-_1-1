package serverPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // Étape 1
            ServerSocket serverSocket = new ServerSocket(1234);
            IO.println("Je suis un serveur en attente la connexion d'un client ");

            // Étape 2
            Socket socket = serverSocket.accept();
            IO.println("un client est connecté");

            // Étape 3
            socket.close();
            serverSocket.close();
        } catch (IOException _) {
        }
    }
}