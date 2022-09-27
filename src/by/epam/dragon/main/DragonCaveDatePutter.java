package by.epam.dragon.main;

import by.epam.dragon.bean.DragonCave;
import by.epam.dragon.bean.Treasure;

import java.util.ArrayList;
import java.util.List;

public class DragonCaveDatePutter {

    public static DragonCave createRedDragonCave() {
        DragonCave redDragonCave = null;
        List<Treasure> treasures = new ArrayList<>();

        treasures.add(new Treasure("кольцо", 120));
        treasures.add(new Treasure("кольцо", 100));
        treasures.add(new Treasure("кольцо", 220));
        treasures.add(new Treasure("кольцо", 300));
        treasures.add(new Treasure("монета", 50));
        treasures.add(new Treasure("монета", 10));
        treasures.add(new Treasure("цепь", 70));

        redDragonCave = new DragonCave(treasures);

        return redDragonCave;
    }

    public static DragonCave createBlueDragonCave() {
        DragonCave blueDragonCave = null;
        List<Treasure> treasures = new ArrayList<>();

        treasures.add(new Treasure("кольцо", 599));
        treasures.add(new Treasure("кольцо", 300));
        treasures.add(new Treasure("кольцо", 100));
        treasures.add(new Treasure("ожерелье", 2000));
        treasures.add(new Treasure("монета", 50));
        treasures.add(new Treasure("кольцо", 200));

        blueDragonCave = new DragonCave(treasures);

        return blueDragonCave;
    }




}
