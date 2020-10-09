/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterns;

/**
 *
 */
public class LabGradingManager implements GradingManager {
    
    GradingCovidAdapter covidAdapter;


    @Override

    public void CalculateGrades(String courseType, String StudentID) {


        if(courseType.equalsIgnoreCase("LAB")){

            System.out.println("Calculated for LAB course for student  " + StudentID);

        }

        else if(courseType.equalsIgnoreCase("CovidNonLab") || courseType.equalsIgnoreCase("CovidLab")){

            covidAdapter = new GradingCovidAdapter(courseType);

            covidAdapter.CalculateGrades(courseType, StudentID);

        }

        else{

            System.out.println("Invalid Calculation model . " + courseType);

        }

    }
    
    
    
}
