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

    public void navigationPayer(GameMap map) {
        int move = getDirection();
        switch (move) {
            case (4): {
                map.moveToTheLeft();
                break;
            }
            case (6): {
                map.moveToTheRight();
                break;
            }
            case (8): {
                map.moveToTheUp();
                break;
            }
            case (2): {
                map.moveToTheDown();
                break;
            }
            default: {
                System.out.print("Вы нажали не верную клавишу");
            }
        }
    }
}
