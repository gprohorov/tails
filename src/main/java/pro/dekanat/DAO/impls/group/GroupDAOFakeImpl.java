package pro.dekanat.DAO.impls.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.dekanat.DAO.interfaces.IGroupDAO;
import pro.dekanat.model.Group;
import pro.dekanat.storage.DataStorage;

import java.util.List;

/**
 * Created by george on 1/13/18.
 */

@Component
public class GroupDAOFakeImpl implements IGroupDAO {
/*

    private static List<Group> list = new ArrayList<>();

    static {
        list.add(new Group(1, "SD", "Software Design", 3));
        list.add(new Group(2, "CS", "Computer System", 3));
        list.add(new Group(3, "MPUIK", "Math Problems and Cybernetics", 3));

    }
*/

    @Autowired
    DataStorage dataStorage;



    @Override
    public void createStudent(Group Group) {

    }

    @Override
    public Group read(int groupId) {
        return dataStorage.getGroups().stream().filter(group -> group.getId() == groupId)
                .findFirst().get();
    }

    @Override
    public void update(Group group) {

    }

    @Override
    public void delete(int groupId) {

    }

    @Override
    public List<Group> getAll() {
        return dataStorage.getGroups();
    }
}
