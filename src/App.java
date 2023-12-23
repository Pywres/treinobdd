import DAO.UserDAO;
import Entidades.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setNome("Cid");
        u.setLogin("pywres");
        u.setSenha("1234");
        u.setEmail("dantebr21@gmail.com");

        new UserDAO().cadastrarUser(u);
    }
}
