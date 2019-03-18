/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author usci
 */
public class Car {
    private double gas;
    private int effective;
    public Car(double gas,int effective){
        this.gas=gas;
        this.effective=effective;
    }
    public void drive(double distance){
        double usedGas=distance/effective;
        if (usedGas>gas){
            System.out.println("You cannot drive too far,please add gas");
        }else{
            gas-=usedGas;
        }
    }
    public void setGas(double amount){
        gas=amount;
    }
    public double getGas(){
        return gas;
    }
    public double getEfficiency(){
        return effective;
    }
    public void addGas(double amount){
        gas+=amount;
    }
    }


