import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("<-------------> Здравстуйте. Это калькулятор здоровья <------------->");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введитое свой вес (кг): ");
        int ves = scanner.nextInt();
        System.out.print("Введитое свой рост (м): ");
        double rost = scanner.nextDouble();
        System.out.print("Введитое свой возраст: ");
        int vosrast = scanner.nextInt();
        double imt = ves / Math.pow(rost, 2);
        double ideal = 24.9 * Math.pow(rost, 2);
        double kalor = 655.1 + (9.563 * ves) + (1.85 * rost) - (4.676 * vosrast);
        if (imt > 24.9) {
            kalor = kalor - 500;
            System.out.println("Рекомендуется снизить вес для достижения идеального веса. \nИдеальный вес: " + ideal + ". Необходимо сбросить: " + (ves - ideal) + "кг. Рекомендуемый дневной прием калорий: " + kalor);
        } else if (imt < 18.5) {
            kalor=kalor+500;
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса. \nИдеальный вес: "+ideal+". Необходимо набрать: "+(ideal - ves)+" кг. Рекомендуемый дневной прием калорий: "+ kalor);
        }
        else{
            System.out.println("Ваш вес находится в пределах нормы. \nИдеальный вес: "+ideal+". Рекомендуемый дневной прием калорий: "+kalor);
        }
    }
}
