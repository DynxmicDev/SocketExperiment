package dev.tomstar.socketexperiment;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    private final Socket socket;

    public Client() throws IOException {
        this.socket = new Socket("127.0.0.1", 6666);
    }

    @Override
    public void run() {
        try {
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println("Hello!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
