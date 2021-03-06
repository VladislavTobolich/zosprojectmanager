package by.iba.jpadb.db.services.statusitem;

import by.iba.jpadb.db.entities.promoting.PageInfoModel;
import by.iba.jpadb.db.entities.promoting.StatusItem;

import java.util.List;

public interface StatusItemService {
    StatusItem findById(long id);
    StatusItem findByPageInfo(PageInfoModel pageInfoModel);
    List<StatusItem> findAll();
    void addOrUpdate(StatusItem statusItem);
    void delete(StatusItem statusItem);
    void delete(long id);
}
