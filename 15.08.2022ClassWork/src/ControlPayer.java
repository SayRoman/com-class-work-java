import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlPayer {
    private int getDirection() {
        int derection = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            derection = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }
        return derection;
    }

    public void navigationPayer(GameMap map) {
        getDirection();

    }
}
