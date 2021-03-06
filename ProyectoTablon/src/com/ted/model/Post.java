package com.ted.model;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
/**
 * 
 * @author Cristo
 *
 */
public class Post implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Propiedades
	private int ID;
	private User usuario;
	private Date fechaCreacion;
	private double puntuacion;//Basada en competicion entre post cercanos por sistema ELO(ajedrez)
	private String titulo;
	private String texto;
	//Quizas es mejor usar blob directamente para las imagenes
	private byte[] imagen;//Por el momento solo se permite al usuario a�adir una imagen por post
	
	//Constructores
	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Post(User usuario, Date fechaCreacion, double puntuacion, String titulo, String texto,
			byte[] imagen) {
		super();
		this.usuario = usuario;
		this.fechaCreacion = fechaCreacion;
		this.puntuacion = puntuacion;
		this.titulo = titulo;
		this.texto = texto;
		this.imagen = imagen;
	}


	public Post(User usuario, Date fechaCreacion, double puntuacion, String titulo, String texto) {
		super();
		this.usuario = usuario;
		this.fechaCreacion = fechaCreacion;
		this.puntuacion = puntuacion;
		this.titulo = titulo;
		this.texto = texto;
	}


	//Getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//Sobreescritura de equals, hashCode y toString ( no se utiliza
	//el campo imagen ya que puede haber mas de un post que utilice 
	//la misma imagen o con el mismo nombre, y el equals adem�s no sabe 
	//como tratarlo)

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + Arrays.hashCode(imagen);
		long temp;
		temp = Double.doubleToLongBits(puntuacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Post other = (Post) obj;
		if (ID != other.ID)
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (!Arrays.equals(imagen, other.imagen))
			return false;
		if (Double.doubleToLongBits(puntuacion) != Double.doubleToLongBits(other.puntuacion))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Post [ID=" + ID + ", usuario=" + usuario + ", fechaCreacion=" + fechaCreacion + ", puntuacion="
				+ puntuacion + ", titulo=" + titulo + ", texto=" + texto + "]";
	}
	
	
	



	

	
	
	
	

}
