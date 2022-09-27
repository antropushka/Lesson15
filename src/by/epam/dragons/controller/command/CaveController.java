package by.epam.dragons.controller.command;

import by.epam.dragons.controller.dto.Request;
import by.epam.dragons.controller.dto.Response;

public class CaveController {

    private final CommandProvider commandProvider = new CommandProvider();

    public Response makeResponse (Request userRequest) {

        String commandName = userRequest.getCommandName();
        Command command = commandProvider.getCommand(commandName);
        Response response = command.execute(userRequest);

        return response;
    }

}
