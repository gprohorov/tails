package pro.dekanat.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.dekanat.DAO.impls.student.StudentDAOFakeImpl;
import pro.dekanat.model.Student;
import pro.dekanat.service.interfaces.IStudentService;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
@Service
public class StudentServiceImpl implements IStudentService {
/*
    @Autowired
    StudentDAOJDBCImpl studentDAO;
*/

   @Autowired
   StudentDAOFakeImpl studentDAO;

    @Override
    public void createStudent(Student student) {

    }

    @Override
    public Student read(int studentId) {
        return
                studentDAO.read(studentId);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int studentId) {

        studentDAO.delete(studentId);

    }

    @Override
    public List<Student> getAll() throws SQLException {
        return studentDAO.getAll();
    }
}
