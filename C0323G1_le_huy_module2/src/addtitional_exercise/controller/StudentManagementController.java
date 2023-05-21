package addtitional_exercise.controller;


import java.util.Scanner;

public class StudentManagementController {
    /**
     * Method menu() use to show the menu
     */
    public static void menu() {
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Chọn chức năng theo số để tiếp tục: ");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xoá giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng: ");

            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    //method
                    break;
                case 2:
                    //method
                    break;
                case 3:
                    //method
                    break;
                case 4:
                    System.out.println("Bạn đã nhấn thoát chương trình");
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
