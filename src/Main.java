public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(100);
        boss.setDamage(50);
        boss.setDefenseType("Shield");

        System.out.println("Health: " + boss.getHealth() + "," + " Damage: " + boss.getDamage() + "," + " Defense type: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero " + (i+1)); // i+1 to start with hero 1
            System.out.println("Health"+ heroes[i].getHealth());
            System.out.println("Damage" +heroes[i].getDamage());
            System.out.println("Superpower " + heroes[i].getSuperPower());
        }

    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(100, 50, "Invisibility");
        Hero hero2 = new Hero(80, 40, "Flight");
        Hero hero3 = new Hero(120, 60, "Teleportation");

        return new Hero[]{hero1, hero2, hero3};
    }


}
