package com.ted.model;

import java.awt.Image;
import java.io.Serializable;
import java.sql.Timestamp;
/**
 * 
 * @author Cristo
 *
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Propiedades
	private int ID;
	private String nombre;
	private String apellidos;
	private String correo;
	private String nik;
	private Image avatar;//Podria usarse un array de bytes (Bytes[])siempre y cuando no necesitemos tratarla 
	//Quizas es posible eliminar fechaAlta ya que podemos crear el timeStamp en la base de datos al crear el registro y ya esta
	private Timestamp fechaAlta; // para poder registrar la antiguedad del usuario y añadir badges en funcion de antiguedad
	private int numPost;//Numero de post que el usuario ha escrito hasta el momento, también para badges futuros
	
	//Constructores
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String nombre, String apellidos, String correo, String nik, Timestamp fechaAlta, int numPost) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.nik = nik;
		this.fechaAlta = fechaAlta;
		this.numPost = numPost;
	}

	public User(String nombre, String apellidos, String correo, String nik, Image avatar, Timestamp fechaAlta,
			int numPost) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.nik = nik;
		this.avatar = avatar;
		this.fechaAlta = fechaAlta;
		this.numPost = numPost;
	}

	//Getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public Image getAvatar() {
		return avatar;
	}

	public void setAvatar(Image avatar) {
		this.avatar = avatar;
	}

	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getNumPost() {
		return numPost;
	}

	public void setNumPost(int numPost) {
		this.numPost = numPost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//Sobreescritura de equals, hashCode y toString(No se usa el campo imagen
	//ya que se pueden usar imagenes iguales como avatar de distintos usuarios)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + ((nik == null) ? 0 : nik.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numPost;
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
		User other = (User) obj;
		if (ID != other.ID)
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (nik == null) {
			if (other.nik != null)
				return false;
		} else if (!nik.equals(other.nik))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numPost != other.numPost)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", nik="
				+ nik + ", avatar=" + avatar + ", fechaAlta=" + fechaAlta + ", numPost=" + numPost + "]";
	}
	
	
}
