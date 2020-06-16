package test.test.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.test.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
