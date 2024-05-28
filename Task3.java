public class Task3 {
    public static void main(String[] args) {
        //Даны три вещественных числа a,b,c.Проверить:
        // 1.выполняется ли неравенство a<b<c
        // 2.выполняется ли неравенство b>a>c.
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sc.close();
            if (a<b<c) {
            System.out.println("неравенство выполняется");
            }else if (b>a>c) {
                }
                System.out.println("неравенство выполняется");
        }
    }
}
