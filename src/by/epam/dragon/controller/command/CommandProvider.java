package by.epam.dragon.controller.command;

import by.epam.dragon.controller.command_impl.AllTreasuresCommand;
import by.epam.dragon.controller.command_impl.ByCostCommand;
import by.epam.dragon.controller.command_impl.MostExpensiveCommand;
import by.epam.dragon.controller.command_impl.NoSuchCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
       commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
       commands.put(CommandName.BY_SUM, new ByCostCommand());
       commands.put(CommandName.MOST_EXPENSIVE, new MostExpensiveCommand());
       commands.put(CommandName.ALL_TREASURES, new AllTreasuresCommand());

    }

    public Command getCommand (String command) {
        CommandName commandName;
        Command command1;

        try {
            commandName = CommandName.valueOf(command);
            command1 = commands.get(commandName);
            if (command1 == null) {
                command1 = commands.get(CommandName.NO_SUCH_COMMAND);
            }
        } catch (Exception e) {
            command1 = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        return command1;
    }
}
