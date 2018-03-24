/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

public class Onix extends Pokemon implements iEvolvable {
    public Onix() {
        super.Id = 004;
        super.setHP(350);
        super.setAttack(50);
        super.setDefense(10);
        super.setIsEvolved(false);
    }
    
    @Override
    public void tackle() {
        System.out.println("The Onix tackles his opponent!");
    }
    
    public void rockSlide() {
        System.out.println("The Onix buries its opponent in a rock slide!");
    }

    @Override
    public void evolve() {
        System.out.println("The Onix has evolved into a Steelix.");
    }

    @Override
    public void getNextEvolution() {
        if(super.isIsEvolved())
            System.out.println("There is no next evolution.");
        else {
            System.out.println("The next evolution is Steelix.");
            super.setIsEvolved(true);
        }
    }
}
