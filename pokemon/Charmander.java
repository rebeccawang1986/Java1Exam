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
public class Charmander extends Pokemon implements iEvolvable {
    public Charmander() {
        super.Id = 002;
        super.setHP(400);
        super.setAttack(25);
        super.setDefense(20);
        super.setIsEvolved(false);
    }
    
    @Override
    public void tackle() {
        System.out.println("The Charmander tackles his opponent!");
    }
    
    public void ember() {
        System.out.println("The Charmander shoots a blast of fire!");
    }

    @Override
    public void evolve() {
        System.out.println("The Charmander has evolved into a Charmeleon.");
    }

    @Override
    public void getNextEvolution() {
        if(super.isIsEvolved())
            System.out.println("There is no next evolution.");
        else {
            System.out.println("The next evolution is Charmeleon.");
            super.setIsEvolved(true);
        }
    }
}
