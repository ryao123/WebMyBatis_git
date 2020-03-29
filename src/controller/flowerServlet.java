package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.flower;
import service.FlowerService;
import service.impl.FlowerServiceImpl;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class flowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//创建一个业务层对象
			private FlowerService us=new FlowerServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flowerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//调用业务层中的方法
		List<flower> list=us.getAll();
		//将数据保存到作用域中
		request.getSession().setAttribute("list",list);
		response.sendRedirect("index.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
