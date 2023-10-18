public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.FIREARMS, "AK_47");


        Skeleton skeleton1 = new Skeleton(200, 50, WeaponType.STEAL_ARMS,  "Longbow");
        Skeleton skeleton2 = new Skeleton(200, 50, WeaponType.STEAL_ARMS,  "Shortbow");




        Boss boss = new Boss(1500, 100, bossWeapon);
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getFIREARMS());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getAK_47());


        System.out.println("-----------------------------------");

        System.out.println("Boss Info:\n" + boss.printInfo());


        System.out.println("\nSkeleton 1 Info:\n" + skeleton1.printInfo());
        System.out.println("\nSkeleton 2 Info:\n" + skeleton2.printInfo());

    }

}