package Ejercicio2;

public class Gun extends Weapon{
    public Ammo ammoType;

    public Ammo getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(Ammo ammoType) {
        this.ammoType = ammoType;
    }
}