package by.epam.dragons.user_menu;

import by.epam.dragons.controller.command.CaveController;
import by.epam.dragons.controller.command.CommandName;
import by.epam.dragons.controller.dto.Request;
import by.epam.dragons.controller.dto.Response;

import by.epam.dragons.view.DragonCaveConsoleOutput;

import java.util.Scanner;

public class UserMenu {

    Scanner scanner = new Scanner(System.in);
    CaveController caveController = new CaveController();
    DragonCaveConsoleOutput dragonCaveConsoleOutput = new DragonCaveConsoleOutput();

    public void startProgram() {

        while (true) {
            System.out.println("Please, make your choice. Click: \n" +
                            "1 : to get information about all treasures in the cave; \n" +
                            "2 : to get  information about the most expensive treasure n the cave; \n" +
                            "3 : to get information about treasures or a certain amount; \n" +
                            "0 : exit the program.");

            while(!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("The option you entered is not in the menu. Please make your choice again!");
            }
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("All treasures in the cave are:");
                    Request requestAllTreasures = new Request(CommandName.ALL_TREASURES.name());
                    Response responseAllTreasures = caveController.makeResponse(requestAllTreasures);
                    dragonCaveConsoleOutput.printInfoAllTreasures(responseAllTreasures.getTreasures());
                    break;

                case 2:
                    System.out.println("Most expensive treasure in the cave is:");
                    Request requestMostExpensive = new Request(CommandName.MOST_EXPENSIVE.name());
                    Response responseMostExpensive = caveController.makeResponse(requestMostExpensive);
                    dragonCaveConsoleOutput.printInfoAboutTreasure(responseMostExpensive.getTreasure());
                    break;

                case 3:
                    System.out.println("Enter the amount of money you have:");
                    while(!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.print("Please, enter the amount of money in digits");
                    }
                    int amount = scanner.nextInt();
                    System.out.println("List of treasures for a given amount:");
                    Request requestByCost = new Request(CommandName.BY_SUM.name(), amount);
                    Response responseByCost = caveController.makeResponse(requestByCost);
                    dragonCaveConsoleOutput.printInfoAllTreasures(responseByCost.getTreasures());
                    break;

                case 0:
                    dragonCaveConsoleOutput.exitMessage();
                    return;

                default:
                    Request noSuchRequest = new Request(CommandName.NO_SUCH_COMMAND.name());
                    Response noSuchResponse = caveController.makeResponse(noSuchRequest);
                    dragonCaveConsoleOutput.errorMessage();
            }

        }
    }

}
