package es.loyola.iitv.pdm.pvcheck;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.mockito.Mockito;

import services.registroServlet;

public class registroTest {

	public void testDoPostHttpServletRequestHttpServletResponse() throws ServletException {
		
		HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse resp = Mockito.mock(HttpServletResponse.class);
		
		when(req.getParameter("nombre")).thenReturn("Manolo");
		when(req.getParameter("apellidos")).thenReturn("Escobar Marquez");
		when(req.getParameter("correo")).thenReturn("manolito@gmail.es");
		when(req.getParameter("password")).thenReturn("123");
		when(req.getParameter("edad")).thenReturn("35");
		when(req.getParameter("genero")).thenReturn("Hombre");
		when(req.getParameter("avatar")).thenReturn("Avatar1");
		when(req.getParameter("puestoDeTrabajo")).thenReturn("Transporte");
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		try {
			Mockito.when(resp.getWriter()).thenReturn(writer);
			new registroServlet().doPost(req, resp);
			
			System.out.println(stringWriter.toString());
			
			JSONObject obj = new JSONObject(stringWriter.toString());
			String code = obj.getString("code");
			assertTrue("Codigo devuelto es ok", code.equalsIgnoreCase("ok"));
			
			String message = obj.getString("message");
			assertTrue("Mensaje devuelto es incorrecto", message.equalsIgnoreCase("res"));
			
			JSONArray array = obj.getJSONArray("result");
			assertTrue("Tamaño array incorrecto", array.length() == 1);
			
			JSONObject o1 = array.getJSONObject(0);
			o1.getString("usuario");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
