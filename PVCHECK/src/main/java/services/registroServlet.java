package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import classes.PdT;
import classes.Usuario;
import classes.UsuarioInt.Avatar;
import classes.UsuarioInt.Genero;

//url/nommbreProyecto/rutaDeServicio
@WebServlet(urlPatterns="/registro")
public class registroServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombre = req.getParameter("nombre");
		String apellidos = req.getParameter("apellidos");
		String correo = req.getParameter("correo");
		String password = req.getParameter("password");
		String edadString = req.getParameter("edad");
		String generoString = req.getParameter("genero");
		String avatarString = req.getParameter("avatar");
		String pdtInfoString = req.getParameter("infoPuestoDeTrabajo");
		Integer edad= Integer.parseInt(edadString);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/plain");
		
		
		PdT puestoDeTrabajoNew= new PdT(1, "Puesto en Secretaria General en la Universidad Loyola de Andalucia");
		Usuario usuarioNew= new Usuario(1, edad, nombre, apellidos, password, puestoDeTrabajoNew, Genero.Hombre, Avatar.Avatar1); 
		
		PrintWriter writer;
		JSONArray arrayUsuario = new JSONArray();
		try {
			writer= resp.getWriter();
			JSONObject respuesta = new JSONObject();
			
			respuesta.put("UsuarioNuevo", usuarioNew);
			
			arrayUsuario.put(respuesta);
			
			if (!arrayUsuario.isEmpty()) { 
				respuesta.put("code", "ok");
				respuesta.put("message", "res");
				respuesta.put("result", arrayUsuario);
				
			} else {
				respuesta.put("code", "Error");
				respuesta.put("message", "nombreError");
				respuesta.put("result", new JSONObject());

			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
