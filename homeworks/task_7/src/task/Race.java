package task;
//    Список значений:
//        *       - Orc      - сила 6, здоровье 12, ловкость 2
//        *       - Elf      - сила 2, здоровье 9,  ловкость 9
//        *       - Dwarf    - сила 6, здоровье 10, ловкость 4
//        *       - Halfling - сила 1, здоровье 8,  ловкость 11
//        *       - Human    - сила 6, здоровье 7,  ловкость 7

public enum Race {
    Orc(6,12,2),
    Elf(2, 9, 9),
    Dwarf(6, 10, 4),
    Halfling(1, 8, 11),
    Human(6, 7, 7);
    Race(int strength, int health, int dexterity){
        this.strength = strength;
        this.health = health;
        this.dexterity = dexterity;
    }

    private int strength, health, dexterity;

    //методы возвращения характеристик
    public int strength(){
        return strength;
    }
    public int health(){
        return health;
    }
    public int dexterity(){
        return dexterity;
    }

}