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
public class Bulbasaur extends Pokemon implements iEvolvable {
    public Bulbasaur() { 
        super.Id = 001;
        super.setHP(200);
        super.setAttack(45);
        super.setDefense(15);    
        super.setIsEvolved(false);
    }
    
    @Override
    public void tackle() {
        System.out.println("The Bulbasaur tackles his opponent!");
    }
    
    public void vineWhip() {
        System.out.println("The Bulbasaur whips its opponent with a vine!");
    }

    @Override
    public void evolve() {
        System.out.println("The Bulbasaur has evolved into an Ivysaur.");
    }

    @Override
    public void getNextEvolution() {
        if(super.isIsEvolved())
            System.out.println("There is no next evolution.");
        else {
            System.out.println("The next evolution is Ivysaur.");
            super.setIsEvolved(true);
        }
    }
}