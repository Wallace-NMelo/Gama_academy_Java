package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Matrix {
    public void matrix_init(int[][] array) {
        List<Integer> array1D = new ArrayList<>(), array2D = new ArrayList<>();
        int n_rows = array[1].length, n_columns = array.length;
        int array1D_sum = 0, array2D_sum = 0;
        int array1D_max = 0, array2D_max = 0;
        int array1D_min = 0, array2D_min = 0;
        if (n_rows != n_columns) {
            System.out.print("Invalid Matrix");
            return;
        }
        for (int i = 0; i < n_rows; i++) {
            for (int j = 0; j < n_columns; j++) {
                if (i == j) {
                    array1D.add(array[i][j]);
                    array1D_sum += array[i][j];
                }
                if ((i + j) == n_rows - 1) {
                    array2D.add(array[i][j]);
                    array2D_sum += array[i][j];
                }

            }
        }
        array1D_max = Collections.max(array1D);
        array1D_min = Collections.min(array1D);
        array2D_max = Collections.max(array2D);
        array2D_min = Collections.min(array2D);


    }
}

