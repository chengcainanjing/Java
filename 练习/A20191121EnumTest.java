import java.util.*;

/**
 * This program demonstrates enumrated types.
 *
 * @author chengcai
 * @version 1.0 2019.11.21
 */

public class A20191121EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM,LARGE,EXTAR_LARGE)");
        String input = in.next().toUpperCase();
        // 返回指定名字、给定类的枚举常量
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size= " + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == size.EXTRA_LARGE) {
            System.out.println("Good job-- you paid attention to the _.");
        }
    }
}

// 枚举类
enum Size {
    //定义了四个实例
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
}