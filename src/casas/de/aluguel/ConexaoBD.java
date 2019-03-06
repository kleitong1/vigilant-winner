
package casas.de.aluguel;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD {
    
    public static Connection ObterConexao() throws ClassNotFoundException, SQLException
{

Connection conexao = null;

Class.forName("oracle.jdbc.driver.OracleDriver");
//jdbc:mysql://localhost:1521/mysql?zeroDateTimeBehavior=convertToNull
conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","casas","casas");

return conexao;

}


  public void IncluirLeon() throws SQLException, ClassNotFoundException
    {

Connection conexao = ObterConexao();

Statement statement = conexao.createStatement();

 String query = "insert into leon (CPF ,Nome, Aluguel, RG) values " + "(" + Painel.CPF + "," + Painel.Nome + "," + Painel.Aluguel + "," + Painel.RG + ")";
ResultSet resultSet = statement.executeQuery(query);

 JOptionPane.showMessageDialog(null,"O inquilino foi incluido com sucesso. Reinicie o aplicativo para adicionar outros ao banco");
 
    }

  public void IncluirArag() throws SQLException, ClassNotFoundException
    {

Connection conexao = ObterConexao();

Statement statement = conexao.createStatement();

 String query = "insert into araguaia (CPF ,Nome, Aluguel, RG) values " + "(" + Painel.CPF + "," + Painel.Nome + "," + Painel.Aluguel + "," + Painel.RG + ")";
ResultSet resultSet = statement.executeQuery(query);

 JOptionPane.showMessageDialog(null,"O inquilino foi incluido com sucesso. Reinicie o aplicativo para adicionar outros ao banco");
 
    }
}

