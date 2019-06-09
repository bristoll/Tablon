package com.ted.model;

import java.awt.Image;
import java.io.File;
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
	private String password;
	private String correo;
	private String nik;
	private File avatar;//Podria usarse un array de bytes (Bytes[])siempre y cuando no necesitemos tratarla 
	//Quizas es posible eliminar fechaAlta ya que podemos crear el timeStamp en la base de datos al crear el registro y ya esta
	private Timestamp fechaAlta; // para poder registrar la antiguedad del usuario y añadir badges en funcion de antiguedad
	private int numPost=0;//Numero de post que el usuario ha escrito hasta el momento, también para badges futuros
	
	//Constructores
	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(int iD, String nombre, String apellidos, String password, String correo, String nik,
			Timestamp fechaAlta, int numPost) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.correo = correo;
		this.nik = nik;
		this.fechaAlta = fechaAlta;
		this.numPost = numPost;
	}



	public User(String nombre, String apellidos, String password, String correo, String nik,
			Timestamp fechaAlta) {
		super();
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.correo = correo;
		this.nik = nik;
		this.fechaAlta = fechaAlta;
	}




	

	public User(String password, String correo) {
		super();
		this.password = password;
		this.correo = correo;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public File getAvatar() {
		return avatar;
	}

	public void setAvatar(File avatar) {
		this.avatar = avatar;
	}
	//Sobrecargamos el metodo set por si nos pasan la ruta
	public void setAvatar(String ruta) {
		File avatar = new File(ruta);
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
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "User [ID=" + ID + ", nombre=" + nombre + ", apellidos=" + apellidos + ", password=" + password
				+ ", correo=" + correo + ", nik=" + nik + ", fechaAlta=" + fechaAlta + ", numPost=" + numPost + "]";
	}



	

	
	
	
}
