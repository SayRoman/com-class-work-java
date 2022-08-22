public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        GameMap map = new GameMap();

        ControlPayer controlPayer = new ControlPayer();

        Hero hero = new Hero();


        game.creatMap(map);
        game.addStone(map);

        game.player(map, hero);
        map.showGameArea(map.mapAre);
        do {
            controlPayer.navigationPayer(map, hero);
        }
        while (hero.y != 9 || hero.x != 0);
        System.out.println();
        System.out.print(ANSI_GREEN + "You win" + ANSI_RESET);
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void creatMap(GameMap map) {
        map.mapAre = new char[20][20];
        for (int i = 0; i < map.mapAre.length; i++) {
            for (int j = 0; j < map.mapAre[i].length; j++) {
                map.mapAre[i][j] = '.';

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
                    map.mapAre[i][j] = '.';
                    map.mapAre[18][0] = '.';
                    map.mapAre[18][1] = '.';
                    map.mapAre[19][1] = '.';
                    map.mapAre[0][19] = '.';
                }
            }
        }
    }

    public void player(GameMap map, Hero hero) {
        map.mapAre[hero.x][hero.y] = 'P';
    }


}