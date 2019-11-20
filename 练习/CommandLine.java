/**
 * This program demonstrates 命令行参数使用. java CommandLine this is a commadn line.
 * @version 1.0 2019.10.17
 * @author chengcai
  */



public class CommandLine {
    /* 主方法 */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
