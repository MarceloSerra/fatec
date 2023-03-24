import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public final class DinossaurGame {
    private final Dinossaur dinossaur;
    private final Scanner scanner;
    private final HashMap<Character, Consumer<IDinossaurMethods>> optionsMap;
    public DinossaurGame(Dinossaur dinossaur) {
        this.dinossaur = dinossaur;
        this.scanner = new Scanner(System.in);
        this.optionsMap = this.mountOptions();
    }
    public void start(){
        while(true){
            this.drawMenu();
            char option = scanner.nextLine().charAt(0);
            this.handleOptions(option);
        }
    }
    private String drawState() {
        String[] states = {
                "[ENERGY]: " + this.dinossaur.getEnergy(),
                "[SPEED]: " + this.dinossaur.getSpeed(),
                "[TEMPERATURE]: " + this.dinossaur.getTemperature(),
                "[HUMOR]: " + this.dinossaur.getHumor()
        };
        return Arrays.stream(states).reduce("", (acc, state) -> acc += state+"\n");
    };
    private void drawMenu() {
        String methods = "It Can: (J)UMP, (R)UN, (E)AT, (S)ING, SUN(B)ATHE, STAY IN SHA(D)E";
        System.out.println(this.drawState() + "\n" + methods);
    }

    private HashMap<Character, Consumer<IDinossaurMethods>> mountOptions(){
        HashMap<Character, Consumer<IDinossaurMethods>> optionsMap = new HashMap<>();

        optionsMap.put(DinossaurOptionsEnum.JUMP.getOption(), IDinossaurMethods::jump);
        optionsMap.put(DinossaurOptionsEnum.RUN.getOption(), IDinossaurMethods::run);
        optionsMap.put(DinossaurOptionsEnum.EAT.getOption(), IDinossaurMethods::eat);
        optionsMap.put(DinossaurOptionsEnum.SING.getOption(), IDinossaurMethods::sing);
        optionsMap.put(DinossaurOptionsEnum.SUNBATHE.getOption(), IDinossaurMethods::sunbathe);
        optionsMap.put(DinossaurOptionsEnum.SHADE.getOption(), IDinossaurMethods::stayInShade);

        return optionsMap;
    };

    private void handleOptions(Character option){
        this.optionsMap.get(option).accept(this.dinossaur);
    }
}
