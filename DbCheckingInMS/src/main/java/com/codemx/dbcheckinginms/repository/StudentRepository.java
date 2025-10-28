package com.codemx.dbcheckinginms.repository;

import com.codemx.dbcheckinginms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
