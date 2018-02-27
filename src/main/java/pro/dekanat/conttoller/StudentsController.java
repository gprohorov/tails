package pro.dekanat.conttoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.dekanat.model.Student;
import pro.dekanat.service.impls.StudentServiceImpl;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
@RestController
public class StudentsController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/api/students")
    public List<Student> getAllStudents() throws SQLException {
        return studentService.getAll();
    }
}