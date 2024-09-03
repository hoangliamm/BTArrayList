
import btarrayslist.NumberExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String check;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhap mang so nguyen");
            System.out.println("2. Xuat mang ra man hinh");
            System.out.println("3. Tim gia tri phan tu lon thu 2");
            System.out.println("4. Xoa cac phan tu le");
            System.out.println("5. Thoat");
            System.out.print("Chon mot tuy chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    NumberExercise.EnterData(numbers);
                    break;
                case 2:
                    NumberExercise.printData(numbers);
                    break;
                case 3:
                    int max2 = NumberExercise.findMax2(numbers);
                    if (max2 != -1) {
                        System.out.println("Gia tri lon thu 2 la: " + max2);
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    System.out.println("Mang sau khi xoa cac phan tu le la: " + numbers);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
                    break;
            }
            check = scanner.nextLine();
        } while (choice != 5);
    }
}
