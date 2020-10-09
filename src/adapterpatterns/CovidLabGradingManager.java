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
public class CovidLabGradingManager implements CovidGradingManager{
    
    @Override
    public void calculateCovidNonLab(String StudentID) {

        //do nothing

    }
    @Override
    public void calculateCovidLab(String StudentID) {



        System.out.println("Calculating Covid  LAB for "+ StudentID);

    }

}
