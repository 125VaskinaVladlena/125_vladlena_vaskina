package task;

public class BattleUnit {
    private int force, armor, health, x, y, demage;
    public BattleUnit(int force, int armor, int health, int x, int y){
        this.force = force;
        this.armor = armor;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getStrength(){
        return force;
    }
    public int getArmor(){
        return armor;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getHealth(){
        return health;
    }
    //- размер урона при атаке вычисляется по формуле:
    //        *    урон = сила_атакующего - броня_атакуемого
    public void attacked(BattleUnit enemy){
        if (armor>0) {
            if (enemy.force >= armor) {
                demage = enemy.force - armor;
                health -= demage;
            } else {
                health = health;
            }
        }
        else{
            health -= enemy.force;}
    }

    //перещение
    public void moveUp(){
        y--;}
    public void moveDown(){
        y++;}
    public void moveLeft(){
        x--;}
    public void moveRight(){
        x++;}
    public  boolean isAlive(){
        return health>0;
    }


}