package com.vetias.tempdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vetias.tempdata.dao.OrganisationDAO;
import com.vetias.tempreature.beans.Organisation;

public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            Class .forName("org.h2.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection =
            DriverManager.getConnection(
                "jdbc:h2:mem:tempdataDB","sa",null);
        }catch (SQLException sqlException){
            System.out.println("Error creating table:"+ sqlException);
        }
        OrganisationDAO organisationDAO = new OrganisationDAO();
        Organisation vet = new Organisation("VET","Vellalar Educational Trust",
        "www.vet.com","contact@vet.com","9874563210",1212121,null);
        organisationDAO.save(dbConnection,vet);
        Organisation myOrganisation = organisationDAO.findByName(dbConnection,null);
        System.out.println("My organisation is:"+ myOrganisation);
    }

}
