package pro.dekanat.DAO.interfaces;

import org.springframework.stereotype.Component;
import pro.dekanat.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
@Component
public interface IStudentDAO {

    public void createStudent(Student student);
    public Student read(int studentId);
    public  void update(Student student);
    public  Student delete(int studentId);
    public List<Student> getAll() throws SQLException;



}
