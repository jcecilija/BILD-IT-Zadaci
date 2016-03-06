package projekatPriprema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pretraga {
	static Konekcija k = new Konekcija();
	static Connection connection = null;

	// metoda koja prikazuje sve gradove sa trazenim imenom
	public static void prikaziSve() throws ClassNotFoundException, SQLException  {
		// skener za unos grada kojeg mi trazimo
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite grad po kojem hocete pretragu:");
		String grad = input.next();
		// zatvaramo skenber
		input.close();
		// create an SELECT SQL query
		String query = "SELECT * FROM City WHERE Name LIKE " + grad + " ORDER BY Name";
		// create a new ResultSet
		ResultSet rs = null;
		try {
			// konektujemo se na bazu
			k.getConnection();
			// java.sql.Statement
			Statement statement = connection.createStatement();
			// execute the query
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.println((new City(rs.getInt("ID"), rs.getString("Name"), rs.getString("CountryCode"),
						rs.getString("District"), rs.getLong("Population"))));
			} // zatvaramo konekciju
		//	k.closeConnection();
		} catch (SQLException ex) {
			System.err.println(ex.toString());
		}
	}

	public static void prikaziGradove() throws ClassNotFoundException, SQLException {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj od koliko stanovnika da pocne pretraga:");
		long pocetak = input.nextLong();
		System.out.println("Unesite do koliko stanovnika da pretrazuje:");
		long kraj = input.nextLong();
		input.close();

		String query = "SELECT * FROM City WHERE Population  BETWEEN " + pocetak + " AND " + kraj
				+ " ORDER BY Population";
		// create a new ResultSet
		ResultSet rs = null;
		try {
			// konektujemo se na bazu
			k.getConnection();
			// java.sql.Statement
			Statement statement = connection.createStatement();
			// execute the query
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.println((new City(rs.getInt("ID"), rs.getString("Name"), rs.getString("CountryCode"),
						rs.getString("District"), rs.getLong("Population"))));
			} // zatvaramo konekciju
			//k.closeConnection();
		} catch (SQLException ex) {
			System.err.println(ex.toString());
		}
	}
}
