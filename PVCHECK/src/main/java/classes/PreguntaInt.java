package classes;

import java.util.ArrayList;

public interface PreguntaInt {

	int getIdPregunta();

	void setIdPregunta(int idPregunta);

	String getCuestionPregunta();

	void setCuestionPregunta(String cuestionPregunta);

	String getRespuestaCorrecta();

	void setRespuestaCorrecta(String respuestaCorrecta);

	ArrayList<String> getListaRespuesta();

	void setListaRespuesta(ArrayList<String> listaRespuesta);

	ImagenInt getImagen();

	void setImagen(ImagenInt imagen);

	int hashCode();

	boolean equals(Object obj);

	String toString();

}