import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti {
	
	private String username = "root";
	private String password = "";
	private String database = "demo";
	private String host = "localhost";
	private int port = 3306;
	
	private Connection connection = null;
	private Statement statement = null;
	
	private PreparedStatement preparedStatement = null;
	
	
	/*
	 * Prepared Statement, yani diyor ki "hazirlanan statement".
	 */
	
	public void preparedCalisanlariGetir(int id) {
		
		String sorgu = "SELECT * FROM calisanlar WHERE id >= ? AND ad LIKE ?";
		
		try {
			preparedStatement = connection.prepareStatement(sorgu);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, "J%");
			
			ResultSet set = preparedStatement.executeQuery();
			
			while(set.next()) {
				String ad = set.getString("ad");
				String soyad = set.getString("soyad");
				String email = set.getString("email");
				
				System.out.println("Ad : "+ad+" Soyad : "+soyad+" Email : "+email);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	public void calisanEkle() {
		
		try {
			statement = connection.createStatement();
			
			String ad = "Metin";
			String soyad = "Ak";
			String email = "trump@gmail.com";
			
			String sorgu = "INSERT INTO calisanlar (ad, soyad, email) VALUES (" + "'" + ad + "', "+ "'" + soyad + "', "+ "'" + email + "'" + ")";
			
			statement.executeUpdate(sorgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void calisanGuncelle() {
		
		String sorgu = "UPDATE calisanlar SET email = 'tolgaOcal1998@gmail.com' WHERE id = 2";
		
		try {
			statement = connection.createStatement();
			
			statement.executeUpdate(sorgu);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void calisanlariGetir() {
		
		String sorgu = "SELECT * FROM calisanlar";
		
		try {
			statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(sorgu);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String ad = rs.getString("ad");
				String soyad = rs.getString("soyad");
				String email = rs.getString("email");
				
				System.out.println("Id: "+ id + " Ad: "+ ad+ " Soyad: "+soyad+" Email: "+email);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Baglanti() {
		
		// "jdbc:mysql://localhost:3306:3306/demo"
		String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useUnicode=true&characterEncoding=utf8";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver bulunamadi.!!!");
			e.printStackTrace();
		}
		
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Baglanti basarili !");
			
		} catch (SQLException e) {
			System.out.println("Bagalnti basarisiz.!!!");
			e.printStackTrace();
		}
		
	}
	
	
	public void calisanSil() {
		
		
		String sorgu = "DELETE FROM calisanlar WHERE id > 3";
		
		try {
			statement = connection.createStatement();
			
			int deger = statement.executeUpdate(sorgu);
			
			System.out.println(deger + " kadar veri etkilendi.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		Baglanti baglanti = new Baglanti();
		
		baglanti.preparedCalisanlariGetir(1);
		
		/*
		System.out.println("--------------");
		System.out.println("Silinmeden once : ");
		baglanti.calisanlariGetir();
		System.out.println("--------------");
		System.out.println("Silindikten sonra : ");
		
		baglanti.calisanSil();
		*/
		
	//	baglanti.calisanlariGetir();
		
		
		/*
		baglanti.calisanEkle();
		System.out.println("--------------");
		System.out.println("Eklenmeden sonra : ");
		baglanti.calisanlariGetir();
		
		
		baglanti.calisanGuncelle();
		System.out.println("*********************");
		System.out.println("Güncellendikten sonra : ");
		baglanti.calisanlariGetir();
		*/
		
		
		
	}
	
	
	
}
