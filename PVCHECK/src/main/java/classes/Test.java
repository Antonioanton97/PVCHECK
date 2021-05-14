package classes;

import java.util.ArrayList;

public class Test implements TestInt {
	private int idTest;
	private Categoria categoria;
	private ArrayList<Pregunta> listaPreguntas;
	public Test(int idTest, Categoria categoria, ArrayList<Pregunta> listaPreguntas) {
		super();
		this.idTest = idTest;
		this.categoria = categoria;
		this.listaPreguntas = listaPreguntas;
	}
	@Override
	public int getIdTest() {
		return idTest;
	}
	@Override
	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	@Override
	public Categoria getCategoria() {
		return categoria;
	}
	@Override
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public ArrayList<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}
	@Override
	public void setListaPreguntas(ArrayList<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTest;
		result = prime * result + ((listaPreguntas == null) ? 0 : listaPreguntas.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (idTest != other.idTest)
			return false;
		if (listaPreguntas == null) {
			if (other.listaPreguntas != null)
				return false;
		} else if (!listaPreguntas.equals(other.listaPreguntas))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", listaPreguntas=" + listaPreguntas + "]";
	}
	
	
}
