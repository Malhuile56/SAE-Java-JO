package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AthleteDAO {
    public void ajouterAthlete(Athlete athlete) {
        String sql = "INSERT INTO Athlete (nomA, prenomA, sexeA, forceA, enduranceA, agiliteA, idPays) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, athlete.getNom());
            pstmt.setString(2, athlete.getPrenom());
            pstmt.setString(3, athlete.getSexe());
            pstmt.setInt(4, athlete.getForce());
            pstmt.setInt(5, athlete.getEndurance());
            pstmt.setInt(6, athlete.getAgilite());

            // Obtenir l'ID du pays directement depuis l'objet Pays
            Pays pays = athlete.getPays();
            int idPays = getIdPaysFromDatabase(pays.getNom());
            pstmt.setInt(7, idPays);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int getIdPaysFromDatabase(String nomPays) {
        String sql = "SELECT idPays FROM Pays WHERE nomPays = ?";
        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomPays);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idPays");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Retourne une valeur par défaut en cas d'erreur
    }
}