import DAO.UserDAO;
import Entidades.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setNome("Cid");
        u.setLogin("pywres");
        u.setSenha("1234");
        u.setEmail("capaz@mail.com.br");

        new UserDAO().cadastrarUser(u);
    }
}
