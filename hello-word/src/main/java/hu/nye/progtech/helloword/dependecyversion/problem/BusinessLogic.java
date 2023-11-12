package hu.nye.progtech.helloword.dependecyversion.problem;

import javax.xml.crypto.Data;

public class BusinessLogic {

    /*private String field;

    public BusinessLogic(String field) {
        this.field = field;
    }

     */

    public Data getSomeData(){
        DatabaseConnection db = new DatabaseConnection();
        DatabaseQueryResult result = db.query("SELECT...");


        return null;
    }
}
