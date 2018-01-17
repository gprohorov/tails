package pro.dekanat.service.interfaces;

import pro.dekanat.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
public interface IStudentService {
    public void createStudent(Student student);
    public Student read(int studentId);
    public  void update(Student student);
    public  void delete(int studentId);
    public List<Student> getAll() throws SQLException;
}
