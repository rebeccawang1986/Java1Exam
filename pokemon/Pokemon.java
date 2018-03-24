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
public abstract class Pokemon {
    protected int Id;
    private int HP;
    private int Attack;
    private int Defense;
    private boolean isEvolved;
    
    abstract public void tackle();

    public int getId() {
        return Id;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    public boolean isIsEvolved() {
        return isEvolved;
    }

    public void setIsEvolved(boolean isEvolved) {
        this.isEvolved = isEvolved;
    }
    
    
}
