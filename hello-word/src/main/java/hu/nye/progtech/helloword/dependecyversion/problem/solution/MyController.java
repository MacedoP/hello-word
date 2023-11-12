package hu.nye.progtech.helloword.dependecyversion.problem.solution;

import hu.nye.progtech.helloword.dependecyversion.problem.BusinessLogic;

import javax.xml.crypto.Data;

public class MyController {
    private BusinessLogicInterface businessLogic;

    public MyController(BusinessLogicInterface businessLogic) {
        this.businessLogic = businessLogic;
    }

    public void  myAction(){
        Data myData = businessLogic.getSomeData();
    }

}
/*public BusinessLogic(BusinessLogicInterface businessLogic) {
        this.businessLogic = businessLogic;
    }
    public void myAction(){
        Data myData = businessLogic.getSomeData();
    }

     */