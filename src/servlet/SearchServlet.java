package servlet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		request.getRequestDispatcher("index.html").include(request, response);
	}

	////////////////////////////////////////////////////////////////////////

	// Client

	public static void main(String[] args) throws Exception
	{
		System.out.println("Client Started.");
		Socket socket = new Socket("localhost", 8000);
		System.out.println("Client Connecing to Server.");
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		while (true)
		{
			if (ois.read() > -1)
			{
				System.out.println("Server say: " + ois.readObject());
				break;
			}
		}
		ois.close();
		socket.close();
	}

	////////////////////////////////////////////////////////////////////////

}
