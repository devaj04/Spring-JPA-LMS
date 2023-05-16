package com.trigyn.jpalms.repository;

import com.trigyn.jpalms.entity.BookStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookStudentRepository extends JpaRepository<BookStudent, Long> {
    List<BookStudent> findStudentByUserName(String userName);
}
