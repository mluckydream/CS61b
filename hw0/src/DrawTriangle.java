public class DrawTriangle {
    public static void main(String[] args) {
        int SIZE = 5;
        Draw(SIZE);
    }

    public static void Draw(int row) {
        int col = 1;
        while (col <= row) {
            int i = 0;
            while (i < col) {
                System.out.print('*');
                i++;
            }
            System.out.println();
            col++;
        }
    }
}
