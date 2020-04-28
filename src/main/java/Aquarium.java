import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishes = new ArrayList();

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void removeFish(Fish fish) {
        fishes.remove(fish);
    }

    public void showAllFishesInAquarium() {
        for (Fish fish : fishes) {
            System.out.println(fish);
        }

    }

}

