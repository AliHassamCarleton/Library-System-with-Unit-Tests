package server.network;

import server.utilities.Config;

public class StartServer {
	public static void main(String[] argv) {
		System.out.println("Starting server ...");
		new LibServer(Config.DEFAULT_PORT);
	}
}
