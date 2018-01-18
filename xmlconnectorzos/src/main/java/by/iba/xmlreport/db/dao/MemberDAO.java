package by.iba.xmlreport.db.dao;

import by.iba.xmlreport.db.entities.promoting.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDAO extends JpaRepository<Member,Long> {
    Member findById(long id);
}
