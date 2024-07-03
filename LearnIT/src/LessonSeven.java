import java.util.Scanner;

public class LessonSeven {
    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;


        while (isContinue) {
            System.out.println("Выберите куда двинуться\n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    y++;
                    break;
                case 2:
                    y--;
                    break;
                case 3:
                    x++;
                    break;
                case 4:
                    x--;
                    break;
                default:
                    System.out.println("Error");
                    isContinue = false;
            }
            System.out.println("Координаты по вертикали - " + y + "\nКоординаты по горизонтали - " + x);
        }
    }
}