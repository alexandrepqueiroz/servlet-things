package ex1.br.edu.pucgo.alexandrepontes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		//pegando os parâmetros do request
		String nomeInserido = req.getParameter("user");
		String senhaInserida = req.getParameter("password");
		
		//monta um objeto usuário
		Usuario user = new Usuario();
		user.setNome(nomeInserido);
		user.setSenha(senhaInserida);
		
		//autentica o usuário
		
		if (user.getNome().equals("adm") && user.getSenha().equals("masterkey")) {

			resp.sendRedirect("telainicial.html");
		}
		else {
			
			out.println("<html>");
			out.println("<body>");
			out.println("Usuário ou senha inválidos!!");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

	
}