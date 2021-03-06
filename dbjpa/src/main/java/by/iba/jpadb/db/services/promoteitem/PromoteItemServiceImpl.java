package by.iba.jpadb.db.services.promoteitem;


import by.iba.jpadb.db.dao.PromoteItemDAO;
import by.iba.jpadb.db.entities.promoting.DataSet;
import by.iba.jpadb.db.entities.promoting.Item;
import by.iba.jpadb.db.services.dataset.DataSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromoteItemServiceImpl implements PromoteItemService{

    @Autowired
    private PromoteItemDAO promoteItemDAO;
    @Autowired
    private DataSetService dataSetService;

    @Override
    public Item findById(long id) {
        return promoteItemDAO.findById(id);
    }

    @Override
    public List<Item> findAll() {
        return promoteItemDAO.findAll();
    }

    @Override
    public void addOrUpdate(Item item) {
        promoteItemDAO.save(item);
        for(DataSet dataSet:item.getDataSets())
        {
            dataSet.setItem(item);
            dataSetService.addOrUpdate(dataSet);
        }
    }

    @Override
    public void delete(Item item) {
        promoteItemDAO.delete(item);
    }

    @Override
    public void delete(long id) {
        promoteItemDAO.delete(id);
    }
}
