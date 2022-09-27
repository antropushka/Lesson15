package by.epam.dragons.controller.command_impl;

import by.epam.dragons.cave_logic.CaveLogic;
import by.epam.dragons.controller.command.Command;
import by.epam.dragons.controller.command.CommandName;
import by.epam.dragons.controller.dto.Request;
import by.epam.dragons.controller.dto.Response;

public class NoSuchCommand implements Command {

    private final CaveLogic caveLogic = CaveLogic.getInstance();

    @Override
    public Response execute(Request request) {

        Response response = null;
        String commandNAme = request.getCommandName();

        return new Response(commandNAme, CommandName.NO_SUCH_COMMAND.name());
    }
}
