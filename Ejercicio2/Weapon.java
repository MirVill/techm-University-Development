package Ejercicio2;

import java.util.UUID;

public abstract class Weapon implements Item{
    public UUID id;
    public String name;
    public int amount;
    public int amountLimit;

    public String type;
    public Double power;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmountLimit() {
        return amountLimit;
    }

    @Override
    public void setAmountLimit(int amountLimit) {
        this.amountLimit = amountLimit;
    }

    public abstract String getType();

    public abstract void setType(String type);

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public String toStirng() {
        return "ID: " + getId() + ", Name: " + getName() + ", Amount: " + getAmount() + ", Amount Limit: " +
                getAmountLimit() + ", Type: " + getType() + ", Power: " + getPower();
    }
}
