package com.trigyn.jpalms.repository;

import com.trigyn.jpalms.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryManagementRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findStudentById(Long id);

    void deleteById(Long id);
}
