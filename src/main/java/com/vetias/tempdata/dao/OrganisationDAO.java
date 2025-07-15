package com.vetias.tempdata.dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.Attributes;

import javax.xml.stream.events.StartElement;



public class OrganisationDAO {
    public void createTable(Connection  dbConnection) {
        try(Statement statement =  dbConnection.createStatement()){
                statement.execute("""
                    create table organisation(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME  VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    DESCRIPTION VARCHAR(225))
                    """);               
    } catch (SQLException sqlException) {
        System.out.println("Error creating table : "+ sqlException);
    }
}  

public int save(Connection dbConnection, Organisation vet) {
         try (preparedStatement preparedStatement = dbConnection.preparedStatement("""
        insert into organisation(name,website,email,contact_number,registration_no,description) values(??????)
        """)){
            preparedStatement.setString(1,vet.name());
            preparedStatement.setString(2,vet.website());
            preparedStatement.setString(3,vet.email());
            preparedStatement.setString(4,vet.contactNumber());
            preparedStatement.setLong(5,vet.registrationNo());
            preparedStatement.setString(6,vet.description());
            preparedStatement.executeUpdate();
        }catch (SQLException sqlException) {
            System.out.println("Error inserting into table: "+ sqlException);
        }
        return 0;
}
public Organisation findByName(Connection dbConnection, String name) {
Organisation organisation = null;
try (PreparedStatement preparedStatement = dbConnection.preparedStatement(""" 
     select * from organisation where name=?
     """)) {
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet != null && resultSet.next()) {
            organisation = new Organisation(
                resultSet.getString("name"),
            resultSet.getString("description"),
            resultSet.getString("website"),
            resultSet.getString("email"),
            resultSet.getString("contact_number"),
            resultSet.getLong("registration_no"), 
            null);  
        }
     } catch(SQLException exception) {
        System.out.println("Exception while fetching the data"+ exception);
     }
}
}