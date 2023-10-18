public class Skeleton extends Boss {

    private WeaponType STEAL_ARMS;
    private String arrow;
    public Skeleton(int health, int damage, WeaponType STEAL_ARMS, String arrow) {
        super(health, damage, new Weapon(STEAL_ARMS, "Skeleton Weapon"));
        this.STEAL_ARMS = STEAL_ARMS;
        this.arrow = arrow;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public WeaponType getSTEAL_ARMS() {
        return STEAL_ARMS;
    }

    public void setSTEAL_ARMS(WeaponType STEAL_ARMS) {
        this.STEAL_ARMS = STEAL_ARMS;
    }

    @Override
    public String printInfo() {
        return "\nSkeleton Health: " + getHealth() +
                "\nSkeleton Damage: " + getDamage() +
                "\nSkeleton Weapon Type: " + getSTEAL_ARMS() +
                "\nSkeleton Weapon Name: " + getWeapon().getArrow() +
                "\nSkeleton Arrow Count: " + arrow;
    }
}