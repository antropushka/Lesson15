package by.epam.dragons.controller.command_impl;

import by.epam.dragons.bean.Treasure;
import by.epam.dragons.cave_logic.CaveLogic;
import by.epam.dragons.controller.command.Command;
import by.epam.dragons.controller.dto.Request;
import by.epam.dragons.controller.dto.Response;

import java.util.List;

public class ByCostCommand implements Command {

    private final CaveLogic caveLogic = CaveLogic.getInstance();

    @Override
    public Response execute(Request request) {
        Response response = null;
        List<Treasure> treasuresOnAmount = caveLogic.treasuresOnAmount(request.getAmountOfMoney());
        String commandName = request.getCommandName();

        return new Response(commandName, treasuresOnAmount);
    }
}
