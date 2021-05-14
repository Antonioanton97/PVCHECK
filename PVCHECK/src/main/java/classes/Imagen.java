package classes;

public class Imagen implements ImagenInt {
	private int idImagen;
	private String url;
	public Imagen(int idImagen, String url) {
		super();
		this.idImagen = idImagen;
		this.url = url;
	}
	@Override
	public int getIdImagen() {
		return idImagen;
	}
	@Override
	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}
	@Override
	public String getUrl() {
		return url;
	}
	@Override
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idImagen;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Imagen other = (Imagen) obj;
		if (idImagen != other.idImagen)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Imagen [idImagen=" + idImagen + ", url=" + url + "]";
	}
	
	
}
