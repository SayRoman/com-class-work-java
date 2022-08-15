public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        GameMap map = new GameMap();
        ControlPayer controlPayer = new ControlPayer();
        Hero hero = new Hero();
        game.creatMap(map);
        game.addStone(map);
        game.player(map, 9, 0);
        game.showGameArea(map.mapAre);
    }

    public void creatMap(GameMap map) {
        map.mapAre = new char[10][10];
        for (int i = 0; i < map.mapAre.length; i++) {
            for (int j = 0; j < map.mapAre[i].length; j++) {
                map.mapAre[i][j] = '*';

            }
        }
    }

    public void addStone(GameMap map) {
        for (int i = 0; i < map.mapAre.length; i++) {
            for (int j = 0; j < map.mapAre[i].length; j++) {
                map.mapAre[i][j] = (char) (Math.random() * 100);
                if (map.mapAre[i][j] >= 80) {
                    map.mapAre[i][j] = 'S';
                } else {
                    map.mapAre[i][j] = '*';
                    map.mapAre[0][9] = '*';
                }
            }
        }
    }

    public void player(GameMap map, int indexX, int indexY) {
        map.mapAre[indexX][indexY] = 'P';
    }


    public void showGameArea(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


}
