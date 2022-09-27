package by.epam.dragon.view;

import by.epam.dragon.bean.Treasure;

import java.util.List;

public class DragonCaveConsoleOutput {

    private static final DragonCaveConsoleOutput instance = new DragonCaveConsoleOutput();

    public DragonCaveConsoleOutput() {
    }

    public static DragonCaveConsoleOutput getInstance() {
        return instance;
    }

    public void printInfoAllTreasures (List<Treasure> treasures) {
        System.out.println("-------------------------\n"
                            + "|   name   |   price   | \n"
                            + "------------------------");
        for (int i = 0; i < treasures.size(); i++) {
            System.out.printf("|%-10s|%-10d|\n",
                    treasures.get(i).getName(),
                    treasures.get(i).getPrice());
        }
        System.out.println("-----------------------\n");
    }

    public void printInfoAboutTreasure (Treasure treasure) {
        System.out.print(treasure);
    }

    public void exitMessage() {
        System.out.println("GoodBuy!");
    }
    public void errorMessage() {
        System.out.println("Such command does not exist.");
    }


}
