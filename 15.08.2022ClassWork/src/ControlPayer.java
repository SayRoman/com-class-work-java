import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlPayer {

    private int getDirection() {
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }
        return direction;
    }

    public void navigationPayer(GameMap map, Hero hero) {

        int move = getDirection();
        switch (move) {
            case (4): {
                map.moveToTheLeft(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            case (6): {
                map.moveToTheRight(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            case (8): {
                map.moveToTheUp(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            case (2): {
                map.moveToTheDown(hero);
                map.showGameArea(map.mapAre);
                break;
            }
            default: {
                System.out.print("Вы нажали не верную клавишу");
            }
        }
    }
}
