/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kelompok1rti.Pegawai.Pegawai;

/**
 *
 * @author FAKHRI
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Informasi koneksi
        String url = "jdbc:postgresql://localhost:5432/toko_sepatu";
        String user = "postgres";
        String password = "123";

        // Cobalah membuat koneksi
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal!");
            e.printStackTrace();
        }
    }

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

