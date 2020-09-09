package org.example;

public class App {

    public static void main(String[] args ) {
        Server server = new Server();
        Thread tServer = new Thread(server);
        Client client = new Client();
        Thread tClient = new Thread(client);
        tServer.start();
        tClient.start();
    }
}