package crud;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import pojo.Person;
 
import org.springframework.stereotype.Repository;
 
@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
 
    public List<Person> findByFullNameLike(String name);
 
    public List<Person> findByDateOfBirthGreaterThan(Date date);
 
}