package projekatPriprema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Pretraga {
	static Konekcija k = new Konekcija();
	static Connection connection = k.getConnection();
	// objekat tipa City prazan
	static City c = null;

	// metoda koja prikazuje sve gradove sa trazenim imenom
	public static void prikaziSve(String grad) throws ClassNotFoundException, SQLException {
		// create an SELECT SQL query
		String query = "SELECT * FROM City WHERE Name LIKE '" + grad + "' ORDER BY Name";
		// create a new ResultSet
		ResultSet rs = null;
		try {
			// java.sql.Statement
			Statement statement = connection.createStatement();
			// execute the query
			rs = statement.executeQuery(query);
			while (rs.next()) {
				c = new City(rs.getInt("ID"), rs.getString("Name"), rs.getString("CountryCode"),
						rs.getString("District"), rs.getLong("Population"));
			} // stampaj c objekat
			c.toPrint();
			// zatvaramo konekciju
			k.closeConnection();
			// hvataj gresku
		} catch (SQLException ex) {
			System.err.println(ex.toString());
		}
	}

	// metoda koja prikazuje sve gradove koji imaju populaciju u zadanom
	// intervalu
	public static void prikaziGradove(long pocetak, long kraj) throws ClassNotFoundException, SQLException {
		String query = "SELECT * FROM City WHERE Population  BETWEEN " + pocetak + " AND " + kraj
				+ " ORDER BY Population";
		// create a new ResultSet
		ResultSet rs = null;
		// pravimo arraylistu tipa City za sve gradove koji budu odgovarali
		// nasoj pretrazi
		ArrayList<City> c = new ArrayList<>();
		try {
			// konektujemo se na bazu
			k.getConnection();
			// java.sql.Statement
			Statement statement = connection.createStatement();
			// execute the query
			rs = statement.executeQuery(query);
			while (rs.next()) {
				c.add(new City(rs.getInt("ID"), rs.getString("Name"), rs.getString("CountryCode"),
						rs.getString("District"), rs.getLong("Population")));
			}
			for (City e : c) {
				e.toPrint();
			}
		} catch (SQLException ex) {
			System.err.println(ex.toString());
		}
		// zatvaramo konekciju
		k.closeConnection();
	}
}
