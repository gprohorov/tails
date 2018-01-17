package pro.dekanat.DAO.interfaces;

import org.springframework.stereotype.Component;
import pro.dekanat.model.Group;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
@Component
public interface IGroupDAO {

    public void createStudent(Group Group);
    public Group read(int groupId) throws SQLException;
    public  void update(Group group);
    public  void delete(int groupId);
    public List<Group> getAll() throws SQLException;



}
