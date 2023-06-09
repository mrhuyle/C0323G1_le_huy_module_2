package additional_exercise.service.implement_;

import additional_exercise.common.ReadWriteFileCsv;
import additional_exercise.model.Person;
import additional_exercise.model.Student;
import additional_exercise.model.Teacher;
import additional_exercise.repository.implement_.StudentManagementRepository;
import additional_exercise.repository.interface_.IStudentManagementRepository;
import additional_exercise.untils.DuplicateDataException;
import additional_exercise.untils.GenderOptionException;
import additional_exercise.service.interface_.IStudentManagementService;
import additional_exercise.untils.InputScoreException;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManagementService implements IStudentManagementService {
    private IStudentManagementRepository studentManagementRepository = new StudentManagementRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addStudentTeacher() {
        int option;
        do {
            try {
                System.out.println("Bạn muốn nhập đối tượng nào? Vui lòng chọn số tương ứng: \n" +
                        "1. Sinh viên\n" +
                        "2. Giảng viên");
                try {
                    option = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai định dạng số");
                    continue;
                }

                if (option == 1) {
                    addStudent();
                } else if (option == 2) {
                    addTeacher();
                } else {
                    throw new GenderOptionException();
                }
                break;
            } catch (GenderOptionException genderOptionException) {
                System.out.println("Chỉ được nhập số 1 hoặc số 2. Nhập lại:");
            }
        } while (true);
    }

    @Override
    public void addStudent() {
        //Input id:
        String id;
        do {
            try {
                System.out.println("Nhập mã sinh viên: ");
                id = scanner.nextLine();
                if (!checkIdDuplicate(id)) {
                    throw new DuplicateDataException();
                }
                if (!checkIdStudentFormat(id) || id.trim().isEmpty()) {
                    throw new RuntimeException();
                }
                break;
            } catch (DuplicateDataException e) {
                System.out.println("Id đã tồn tại. Nhập lại");
            } catch (RuntimeException runtimeException) {
                System.out.println("Mã sinh viên phải theo định dạng: " +
                        "Ký tự S (student) và theo sau là số có 3 chữ số. Nhập lại");
            }
        } while (true);
        //Input name:
        String name;
        do {
            try {
                System.out.println("Nhập tên sinh viên: ");
                name = scanner.nextLine();
                if (name.length() < 3 || name.length() > 100) {
                    System.out.println("Độ dài chuỗi tên phải lớn hơn 3 ký tự và nhỏ 100 ký tự");
                    continue;
                }
                if (name.trim().isEmpty()) {
                    throw new RuntimeException("Không được để trống");
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Không được để trống dữ liệu");
            }
        } while (true);

        //Input birthdate:
        String birthdate;
        do {
            try {
                System.out.println("Nhập ngày sinh của sinh viên: ");
                birthdate = scanner.nextLine();
                if (!checkDateFormat(birthdate) || birthdate.trim().isEmpty()) {
                    throw new RuntimeException("Nhập sai định dạng ngày");
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Ngày phải theo định dạng dd/mm/yyyy. Vui lòng nhập lại");
            }
        } while (true);

        //Input gender:
        int genderOption;
        boolean gender;
        do {
            try {
                System.out.println("Nhập giới tính của sinh viên: 1. Nam/ 2. Nữ");
                try {
                    genderOption = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai định dạng số. Nhập lại");
                    continue;
                }
                if (genderOption == 1) {
                    gender = true;
                } else if (genderOption == 2) {
                    gender = false;
                } else {
                    throw new GenderOptionException();
                }
                break;
            } catch (GenderOptionException genderOptionException) {
                System.out.println("Chỉ được nhập số 1 hoặc số 2. Nhập lại: ");
            }
        } while (true);

        //Input classname:
        String className;
        do {
            try {
                System.out.println("Nhập lớp của sinh viên");
                className = scanner.nextLine();
                if (!checkClassNameFormat(className) || className.trim().isEmpty()) {
                    throw new RuntimeException();
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Tên lớp phải theo định dạng: \n" +
                        "Ký tự C (fulltime)/Ký tự A (partime) và theo sau là số có 2 chữ số. Nhập lại");
            }
        } while (true);

        //Input score:
        float score;
        do {
            try {
                try {
                    System.out.println("Nhập điểm của sinh viên: ");
                    score = Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai định dạng điểm.Nhập lại");
                    continue;
                }
                if (score < 0 || score > 10) {
                    throw new InputScoreException("Điểm số phải từ 1 đến 10");
                }
                break;
            } catch (InputScoreException inputScoreException) {
                System.out.println("Điểm số phải từ 1 đến 10");
            }
        } while (true);

        //Create new student:
        Person person = new Student(id, name, birthdate, gender, className, score);
        studentManagementRepository.addPerson(person);
        System.out.println("Bạn đã thêm mới thành công");
    }

    @Override
    public void addTeacher() {
        //Input id:
        String id;
        do {
            try {
                System.out.println("Nhập mã giảng viên: ");
                id = scanner.nextLine();
                if (!checkIdTeacherFormat(id) || id.trim().isEmpty()) {
                    throw new RuntimeException("Mã giảng viên sai định dạng");
                }
                if (!checkIdDuplicate(id)) {
                    throw new DuplicateDataException();
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Mã giảng viên phải theo định dạng: \n" +
                        "Ký tự T (teacher) và theo sau là số có 3 chữ số. Nhập lại");
            } catch (DuplicateDataException e) {
                System.out.println("Id đã tồn tại. Nhập lại");
            }
        } while (true);

        //Input name:
        String name;
        do {
            try {
                System.out.println("Nhập tên giảng viên: ");
                name = scanner.nextLine();
                if (name.length() < 3 || name.length() > 100) {
                    System.out.println("Độ dài chuỗi tên phải lớn hơn 3 ký tự và nhỏ 100 ký tự");
                    continue;
                }
                if (name.trim().isEmpty()) {
                    throw new RuntimeException("Không được để trống");
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Không được để trống");
            }
        } while (true);

        //Input date:
        String birthdate;
        do {
            try {
                System.out.println("Nhập ngày sinh của giảng viên: ");
                birthdate = scanner.nextLine();
                if (!checkDateFormat(birthdate) || birthdate.trim().isEmpty()) {
                    throw new RuntimeException("Nhập sai định dạng ngày");
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Ngày phải theo định dạng dd/mm/yyyy. Vui lòng nhập lại");
            }
        } while (true);

        //Input gender:
        int genderOption;
        boolean gender;
        do {
            try {
                System.out.println("Nhập giới tính của giảng viên: 1. Nam/ 2. Nữ");
                try {
                    genderOption = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Nhập sai định dạng số");
                    continue;
                }
                if (genderOption == 1) {
                    gender = true;
                } else if (genderOption == 2) {
                    gender = false;
                } else {
                    throw new GenderOptionException();
                }
                break;
            } catch (GenderOptionException genderOptionException) {
                System.out.println("Chỉ được nhập số 1 hoặc số 2. Nhập lại: ");
            }
        } while (true);

        //Input subject:
        String subject;
        do {
            try {
                System.out.println("Nhập chuyên môn của giảng viên: ");
                subject = scanner.nextLine();
                if (subject.trim().isEmpty()) {
                    throw new RuntimeException("Không được để trống");
                }
                break;
            } catch (RuntimeException runtimeException) {
                System.out.println("Không được để trống");
            }
        } while (true);

        //Creat new teacher:
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
        //Input id to delete:
        String id;
        do {
            try {
                System.out.println("Nhập mã sinh viên/giảng viên muốn xoá: ");
                id = scanner.nextLine();
                if (!checkIdStudentFormat(id) && !checkIdTeacherFormat(id)) {
                    throw new RuntimeException("Error");
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Nhập sai định dạng id (S/T và số có ba chữ số). Nhập lại");
            }
        } while (true);

        if (!checkIdDuplicate(id)) {
            System.out.println("Bạn có muốn xoá sinh viên/giảng viên có id " + id + ". Vui lòng chọn số: ");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int option;
            do {
                try {
                    option = Integer.parseInt(scanner.nextLine());
                    if (option == 1) {
                        Person person = studentManagementRepository.getPersonById(id);
                        studentManagementRepository.deletePerson(person);
                        System.out.println("Bạn đã xoá thành công id " + id);
                    } else if (option == 2) {
                        System.out.println("Bạn đã chọn không xóa");
                    } else {
                        throw new GenderOptionException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng số. Nhập lại");
                } catch (GenderOptionException e) {
                    System.out.println("Chỉ được nhập 1 hoặc 2");
                }
            } while (true);
        } else {
            System.out.println("ID muốn xoá không tồn tại trong danh sách hiện có");
        }
    }

    @Override
    public boolean checkDateFormat(String date) {
        String pattern = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(date);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkClassNameFormat(String className) {
        String pattern = "^[CA]\\d{2}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(className);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIdDuplicate(String id) {
        List<Person> personList = ReadWriteFileCsv.readFileCsv();
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIdStudentFormat(String id) {
        String pattern = "^S\\d{3}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(id);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIdTeacherFormat(String id) {
        String pattern = "^T\\d{3}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(id);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
