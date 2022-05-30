package pojos;

import javax.persistence.*;

public class Gear {

    private int id;
    private String weapon;
    private String model;
    private String ammo;
    private int ammo_amount;
    private boolean bulletProofVest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public int getAmmo_amount() {
        return ammo_amount;
    }

    public void setAmmo_amount(int ammo_amount) {
        this.ammo_amount = ammo_amount;
    }

    public boolean isBulletProofVest() {
        return bulletProofVest;
    }

    public void setBulletProofVest(boolean bulletProofVest) {
        this.bulletProofVest = bulletProofVest;
    }
}
