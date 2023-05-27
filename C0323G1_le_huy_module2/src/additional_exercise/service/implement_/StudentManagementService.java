package additional_exercise.service.implement_;

import additional_exercise.model.Person;
import additional_exercise.model.Student;
import additional_exercise.model.Teacher;
import additional_exercise.repository.implement_.StudentManagementRepository;
import additional_exercise.repository.interface_.IStudentManagementRepository;
import additional_exercise.service.interface_.IStudentManagementService;

import java.util.List;
import java.util.Scanner;

public class StudentManagementService implements IStudentManagementService {
    private IStudentManagementRepository studentManagementRepository = new StudentManagementRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addStudentTeacher() {
        System.out.println("Bạn muốn nhập đối tượng nào? Vui lòng chọn số tương ứng: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Giảng viên");
        System.out.println("Chọn : ");
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) {
            addStudent();
        } else {
            addTeacher();
        }
        studentManagementRepository.writeFileCsv("src/additional_exercise/repository/person.csv");
    }

    @Override
    public void addStudent() {
        System.out.println("Nhập mã sinh viên: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của sinh viên: ");
        String birthdate = scanner.nextLine();
        System.out.println("Nhập giới tính của sinh viên: 1. Nam/ 2. Nữ");
        int genderOption = Integer.parseInt(scanner.nextLine());
        boolean gender;
        if (genderOption == 1) {
            gender = true;
        } else {
            gender = false;
        }
        System.out.println("Nhập lớp của sinh viên: ");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm của sinh viên: ");
        float score = Float.parseFloat(scanner.nextLine());
        Person person = new Student(id, name, birthdate, gender, className, score);
        studentManagementRepository.addPerson(person);
        System.out.println("Bạn đã thêm mới thành công");
    }

    @Override
    public void addTeacher() {
        System.out.println("Nhập mã giảng viên: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của giảng viên: ");
        String birthdate = scanner.nextLine();
        System.out.println("Nhập giới tính của giảng viên: 1. Nam/ 2. Nữ");
        int genderOption = Integer.parseInt(scanner.nextLine());
        boolean gender;
        if (genderOption == 1) {
            gender = true;
        } else {
            gender = false;
        }
        System.out.println("Nhập chuyên môn của giảng viên: ");
        String subject = scanner.nextLine();
        Person person = new Teacher(id, name, birthdate, gender, subject);
        studentManagementRepository.addPerson(person);
        System.out.println("Bạn đã thêm mới thành công");
    }

    @Override
    public void displayAll() {
        List<Person> personList = studentManagementRepository.getAll();
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Override
    public void deleteStudentTeacher() {
        System.out.println("Nhập mã sinh viên/giảng viên muốn xoá: ");
        String id = scanner.nextLine();
        System.out.println("Bạn có muốn xoá sinh viên/giảng viên có id " + id + ". Vui lòng chọn số: ");
        System.out.println("1. Có");
        System.out.println("2. Không");
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) {
            Person person = studentManagementRepository.getPersonById(id);
            studentManagementRepository.deletePerson(person);
            System.out.println("Bạn đã xoá thành công id " + id);
        } else {
            System.out.println("Bạn đã chọn không xóa");
        }
    }
}
