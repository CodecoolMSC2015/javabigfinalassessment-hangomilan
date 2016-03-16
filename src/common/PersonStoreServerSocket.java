package common;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonStoreServerSocket
{

	////////////////////////////////////////////////////////////////////////

	DataReader store;

	////////////////////////////////////////////////////////////////////////

	// Server

	public static void start() throws Exception
	{
		System.out.println("Server Started.");
		ServerSocket serverSocket = new ServerSocket(8000);
		System.out.println("Waiting for clients...");
		Socket socket = serverSocket.accept();
		System.out.println("Client connected.");
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		while (true)
		{
			oos.write(1);
			oos.writeObject("CSV file load...");
			System.out.println("Client connected: " + socket);
			break;
		}
		oos.close();
		socket.close();
		serverSocket.close();
	}

	public static void main(String[] args) throws Exception
	{
		start();
	}

	////////////////////////////////////////////////////////////////////////

}
