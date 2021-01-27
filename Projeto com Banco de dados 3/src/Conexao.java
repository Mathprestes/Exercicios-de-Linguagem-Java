
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

   public class Conexao {

   private Connection conexao = null;
   private final String bd = "Login";                  //mudar o nome da base para qualquer projeto
   private final String usuario = "root";
   private final String senha = "";

    public Connection conectar () {
    try {                                             //tratamento de exceçao
        Class.forName("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection ("jdbc:mysql://localhost/"+this.bd, this.usuario, this.senha);
    }
    catch (ClassNotFoundException e1) {
        JOptionPane.showMessageDialog(null, "Erro com o driver de conexao: " + e1.getMessage() );
    } 
    catch (SQLException e2) {
        JOptionPane.showMessageDialog(null, "Erro na tentativa de conexao: " + e2.getMessage() );
    }
    return conexao;
 }
}
