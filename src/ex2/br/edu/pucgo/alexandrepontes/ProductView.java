package ex2.br.edu.pucgo.alexandrepontes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/produtos")
public class ProductView extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductController p = new ProductController();
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println("Lista de produtos");
		String productId = req.getParameter("id");
		
		if(productId == null) {
			
			List<Product> produtos = p.returnListOfProducts();
			writer.println("<ul>");
			for (Product product : produtos) {
				writer.println("<li>" + product.getId()+ 
								":" + " Nome: " + product.getName() + ";" +
								" " + " Categoria: " + product.getProductCategory() +  ";" +
								" " + " Preço: " + product.getPrice() + "</li>");
			}
			
			writer.println("</ul>");
		}
		else {
			Product produto = p.returnProduct(Integer.parseInt(productId));
			
			writer.println("<li>" + produto.getId()+ 
					":" + " Nome: " + produto.getName() + ";" +
					" " + " Categoria: " + produto.getProductCategory() +  ";" +
					" " + " Preço: " + produto.getPrice() + "</li>");
		}
		
		
		writer.println("</body></html>");

	}

}
