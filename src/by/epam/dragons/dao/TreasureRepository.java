package by.epam.dragons.dao;

import by.epam.dragons.bean.DragonCave;
import by.epam.dragons.main.DragonCaveDatePutter;

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
