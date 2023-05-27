package additional_exercise.controller;

import additional_exercise.service.implement_.StudentManagementService;
import additional_exercise.service.interface_.IStudentManagementService;

import java.util.Scanner;

public class StudentManagementController {
    private static IStudentManagementService studentManagementService = new StudentManagementService();
    private static Scanner scanner = new Scanner(System.in);

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
            do {
                try {
                    int option = Integer.parseInt(scanner.nextLine());
                    if (option < 1 || option>4) {
                        throw new RuntimeException("Bạn chỉ được nhập số từ 1 - 4. Vui lòng nhập lại");
                    }
                    switch (option) {
                        case 1:
                            studentManagementService.addStudentTeacher();
                            break;
                        case 2:
                            studentManagementService.deleteStudentTeacher();
                            break;
                        case 3:
                            studentManagementService.displayAll();
                            break;
                        case 4:
                            System.out.println("Bạn đã nhấn thoát chương trình");
                            System.exit(0);
                    }
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Bạn chỉ được nhập số từ 1 - 4. Vui lòng nhập lại");
                } catch (RuntimeException runtimeException) {
                    System.out.println("Bạn chỉ được nhập số từ 1 - 4. Vui lòng nhập lại");
                }
            } while (true);

        }
        while (true);
    }
}
