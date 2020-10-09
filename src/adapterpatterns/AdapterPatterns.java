/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterns;

/**
 *
 * @author MALAK MEHTAB KHAN
 */
public class AdapterPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           LabGradingManager labGradingManager = new LabGradingManager();



        labGradingManager.CalculateGrades("Lab", "FA12-BSE-324");

        labGradingManager.CalculateGrades("CovidLab", "FA12-BSE-324");

        labGradingManager.CalculateGrades("CovidNonLab", "FA12-BSE-324");



        labGradingManager.CalculateGrades("Covid Lab without lab", "FA12-BSE-324");




    }
    
}
