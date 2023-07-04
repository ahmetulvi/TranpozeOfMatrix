
public class Main {
    public static void main(String[] args) {
      int[][] matrix=   {{5,6,7 },{8,9,10}};
        System.out.println("Before the change.");
        print(matrix);
        System.out.println("------------------");
        System.out.println("After the change.");
        change(matrix);

    }
    public static void change(int[][] matrix){
        int[][] newMatrix=new int[matrix[0].length][matrix.length];

        for (int rows=0;rows< matrix.length;rows++){
            for (int col=0;col< matrix[0].length;col++){
                newMatrix[col][rows]=matrix[rows][col];
            }
        }
        print(newMatrix);

    }
    public static void print(int[][] matrix){
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
