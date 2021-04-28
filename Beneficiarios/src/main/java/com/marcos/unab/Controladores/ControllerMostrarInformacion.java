package com.marcos.unab.Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marcos.unab.Entidades.Usuario;
import com.marcos.unab.negocio.ClsConsultaDUI;

/**
 * Servlet implementation class ControllerMostrarInformacion
 */
public class ControllerMostrarInformacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerMostrarInformacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String DUI = request.getParameter("dui");
		Usuario usua = new Usuario();
		usua.setDUI(DUI);
		
		ClsConsultaDUI consul = new ClsConsultaDUI();
		int validacion2 = consul.consulta(usua);
		if(validacion2 == 1) {
			response.sendRedirect("Beneficiario.jsp");
		}else {
			response.sendRedirect("NoBeneficiario.jsp");
		}
	}

}
