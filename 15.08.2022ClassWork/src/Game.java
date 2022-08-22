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
        System.out.print("You win");
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

    public void player(GameMap map, Hero hero) {
        map.mapAre[hero.x][hero.y] = 'P';
    }



}
