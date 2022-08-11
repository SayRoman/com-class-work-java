public class Task0 {
    /* *********
     *
     *       *
     *       *
     * *******
     */
    char[][] arrayPlayPlace = new char[10][10];

    public static void main(String[] args) {
        Task0 obj = new Task0();

        obj.createPlayPlace();
        obj.showArray();
    }

    public void createPlayPlace() {
        for (int i = 0; i < arrayPlayPlace.length; i++) {
            for (int j = 0; j < arrayPlayPlace[i].length; j++) {
                arrayPlayPlace[i][j] = '*';
            }
        }
    }

    public void showArray() {
        for (int i = 0; i < arrayPlayPlace.length; i++) {
            for (int j = 0; j < arrayPlayPlace[i].length; j++) {
                System.out.print(arrayPlayPlace[i][j] + " ");
            }
            System.out.println();
        }
    }
}
