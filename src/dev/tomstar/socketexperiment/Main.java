package dev.tomstar.socketexperiment;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    Thread server = new Thread(new Server());
	    server.start();

	    Thread client1 = new Thread(new Client());
		client1.start();

		Thread client2 = new Thread(new Client());
		client2.start();
    }

}
