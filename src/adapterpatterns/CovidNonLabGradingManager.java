/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterns;

/**
 *
 */
public class CovidNonLabGradingManager implements CovidGradingManager{

    @Override
    public void calculateCovidNonLab(String StudentID) {
        System.out.println("Calculating Covid NON LAB for "+ StudentID);
    }

    @Override
    public void calculateCovidLab(String StudentID) {
        //do nothing
    }
    
}
