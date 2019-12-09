package deloof.wouter.thymeleaf_basic.model;

import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student, Integer> {
}
