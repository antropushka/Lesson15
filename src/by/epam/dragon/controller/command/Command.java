package by.epam.dragon.controller.command;

import by.epam.dragon.controller.dto.Request;
import by.epam.dragon.controller.dto.Response;

public interface Command {

    Response execute (Request request);


}
