package classes;

import java.util.ArrayList;

public interface PdTInt {

	int getIdPdT();

	void setIdPdT(int idPdT);

	int[] getResultadoPdT();

	void setResultadoPdT(int[] resultadoPdT);

	String getInfoPdt();

	void setInfoPdt(String infoPdt);

	ArrayList<String> getListaCorecciones();

	void setListaCorecciones(ArrayList<String> listaCorecciones);
	
	void anadirCorreccion(String correccion);

}