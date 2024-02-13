import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("-------------------------------------------------\n Проверьте, является ли слово палиндромом\n Введите слов: ");
            String slovo = scanner.nextLine().toLowerCase().replaceAll(" ","");
            char[] char1 = slovo.toCharArray();
            char[] char2 = new char[char1.length];
            for (int i=0;i!= char1.length;i++){
                int kk = char1.length-i-1;
                char2[i] = char1[kk];
            }
            int itog=0;
            for (int i=0;i<= char1.length-1;i++){
                if(char1[i]==char2[i]){
                    itog++;
                }
            }
            if(itog==char1.length){
                System.out.println(" ДА!!!");
            }
            else {
                System.out.println(" Не(((\n Пока");
                break;
            }
        }
    }
}
