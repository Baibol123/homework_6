public class Weapon {
    private WeaponType FIREARMS;
    private WeaponType STEAL_ARMS;
    private String AK_47;
    private String arrow;

    public Weapon(WeaponType FIREARMS, String AK_47) {
        this.FIREARMS = FIREARMS;
        this.AK_47 = AK_47;
    }

    public WeaponType getFIREARMS() {
        return FIREARMS;
    }

    public void setFIREARMS(WeaponType FIREARMS) {
        this.FIREARMS = FIREARMS;
    }

    public String getAK_47() {
        return AK_47;
    }

    public void setAK_47(String AK_47) {
        this.AK_47 = AK_47;
    }



    public WeaponType getSTEAL_ARMS() {
        return STEAL_ARMS;
    }

    public void setSTEAL_ARMS(WeaponType STEAL_ARMS) {
        this.STEAL_ARMS = STEAL_ARMS;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }
}
