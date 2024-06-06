package fiap.tds.repositories;

import fiap.tds.models.Empresa;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class EmpresaRepository {
    public static final Logger LOGGER = LogManager.getLogger(EmpresaRepository.class);
    public static String URL_ORACLE;
    public static String USER;
    public static String PASSWORD;

    public static final String TABLE_NAME = "T_GS_EMPRESA";

    public static final Map<String, String> TABLE_COLUMNS = Map.of(
            "idEmpresa", "id_empresa",
            "nome", "nome_empresa",
            "cnpj", "cnpj",
            "email", "email_empresa",
            "idLogin", "id_login"
    );

    public EmpresaRepository(){
        try(var inputStream = getClass().getClassLoader()
                .getResourceAsStream("database.properties"))
        {
            var properties = new Properties();
            properties.load(inputStream);
            URL_ORACLE = properties.getProperty("jdbc.url");
            USER = properties.getProperty("jdbc.username");
            PASSWORD = properties.getProperty("jdbc.password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Empresa> getAll(){
        var cadastros = new ArrayList<Empresa>();
        try(var connection = DriverManager.getConnection(URL_ORACLE, USER, PASSWORD);
            var preparedStatement = connection.prepareStatement("SELECT * FROM " + TABLE_NAME);
            var resultSet = preparedStatement.executeQuery()
        ){
            while (resultSet.next()){
                cadastros.add(new Empresa(
                        resultSet.getDouble(TABLE_COLUMNS.get("idEmpresa")),
                        resultSet.getString(TABLE_COLUMNS.get("nome")),
                        resultSet.getDouble(TABLE_COLUMNS.get("cnpj")),
                        resultSet.getString(TABLE_COLUMNS.get("email")),
                        resultSet.getDouble(TABLE_COLUMNS.get("idLogin"))
                ));
            }
        }
        catch (SQLException e) {
            LOGGER.error("Erro ao tentar pegar todos os cadastros {}",
                    e.getMessage());
        }
        LOGGER.info("Cadastros retornados com sucesso");
        return cadastros;
    }

    public Optional<Empresa> getById(int idEmpresa){
        try(var connection = DriverManager.getConnection(URL_ORACLE, USER, PASSWORD);
            var preparedStatement = connection.prepareStatement("SELECT * FROM "+TABLE_NAME+" WHERE ID = ?");
        ){
            preparedStatement.setInt(1, idEmpresa);
            var resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return Optional.of(new Empresa(
                        resultSet.getDouble(TABLE_COLUMNS.get("idEmpresa")),
                        resultSet.getString(TABLE_COLUMNS.get("nome")),
                        resultSet.getDouble(TABLE_COLUMNS.get("cnpj")),
                        resultSet.getString(TABLE_COLUMNS.get("email")),
                        resultSet.getDouble(TABLE_COLUMNS.get("idLogin"))
                ));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void add(Empresa empresa){
        try(var connection = DriverManager.getConnection(URL_ORACLE, USER, PASSWORD);
            var preparedStatement = connection.prepareStatement(
                    "INSERT INTO %s(%s,%s,%s,%s,%s) VALUES(?,?,?,?,?)"
                            .formatted(TABLE_NAME,
                                    TABLE_COLUMNS.get("idEmpresa"),
                                    TABLE_COLUMNS.get("nome"),
                                    TABLE_COLUMNS.get("cnpj"),
                                    TABLE_COLUMNS.get("email"),
                                    TABLE_COLUMNS.get("idLogin")))
        ) {
            preparedStatement.setDouble(1, empresa.getIdEmpresa());
            preparedStatement.setString(2, empresa.getNome());
            preparedStatement.setDouble(3, empresa.getCnpj());
            preparedStatement.setString(4, empresa.getEmail());
            preparedStatement.setDouble(5, empresa.getIdLogin());
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(double idEmpresa, Empresa empresa){
        try(var connection = DriverManager.getConnection(URL_ORACLE, USER, PASSWORD);
            var preparedStatement = connection.prepareStatement(
                    "UPDATE T_GS_EMPRESA SET %s = ?, %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?"
                            .formatted(TABLE_NAME,
                                    TABLE_COLUMNS.get("idEmpresa"),
                                    TABLE_COLUMNS.get("nome"),
                                    TABLE_COLUMNS.get("cnpj"),
                                    TABLE_COLUMNS.get("email"),
                                    TABLE_COLUMNS.get("idLogin"))))
        {
            preparedStatement.setDouble(1, empresa.getIdEmpresa());
            preparedStatement.setString(2, empresa.getNome());
            preparedStatement.setDouble(3, empresa.getCnpj());
            preparedStatement.setString(4, empresa.getEmail());
            preparedStatement.setDouble(5, empresa.getIdLogin());
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(double idEmpresa){
        try(var connection = DriverManager.getConnection(URL_ORACLE, USER, PASSWORD);
            var preparedStatement = connection.prepareStatement("DELETE FROM T_GS_EMPRESA WHERE ID = ?");
        ){
            preparedStatement.setDouble(1, idEmpresa);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
