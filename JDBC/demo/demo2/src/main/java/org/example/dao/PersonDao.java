package org.example.dao;

import org.example.model.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDao extends BaseDao<Person> {
    public PersonDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Person element) throws SQLException {
        request = "INSERT INTO users (firstname, lastname) VALUES (?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);

        // Assigner valeurs (?,?)
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());

        // Execution requete et récupération du nombre de requete
        int nbRows = statement.executeUpdate();

        // Récuperation résultat avec les clés
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            // Setter id récupérer
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;

    }

    @Override
    public boolean update(Person element) throws SQLException {
        request = "UPDATE users set firstname = ?, lastname = ? where id= ?";
        statement = connection.prepareStatement(request);

        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setInt(3, element.getId());

        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Person element) throws SQLException {
        request = "DELETE FROM users WHERE id= ?";
        statement = connection.prepareStatement(request);

        statement.setInt(1, element.getId());

        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Person get(int id) throws SQLException {
        Person person = null;
        request = "SELECT * FROM users WHERE id = ?";
        statement = connection.prepareStatement(request);

        statement.setInt(1, id);

        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            person = new Person(resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"));
        }

        return person;


    }

    @Override
    public List<Person> get() throws SQLException {
        List<Person> persons = new ArrayList<>();
        request = "SELECT * FROM users";
        statement = connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Person person = new Person(resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"));
            persons.add(person);
        }
        return persons;
    }
}
