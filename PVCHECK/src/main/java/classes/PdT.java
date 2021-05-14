package classes;

import java.util.ArrayList;
import java.util.Arrays;


public class PdT implements PdTInt {
	private int idPdT, resultadoPdT[]= {0,0,0,0,0,0,0,0};
	private String infoPdt;
	private ArrayList<String> listaCorecciones;
	
	
	public PdT(int idPdT, String infoPdt) {
		super();
		this.idPdT = idPdT;
		this.infoPdt = infoPdt;
	}
	@Override
	public int getIdPdT() {
		return idPdT;
	}
	@Override
	public void setIdPdT(int idPdT) {
		this.idPdT = idPdT;
	}
	@Override
	public int[] getResultadoPdT() {
		return resultadoPdT;
	}
	@Override
	public void setResultadoPdT(int[] resultadoPdT) {
		this.resultadoPdT = resultadoPdT;
	}
	@Override
	public String getInfoPdt() {
		return infoPdt;
	}
	@Override
	public void setInfoPdt(String infoPdt) {
		this.infoPdt = infoPdt;
	}
	
	@Override
	public ArrayList<String> getListaCorecciones() {
		return listaCorecciones;
	}
	@Override
	public void setListaCorecciones(ArrayList<String> listaCorecciones) {
		this.listaCorecciones = listaCorecciones;
	}
	public void anadirCorreccion(String correccion) {
		this.listaCorecciones.add(correccion);
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPdT;
		result = prime * result + ((infoPdt == null) ? 0 : infoPdt.hashCode());
		result = prime * result + ((listaCorecciones == null) ? 0 : listaCorecciones.hashCode());
		result = prime * result + Arrays.hashCode(resultadoPdT);
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
		PdT other = (PdT) obj;
		if (idPdT != other.idPdT)
			return false;
		if (infoPdt == null) {
			if (other.infoPdt != null)
				return false;
		} else if (!infoPdt.equals(other.infoPdt))
			return false;
		if (listaCorecciones == null) {
			if (other.listaCorecciones != null)
				return false;
		} else if (!listaCorecciones.equals(other.listaCorecciones))
			return false;
		if (!Arrays.equals(resultadoPdT, other.resultadoPdT))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PdT [idPdT=" + idPdT + ", resultadoPdT=" + Arrays.toString(resultadoPdT) + ", infoPdt=" + infoPdt
				+ ", listaCorecciones=" + listaCorecciones + "]";
	}
	
	
}
