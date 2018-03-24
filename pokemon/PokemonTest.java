/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

public class PokemonTest {

    public static void main(String[] args) {
        Squirtle squirt = new Squirtle();
        System.out.println("Squirtle attack: " + squirt.getAttack());
        System.out.println("Squirtle defense: " + squirt.getDefense());
        squirt.tackle();
        squirt.waterGun();
        System.out.println("");

        Charmander charm = new Charmander();
        System.out.println("Charmander HP: " + charm.getHP());
        System.out.println("Charmander defense: " + charm.getDefense());
        charm.tackle();
        charm.ember();
        System.out.println("");
        
        Bulbasaur bulba = new Bulbasaur();
        System.out.println("Bulbasaur attack: " + squirt.getAttack());
        squirt.setAttack(50);
        System.out.println("Bulbasaur attack: " + squirt.getAttack());
        System.out.println("Bulbasaur defense: " + bulba.getDefense());
        bulba.tackle();
        bulba.vineWhip();
        System.out.println("");
        
        Onix onix = new Onix();
        System.out.println("Charmander HP: " + charm.getHP());
        charm.setHP(600);
        System.out.println("Charmander HP: " + charm.getHP());
        System.out.println("Onix defense: " + onix.getDefense());
        onix.tackle();
        onix.rockSlide();
        System.out.println("");
        
        Pokemon[] pokeCollection = {squirt, charm, bulba, onix};
        for (Pokemon p : pokeCollection) {
            System.out.println("Pokemon # " + p.getId());
        }
        System.out.println("");
        
        iEvolvable[] evolvers = {squirt, charm, bulba, onix};
        for (iEvolvable e : evolvers) {
            e.getNextEvolution();
            e.evolve();
            e.getNextEvolution();
            System.out.println("");
        }
    }
    
}
