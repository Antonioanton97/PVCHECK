package classes;


import java.util.ArrayList;

public class Pregunta implements PreguntaInt {
	private int idPregunta;
	private String cuestionPregunta, respuestaCorrecta, correccion;
	private ArrayList<String> listaRespuesta;
	private ImagenInt imagen;
	public Pregunta(int idPregunta, String cuestionPregunta, String respuestaCorrecta, String correccion, ArrayList<String> listaRespuesta,
			ImagenInt imagen) {
		super();
		this.idPregunta = idPregunta;
		this.cuestionPregunta = cuestionPregunta;
		this.respuestaCorrecta = respuestaCorrecta;
		this.correccion = correccion;
		this.listaRespuesta = listaRespuesta;
		this.imagen = imagen;
	}
	@Override
	public int getIdPregunta() {
		return idPregunta;
	}
	public String getCorreccion() {
		return correccion;
	}
	@Override
	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}
	public void setCorreccion(String Correccion) {
		this.correccion = correccion;
	}
	@Override
	public String getCuestionPregunta() {
		return cuestionPregunta;
	}
	@Override
	public void setCuestionPregunta(String cuestionPregunta) {
		this.cuestionPregunta = cuestionPregunta;
	}
	@Override
	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	@Override
	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	@Override
	public ArrayList<String> getListaRespuesta() {
		return listaRespuesta;
	}
	@Override
	public void setListaRespuesta(ArrayList<String> listaRespuesta) {
		this.listaRespuesta = listaRespuesta;
	}
	@Override
	public ImagenInt getImagen() {
		return imagen;
	}
	@Override
	public void setImagen(ImagenInt imagen) {
		this.imagen = imagen;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuestionPregunta == null) ? 0 : cuestionPregunta.hashCode());
		result = prime * result + idPregunta;
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		result = prime * result + ((listaRespuesta == null) ? 0 : listaRespuesta.hashCode());
		result = prime * result + ((respuestaCorrecta == null) ? 0 : respuestaCorrecta.hashCode());
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
		Pregunta other = (Pregunta) obj;
		if (cuestionPregunta == null) {
			if (other.cuestionPregunta != null)
				return false;
		} else if (!cuestionPregunta.equals(other.cuestionPregunta))
			return false;
		if (idPregunta != other.idPregunta)
			return false;
		if (imagen == null) {
			if (other.imagen != null)
				return false;
		} else if (!imagen.equals(other.imagen))
			return false;
		if (listaRespuesta == null) {
			if (other.listaRespuesta != null)
				return false;
		} else if (!listaRespuesta.equals(other.listaRespuesta))
			return false;
		if (respuestaCorrecta == null) {
			if (other.respuestaCorrecta != null)
				return false;
		} else if (!respuestaCorrecta.equals(other.respuestaCorrecta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pregunta [idPregunta=" + idPregunta + ", cuestionPregunta=" + cuestionPregunta + ", respuestaCorrecta="
				+ respuestaCorrecta + ", listaRespuesta=" + listaRespuesta + ", imagen=" + imagen + "]";
	}
	
	
	
}
