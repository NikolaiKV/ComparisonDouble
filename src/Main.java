import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double eps = 0.000000000001;

        while(true){
            System.out.println("Введите первое число:");
            double first = scanner.nextDouble();

            System.out.println("Введите второе число:");
            float second = scanner.nextFloat();

            System.out.println("Выберите операцию: round, compare, integer");
            String operation = scanner.next();

            switch (operation){
                case "round":
                    System.out.printf("round first = %s %n", Math.round((double) first));
                    System.out.printf("round second = %s %n", Math.round((double) second));
                    break;
                case "compare":
                    System.out.printf("compare = %s %n", Math.abs(first - second) < eps);
                    break;
                case "integer":
                    System.out.printf("integer = %s %n", (long)(first / second));
                    break;
            }
        }
    }
}