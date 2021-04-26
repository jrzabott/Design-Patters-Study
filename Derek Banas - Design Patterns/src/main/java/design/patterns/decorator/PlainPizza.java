/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.decorator;

/**
 *
 * @author drochaju
 */
public class PlainPizza implements Pizza{

    @Override
    public double getCost() {
        return 4.00d;
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

}