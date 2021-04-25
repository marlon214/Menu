package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Entrees;

public class EntreesDAO {
	private Connection connection;
	private final String DISPLAY_Entrees_QUERY = "SELECT * FROM Entrees";
	private final String CREATE_NEW_Entree_QUERY ="INSERT INTO Entrees(dishName,Price) VALUES(?,?)";
	private final String DELETE_Entree_BY_ID = "DELETE FROM Entrees WHERE ID = ?";
	
		public EntreesDAO() {
			connection = DBConnection.getConnection();
		}

		public List<Entrees> getEntrees() throws SQLException {
			ResultSet rs = connection.prepareStatement(DISPLAY_Entrees_QUERY).executeQuery();
			List<Entrees> desserts = new ArrayList<Entrees>();
			
			while(rs.next()) {
				desserts.add(populateEntrees(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			return desserts;
			
			
	}
		private Entrees populateEntrees(int id, String name, double price) {
				return new Entrees(id, name, price);
			}
		public void createEntree(String eName, double ePrice) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_Entree_QUERY);
			ps.setString(1, eName);
			ps.setDouble(2, ePrice);
			ps.executeUpdate();
			
		}
		public void deleteEntree (int id) throws SQLException {
			PreparedStatement ps  = connection.prepareStatement(DELETE_Entree_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		
		}
	
}
