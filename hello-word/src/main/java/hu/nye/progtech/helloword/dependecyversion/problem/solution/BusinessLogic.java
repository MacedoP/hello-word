package hu.nye.progtech.helloword.dependecyversion.problem.solution;

import hu.nye.progtech.helloword.dependecyversion.problem.DatabaseConnection;
import hu.nye.progtech.helloword.dependecyversion.problem.DatabaseQueryResult;

import javax.xml.crypto.Data;

public class BusinessLogic {

    private DatabaseConnectionInterface databaseConnection;

    public BusinessLogic(DatabaseConnectionInterface databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    public Data getSomeData(){
        DatabaseQueryResult result = databaseConnection.query("SELECT");

        return null;
    }
}
