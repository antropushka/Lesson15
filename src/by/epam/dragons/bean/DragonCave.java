package by.epam.dragons.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DragonCave implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Treasure> treasures;

    public DragonCave() {
    }

    public DragonCave(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DragonCave)) return false;
        DragonCave that = (DragonCave) o;
        return Objects.equals(treasures, that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "treasures=" + treasures +
                '}';
    }
}
