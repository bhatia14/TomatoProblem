package main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstController
 */
@WebServlet("/FirstController")
public class FirstController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cluster=request.getParameter("cluster");
		String loose=request.getParameter("loose");
		System.out.println(cluster+" "+loose);
		String clustertray[]=new String[Integer.parseInt(cluster)];
		String loosetray[]=new String[Integer.parseInt(loose)];
		for(int i=0;i<clustertray.length;i++){
			int j=i+1;
			clustertray[i]=request.getParameter("clustertray"+j);
			System.out.println(clustertray[i]);
		}
		for(int i=0;i<loosetray.length;i++){
			int j=i+1;
			loosetray[i]=request.getParameter("loosetray"+j);
			System.out.println(loosetray[i]);
		}
		
		request.setAttribute("clusterSize", cluster);
		request.setAttribute("looseSize", loose);
		request.setAttribute("clusterTrayMax", clustertray);
		request.setAttribute("looseTrayMax", loosetray);
		request.getRequestDispatcher("/secondPage.jsp").forward(request, response);
	}

}
