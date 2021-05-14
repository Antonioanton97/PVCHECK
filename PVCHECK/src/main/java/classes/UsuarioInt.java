package classes;

public interface UsuarioInt {
	public enum Genero{Hombre, Mujer, Otro};
	public enum Avatar{Avatar1, Avatar2, Avatar3};

	int getIdUsuario();

	void setIdUsuario(int idUsuario);

	int getEdad();

	void setEdad(int edad);

	String getNombre();

	void setNombre(String nombre);

	String getApellidos();

	void setApellidos(String apellidos);

	String getPassword();

	void setPassword(String password);

	PdTInt getPuestoDeTrabajo();

	void setPuestoDeTrabajo(PdTInt puestoDeTrabajo);

	Genero getGenero();

	void setGenero(Genero genero);

}