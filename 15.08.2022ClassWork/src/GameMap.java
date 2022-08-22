public class GameMap {

    char[][] mapAre;

    public void showGameArea(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void moveToTheUp(Hero hero) {
        mapAre[hero.x][hero.y] = '*';
        hero.x = hero.x - 1;
        if (mapAre[hero.x][hero.y] == '*') {
            mapAre[hero.x][hero.y] = 'P';
        } else {
            mapAre[hero.x + 1][hero.y] = 'P';
            hero.x = hero.x + 1;
            System.out.print("Нет возможности передвижения");
        }
        System.out.println();
    }

    public void moveToTheDown(Hero hero) {
        mapAre[hero.x][hero.y] = '*';
        hero.x = hero.x + 1;
        if (mapAre[hero.x][hero.y] == '*') {
            mapAre[hero.x][hero.y] = 'P';
        } else {
            mapAre[hero.x - 1][hero.y] = 'P';
            hero.x = hero.x - 1;
            System.out.print("Нет возможности передвижения");
        }
        System.out.println();

    }

    public void moveToTheRight(Hero hero) {
        mapAre[hero.x][hero.y] = '*';
        hero.y = hero.y + 1;
        if (mapAre[hero.x][hero.y] == '*') {
            mapAre[hero.x][hero.y] = 'P';
        } else {
            mapAre[hero.x][hero.y-1] = 'P';
            hero.y = hero.y - 1;
            System.out.print("Нет возможности передвижения");
        }
        System.out.println();

    }

    public void moveToTheLeft(Hero hero) {
        mapAre[hero.x][hero.y] = '*';
        hero.y = hero.y - 1;
        if (mapAre[hero.x][hero.y] == '*') {
            mapAre[hero.x][hero.y] = 'P';
        } else {
            mapAre[hero.x][hero.y + 1] = 'P';
            hero.y = hero.y + 1;
            System.out.print("Нет возможности передвижения");
        }
        System.out.println();


    }
}

