package by.epam.dragon.controller.command_impl;

import by.epam.dragon.cave_logic.CaveLogic;
import by.epam.dragon.controller.command.Command;
import by.epam.dragon.controller.command.CommandName;
import by.epam.dragon.controller.dto.Request;
import by.epam.dragon.controller.dto.Response;

public class NoSuchCommand implements Command {

    private final CaveLogic caveLogic = CaveLogic.getInstance();

    @Override
    public Response execute(Request request) {

        Response response = null;
        String commandNAme = request.getCommandName();

        return new Response(commandNAme, CommandName.NO_SUCH_COMMAND.name());
    }
}
