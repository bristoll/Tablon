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


public class UserDAOImpl implements UserDAO {

	@Override
	public boolean insert(User user) {
		boolean insert = false; 
		
		
		Statement stm;
		Connection con;

		
		// TODO cambiar el getFechaAlta para pasar de java.util.Date a java.sql.Date
		String query = "INSERT INTO User values (NULL,'" + user.getNombre() + "','" + user.getApellidos() + "','"
				+ user.getCorreo() + "','" + user.getNik() + "','" + user.getAvatar() + "','" + user.getFechaAlta()
				+ "','" + user.getNumPost() + "')";

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
	public List<User> obtain() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		// Establecemos el query para obtener los datos de la base de datos
		//TODO cambiar *** por el nombre de la base de datos
		String select = "SELECT * FROM ****** ORDER BY ID";

		// instanciamos un nuevo arraylist para guardar los datos que vayamos sacando
		List<User> listaUsers = new ArrayList<>();

		try {

			co = Conection.conect();
			stm = co.createStatement();
			rs = stm.executeQuery(select);

			// mientras queden registros ir metiendo las propiedades de cada registro en la
			// lista
			while (rs.next()) {
				User user = new User();

				user.setID(rs.getInt(1));
				user.setNombre(rs.getString(2));
				user.setApellidos(rs.getString(3));
				user.setCorreo(rs.getString(4));
				user.setNik(rs.getString(5));
				//Nos saltamos el 6 porque es donde irá la imagen y no nos interesa en este caso
				//Ya que esta funcion esta pensada para el administrador
				user.setFechaAlta(rs.getTimestamp(7));
				user.setNumPost(rs.getInt(8));

				
				listaUsers.add(user);
			}
		
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: UserDAOImpl, Obtain method");
			e.printStackTrace();
		}
		return listaUsers;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) {
		Connection connect = null;
		Statement stm = null;
		
		boolean delete = false;
		//TODO cambiar *** por nombre bd
		String query = "DELETE FROM *** WHERE ID="+user.getID();
		try {
			connect = Conection.conect();
			stm = connect.createStatement();
			stm.execute(query);
			delete = true;
		}catch(SQLException e) {
			System.out.println("Error: UserDAOImpl, delete method");
			e.printStackTrace();
		}
		return delete;
	
	
	}

}
