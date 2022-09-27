package by.epam.dragons.controller.command_impl;

import by.epam.dragons.bean.Treasure;
import by.epam.dragons.cave_logic.CaveLogic;
import by.epam.dragons.controller.command.Command;
import by.epam.dragons.controller.dto.Request;
import by.epam.dragons.controller.dto.Response;

public class MostExpensiveCommand implements Command {

    private final CaveLogic caveLogic = CaveLogic.getInstance();

    @Override
    public Response execute(Request userRequest) {
        Response response = null;
        Treasure mostExpensiveTreasure = caveLogic.getMostExpensiveTreasure();
        String commandName = userRequest.getCommandName();

        return new Response(commandName, mostExpensiveTreasure);
    }


}
