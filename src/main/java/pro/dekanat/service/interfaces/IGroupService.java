package pro.dekanat.service.interfaces;

import pro.dekanat.model.Group;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
public interface IGroupService {
    public void createGroup(Group group);
    public Group read(int groupId) throws SQLException;
    public  void update(Group group);
    public  void delete(int GroupId);
    public List<Group> getAll() throws SQLException;
}
