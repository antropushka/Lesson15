package by.epam.dragons.controller.command;

import by.epam.dragons.controller.dto.Request;
import by.epam.dragons.controller.dto.Response;

public interface Command {

    Response execute (Request request);


}
