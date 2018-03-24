/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Nanolab2
 */
public class Squirtle extends Pokemon implements iEvolvable {
    public Squirtle() {
        super.Id = 003;
        super.setHP(300);
        super.setAttack(30);
        super.setDefense(15);  
        super.setIsEvolved(false);
    }
    
    @Override
    public void tackle() {
        System.out.println("The Squirtle tackles his opponent!");
    }
    
    public void waterGun() {
        System.out.println("The Squirtle shoots a powerful stream of water!");
    }

    @Override
    public void evolve() {
        System.out.println("The Squirtle has evolved into a Wartortle.");
    }

    @Override
    public void getNextEvolution() {
        if(super.isIsEvolved())
            System.out.println("There is no next evolution.");
        else {
            System.out.println("The next evolution is Wartortle.");
            super.setIsEvolved(true);
        }
    }
}
