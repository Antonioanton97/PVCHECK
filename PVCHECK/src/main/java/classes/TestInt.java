package classes;

import java.util.ArrayList;

public interface TestInt {
	public enum Categoria{General, Pantalla, Teclado, Ratón, Silla, Entorno, Software, Organización}

	int getIdTest();

	void setIdTest(int idTest);

	Categoria getCategoria();

	void setCategoria(Categoria categoria);

	ArrayList<Pregunta> getListaPreguntas();

	void setListaPreguntas(ArrayList<Pregunta> listaPreguntas);

}