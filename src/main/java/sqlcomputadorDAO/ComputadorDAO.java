package sqlcomputadorDAO;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Computador;

public class ComputadorDAO {

    //Criando o caminho/conexao com o banco de dados
    static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "vhsm04858400";

    // Funcao para salvar no banco de dados
    public static boolean salvar(Computador novoComputador) {

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;
  
        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO computador (marca, hd, processador) VALUES(?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setString(1, novoComputador.getMarca());
            comandoSQL.setInt(2, novoComputador.getHd());
            comandoSQL.setString(3, novoComputador.getProcessador());

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                        novoComputador.setIdComputador(idGerado);
                    }
                }

            }

        } catch (ClassNotFoundException ex) {

            retorno = false;

        } catch (SQLException ex) {

            retorno = false;
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return retorno;
        
        
    }

    //Funcao para listar no banco de dados
    public static ArrayList<Computador> listar() {

        ArrayList<Computador> lista = new ArrayList<>();    

        //Criando a conexao 
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            // Passa 1: Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Pass 2: Abrir a conexao com o MySQL
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM computador");

            // Passo 4: Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do ResultSet
                while (rs.next()) {

                    Computador item = new Computador();

                    item.setIdComputador(rs.getInt("idComputador"));
                    item.setMarca(rs.getString("marca"));
                    item.setHd(rs.getInt("hd"));
                    item.setProcessador(rs.getString("processador"));

                    lista.add(item);
                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;

    }

    // Funcao para excluir no banco de dados
    public static boolean excluir(int idComputador) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            // Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("DELETE FROM computador WHERE idComputador = ?");

            // Pegando o ID
            comandoSQL.setInt(1, idComputador);

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }

        return retorno;
    }

    // Funcao para alterar no banco de dados
    public static boolean alterar(Computador obj) {

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        boolean retorno = false;

        try {
            //Passo 1: carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2: Abrir a conexao com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar os comandos SQL a ser executado
            comandoSQL = conexao.prepareStatement("UPDATE Computador SET hd = ?, processador = ? WHERE idComputador = ?");

            //Pegando as informacoes do objeto para mandar para o banco
            comandoSQL.setInt(1, obj.getHd());
            comandoSQL.setString(2, obj.getProcessador());
            comandoSQL.setInt(3, obj.getIdComputador());

            // Executar os comandos
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }

        return retorno;

    }

    // Funcao para filtrar 
    public static ArrayList<Computador> buscarPorProcessador(String nomeProcessador) {

        ArrayList<Computador> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            // Passa 1: Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Pass 2: Abrir a conexao com o MySQL
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3: Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM computador WHERE processador = ?");
            comandoSQL.setString(1, nomeProcessador);

            // Passo 4: Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do ResultSet
                while (rs.next()) {

                    Computador item = new Computador();

                    item.setIdComputador(rs.getInt("idComputador"));
                    item.setMarca(rs.getString("marca"));
                    item.setHd(rs.getInt("hd"));
                    item.setProcessador(rs.getString("processador"));

                    lista.add(item);
                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

}
