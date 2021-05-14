package classes;

public class Usuario implements UsuarioInt {
	
	private int idUsuario, edad; 
	private String nombre, apellidos, password;  
	private PdTInt puestoDeTrabajo;
	private Genero genero;
	private Avatar avatar;
	
	public Usuario(int idUsuario, int edad, String nombre, String apellidos, String password, PdTInt puestoDeTrabajo,
			Genero genero, Avatar avatar) {
		super();
		this.idUsuario = idUsuario;
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.puestoDeTrabajo = puestoDeTrabajo;
		this.genero = genero;
		this.setAvatar(avatar);
	}
	@Override
	public int getIdUsuario() {
		return idUsuario;
	}
	@Override
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public int getEdad() {
		return edad;
	}
	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String getApellidos() {
		return apellidos;
	}
	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public PdTInt getPuestoDeTrabajo() {
		return puestoDeTrabajo;
	}
	@Override
	public void setPuestoDeTrabajo(PdTInt puestoDeTrabajo) {
		this.puestoDeTrabajo = puestoDeTrabajo;
	}
	
	@Override
	public Genero getGenero() {
		return genero;
	}
	@Override
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((avatar == null) ? 0 : avatar.hashCode());
		result = prime * result + edad;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + idUsuario;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((puestoDeTrabajo == null) ? 0 : puestoDeTrabajo.hashCode());
		return result;
	}
	
	public Avatar getAvatar() {
		return avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (avatar != other.avatar)
			return false;
		if (edad != other.edad)
			return false;
		if (genero != other.genero)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (puestoDeTrabajo == null) {
			if (other.puestoDeTrabajo != null)
				return false;
		} else if (!puestoDeTrabajo.equals(other.puestoDeTrabajo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", password=" + password + ", puestoDeTrabajo=" + puestoDeTrabajo + ", genero=" + genero + ", avatar="
				+ avatar + "]";
	}
	
	
	
	

}
