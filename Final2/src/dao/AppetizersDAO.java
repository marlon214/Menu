package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Appetizers;

public class AppetizersDAO {
	private Connection connection;
	private final String DISPLAY_Appetizers_QUERY = "SELECT * FROM Appetizers";
	private final String CREATE_NEW_Appetizer_QUERY ="INSERT INTO Appetizers(dishName,Price) VALUES(?,?)";
	private final String DELETE_Appetizer_BY_ID = "DELETE FROM Appetizers WHERE ID = ?";
	
		public AppetizersDAO() {
			connection = DBConnection.getConnection();
		}

		public List<Appetizers> getAppetizers() throws SQLException {
			ResultSet rs = connection.prepareStatement(DISPLAY_Appetizers_QUERY).executeQuery();
			List<Appetizers> desserts = new ArrayList<Appetizers>();
			
			while(rs.next()) {
				desserts.add(populateAppetizers(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			return desserts;
			
			
	}
		private Appetizers populateAppetizers(int id, String name, double price) {
				return new Appetizers(id, name, price);
			}
		
		public void createAppetizer(String aName, double dPrice) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_Appetizer_QUERY);
			ps.setString(1, aName);
			ps.setDouble(2, dPrice);
			ps.executeUpdate();
			
		}
		public void deleteAppetizer (int id) throws SQLException {
			PreparedStatement ps  = connection.prepareStatement(DELETE_Appetizer_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		
		}
	
}
