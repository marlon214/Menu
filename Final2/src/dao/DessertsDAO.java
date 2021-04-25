package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Desserts;

public class DessertsDAO {
	private Connection connection;
	private final String DISPLAY_DESSERTS_QUERY = "SELECT * FROM Desserts";
	private final String CREATE_NEW_Dessert_QUERY ="INSERT INTO Desserts(dishName,Price) VALUES(?,?)";
	private final String DELETE_Dessert_BY_ID = "DELETE FROM Desserts WHERE ID = ?";
	
		public DessertsDAO() {
			connection = DBConnection.getConnection();
		}

		public List<Desserts> getDesserts() throws SQLException {
			ResultSet rs = connection.prepareStatement(DISPLAY_DESSERTS_QUERY).executeQuery();
			List<Desserts> desserts = new ArrayList<Desserts>();
			
			while(rs.next()) {
				desserts.add(populateDesserts(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			return desserts;
			
			
	}
		private Desserts populateDesserts(int id, String name, double price) {
				return new Desserts(id, name, price);
			}
		public void createDessert(String dName, double dprice) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_Dessert_QUERY);
			ps.setString(1, dName);
			ps.setDouble(2, dprice);
			ps.executeUpdate();
			
		}
		public void deleteDessert (int id) throws SQLException {
			PreparedStatement ps  = connection.prepareStatement(DELETE_Dessert_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		}
		
}
