package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.Conexao;
import Entidades.User;

public class UserDAO {
    public void cadastrarUser(User user) {
        String sql = "INSERT INTO USER (NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getSenha());
            ps.setString(4, user.getEmail());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
