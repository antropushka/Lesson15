package by.epam.dragons.controller.dto;

import by.epam.dragons.bean.DragonCave;

public class Request {

    private String commandName;
    private DragonCave dragonCave;
    private int amountOfMoney;
    private String noSuchCommandMessage;

    public Request(String commandName, int amountOfMoney) {
        this.commandName = commandName;
        this.amountOfMoney = amountOfMoney;
    }

    public Request(String commandName, DragonCave dragonCave) {
        this.commandName = commandName;
        this.dragonCave = dragonCave;
    }

    public Request(String commandName, String noSuchCommandMessage) {
        this.commandName = commandName;
        this.noSuchCommandMessage = noSuchCommandMessage;
    }

    public Request(String commandName) {
        this.commandName = commandName;
    }

    public DragonCave getDragonCave() {
        return dragonCave;
    }

    public void setDragonCave(DragonCave dragonCave) {
        this.dragonCave = dragonCave;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getNoSuchCommandMessage() {
        return noSuchCommandMessage;
    }

    public void setNoSuchCommandMessage(String noSuchCommandMessage) {
        this.noSuchCommandMessage = noSuchCommandMessage;
    }
}
