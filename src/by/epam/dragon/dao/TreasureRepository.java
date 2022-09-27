package by.epam.dragon.dao;

import by.epam.dragon.bean.DragonCave;
import by.epam.dragon.main.DragonCaveDatePutter;

public class TreasureRepository {

    private static DragonCave blueDragonCave = DragonCaveDatePutter.createBlueDragonCave();
    private static DragonCave RedDragonCave = DragonCaveDatePutter.createBlueDragonCave();

    public static DragonCave getBlueDragonCave() {
        return blueDragonCave;
    }

    public static void setBlueDragonCave(DragonCave blueDragonCave) {
        TreasureRepository.blueDragonCave = blueDragonCave;
    }

    public static DragonCave getRedDragonCave() {
        return RedDragonCave;
    }

    public static void setRedDragonCave(DragonCave redDragonCave) {
        RedDragonCave = redDragonCave;
    }
}
