package hu.nye.progtech.helloword.dependecyversion.problem;

import javax.xml.crypto.Data;

public class MyController {
    public void  myAction(){
        BusinessLogic myBusinessLogic = new BusinessLogic();
        Data myData = myBusinessLogic.getSomeData();
    }

}
