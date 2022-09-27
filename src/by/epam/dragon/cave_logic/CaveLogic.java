package by.epam.dragon.cave_logic;

import by.epam.dragon.bean.DragonCave;
import by.epam.dragon.bean.Treasure;
import by.epam.dragon.dao.TreasureRepository;

import java.util.ArrayList;
import java.util.List;

public final class CaveLogic {

    private final DragonCave redDragonCave = TreasureRepository.getRedDragonCave();
    //private final DragonCave blueDragonCave = TreasureRepository.getBlueDragonCave();

    private static final CaveLogic instance = new CaveLogic();

    public CaveLogic() {
    }

    public static CaveLogic getInstance() {
        return instance;
    }

    public Treasure getMostExpensiveTreasure() {
        List<Treasure> treasures = redDragonCave.getTreasures();
        int max = treasures.get(0).getPrice();
        int maxInd = 0;
        for (int i = 0; i < treasures.size(); i++) {
            if (treasures.get(i).getPrice() > max) {
                max = redDragonCave.getTreasures().get(i).getPrice();
                maxInd = i;
            }
        }
        return redDragonCave.getTreasures().get(maxInd);
    }

    public List<Treasure> treasuresOnAmount (int amountOfMoney) {

        List<Treasure> treasures = redDragonCave.getTreasures();
        List<Treasure> treasuresOnAmount = new ArrayList<>();
        while (true) {
            for (int i = 0; i < treasures.size(); i++) {
                int amount = 0;
                Treasure currentTreasure = treasures.get(i);
                int currentTreasureAmount = treasures.get(i).getPrice();
                int currentAmount = amount + currentTreasureAmount;
                if (currentAmount <= amountOfMoney) {
                    treasuresOnAmount.add(currentTreasure);
                    amount += currentTreasureAmount;
                } else {
                    break;
                }

            }
            return treasuresOnAmount;
        }
    }

    public List<Treasure> getAllTreasures() {
        List<Treasure> treasures = redDragonCave.getTreasures();
        return redDragonCave.getTreasures();
    }

}
