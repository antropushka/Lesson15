package by.epam.dragon.controller.command_impl;

import by.epam.dragon.bean.Treasure;
import by.epam.dragon.cave_logic.CaveLogic;
import by.epam.dragon.controller.command.Command;
import by.epam.dragon.controller.dto.Request;
import by.epam.dragon.controller.dto.Response;

import java.util.List;

public class AllTreasuresCommand implements Command {

    private final CaveLogic caveLogic = CaveLogic.getInstance();

    @Override
    public Response execute(Request userRequest) {
        Response response = null;
        List<Treasure> allTreasures = caveLogic.getAllTreasures();
        String commandName = userRequest.getCommandName();

        return new Response(commandName, allTreasures);
    }
}
