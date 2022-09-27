package by.epam.dragons.controller.dto;

import by.epam.dragons.bean.Treasure;

import java.util.List;

public class Response {

    private String commandName;
    private Treasure treasure;
    private List<Treasure> treasures;
    private String noSuchCommandMessage;

    public Response(String commandName, List<Treasure> treasures) {
        this.commandName = commandName;
        this.treasures = treasures;
    }

    public Response(String commandName, Treasure treasure) {
        this.commandName = commandName;
        this.treasure = treasure;
    }

    public Response(String commandName, String noSuchCommandMessage) {
        this.commandName = commandName;
        this.noSuchCommandMessage = noSuchCommandMessage;
    }

    public Response(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }


    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }
}
