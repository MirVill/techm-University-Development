package Ejercicio2;

public class Sword extends Weapon{
    String handle;

    public Sword(String name, int amount, int amountLimit, String type, double power, String handle) {
        super(name, amount, amountLimit, type, power);
        this.handle = handle;
    }

    void setHandle(String handle){
        this.handle= handle;
    }

    String getHandle() {
        return handle;
    }

    @Override
    void setType(String type) {
        this.type = type;
    }

    @Override
    String getType() {
        return type;
    }

    @Override
    void setPower(double power) {
        this.power = power;
    }

    @Override
    double getPower() {
        return power;
    }
    
}
