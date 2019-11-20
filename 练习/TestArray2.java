import java.util.*;

/**
 * This program demonstrates 数组作为函数的参数，数组作为函数的返回值.
 * @version 1.0 2019.10.14
 * @author chengcai
  */

// 数组作为函数的参数
public static void printArray(int[] array){
    for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
    }
}

printArray(new int[]{3,2,1,4,5,6});

// 数组作为函数的返回值
public static int[] reverse(int[] list) {
    int[] result = new int[list.length];

    for (int i = 0; j = result.length - 1; i < list.length; i++, j--) {
        result[j] = list[i];
    }
    return result;
}