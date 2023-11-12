package hu.nye.progtech.helloword.dependecyversion.problem.solution;

import hu.nye.progtech.helloword.dependecyversion.problem.DatabaseQueryResult;

public interface DatabaseConnectionInterface {
    DatabaseQueryResult query(String select);
}
