import java.util.Arrays;
import java.util.List;

public class tryMethod {
    public static void main(String[] args) {
        
        int[] array1 = {1, 4, 5, 6};
        int[] array2 = {2, 3, 7, 9};
        int[] sumArray = sumList(array1, array2);
        System.out.println(sumArray);
        System.out.println(sumArray[0]);
        System.out.println(Arrays.toString(sumArray));
        

    }

    public static int[] sumList(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array1[i] + array2[i];
        }
        System.out.println(newArray);

        return newArray;
        
    }


    
}
