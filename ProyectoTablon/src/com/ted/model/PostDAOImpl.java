package com.ted.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ted.connection.Conection;
/**
 * 
 * @author Cristo
 *
 */
public class PostDAOImpl implements PostDAO {

	@Override
	public boolean insert(Post post) {
		boolean insert = false; 
		
		Statement stm;
		Connection con;

		
		// TODO cambiar el getUsuario que seguro que nos va a dar problemas seguramente
		// usar el .ID ( no entiendo bien como hacer esa relacion en la BD)
		// Probablemente sea necesario usar preparedStatment por la imagen y hacer
		// conversion de blob a imagen
		String query = "INSERT INTO post values (NULL,'" + post.getUsuario().getID() + "','" + post.getFechaCreacion() + "','"
				+ post.getPuntuacion() + "','" + post.getTitulo() + "','" + post.getTexto() + "','" + post.getImagen() + "')";

		try {
			con = Conection.conect();
			stm = con.createStatement();
			stm.execute(query);
			
			insert = true;

			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("ERROR: insert.class");
			e.printStackTrace();

		}

		return insert;
	}

	@Override
	public List<Post> obtain() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		// Establecemos el query para obtener los datos de la base de datos
		
		String select = "SELECT * FROM post ORDER BY fechaCreacion DESC";

		// instanciamos un nuevo arraylist para guardar los datos que vayamos sacando
		List<Post> listaPosts = new ArrayList<>();

		try {

			co = Conection.conect();
			stm = co.createStatement();
			rs = stm.executeQuery(select);

			// mientras queden registros ir metiendo las propiedades de cada registro en la
			// lista
			while (rs.next()) {
				Post post = new Post();

				post.setID(rs.getInt(1));
				// post.setUsuario(rs.getString(2)); TODO hay que acceder al usuario obteniendo
				// el ID que es clave secundaria y luego hacer el setUsuario
				post.setFechaCreacion(rs.getDate(3));// Cuidado si hay problemas entre date sql y java
				post.setPuntuacion(rs.getDouble(4));
				post.setTitulo(rs.getString(5));
				post.setTexto(rs.getString(6));
				// post.setImagen(rs.getBlob(6));

				
				listaPosts.add(post);
			}
			
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: PostDAOImpl, Obtain method");
			e.printStackTrace();
		}
		return listaPosts;
	}

	@Override
	public List<Post> misPost(User user) {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		// Establecemos el query para obtener los datos de la base de datos
		
		String select = "SELECT * FROM post WHERE user='"+user.getID()+"' ORDER BY fechaCreacion DESC";

		// instanciamos un nuevo arraylist para guardar los datos que vayamos sacando
		List<Post> listaPosts = new ArrayList<>();

		try {

			co = Conection.conect();
			stm = co.createStatement();
			rs = stm.executeQuery(select);

			// mientras queden registros ir metiendo las propiedades de cada registro en la
			// lista
			while (rs.next()) {
				Post post = new Post();

				post.setID(rs.getInt(1));
				// post.setUsuario(rs.getString(2)); TODO hay que acceder al usuario obteniendo
				// el ID que es clave secundaria y luego hacer el setUsuario
				post.setFechaCreacion(rs.getDate(3));// Cuidado si hay problemas entre date sql y java
				post.setPuntuacion(rs.getDouble(4));
				post.setTitulo(rs.getString(5));
				post.setTexto(rs.getString(6));
				// post.setImagen(rs.getBlob(6));

				
				listaPosts.add(post);
			}
			
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: PostDAOImpl, Obtain method");
			e.printStackTrace();
		}
		return listaPosts;
	}
	@Override
	public boolean update(Post post) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Post post) {
		Connection connect = null;
		Statement stm = null;

		boolean delete = false;
		
		String query = "DELETE FROM post WHERE ID=" + post.getID();
		try {
			connect = Conection.conect();
			stm = connect.createStatement();
			stm.execute(query);
			delete = true;
		} catch (SQLException e) {
			System.out.println("Error: PostDAOImpl, delete method");
			e.printStackTrace();
		}
		return delete;
	}



}
