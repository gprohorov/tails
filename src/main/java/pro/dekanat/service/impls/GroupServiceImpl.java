package pro.dekanat.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.dekanat.DAO.impls.group.GroupDAOJDBCImpl;
import pro.dekanat.model.Group;
import pro.dekanat.service.interfaces.IGroupService;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by george on 1/13/18.
 */
@Service
public class GroupServiceImpl implements IGroupService {


    @Autowired
    GroupDAOJDBCImpl groupDAO;
/*

    @Autowired
    GroupDAOJDBCImpl groupDAO;
*/

    @Override
    public void createGroup(Group group) {

    }

    @Override
    public Group read(int groupId) throws SQLException {
        return groupDAO.read(groupId);
    }

    @Override
    public void update(Group group) {

    }

    @Override
    public void delete(int GroupId) {

    }

    @Override
    public List<Group> getAll() throws SQLException {
        return groupDAO.getAll();
    }
}
