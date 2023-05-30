package additional_exercise.service.interface_;

public interface IStudentManagementService {
    void addStudentTeacher();
    void addStudent();
    void addTeacher();
    void displayAll();
    void deleteStudentTeacher();
    boolean checkDateFormat(String date);
    boolean checkClassNameFormat(String className);
    boolean checkIdDuplicate(String id);
    boolean checkIdStudentFormat(String id);
    boolean checkIdTeacherFormat(String id);
}
