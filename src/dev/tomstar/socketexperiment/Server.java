package dev.tomstar.socketexperiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

    private final ServerSocket socket;

    public Server() throws IOException {
        this.socket = new ServerSocket(6666);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Socket client = socket.accept();
                BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String message = input.readLine();
                System.out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
