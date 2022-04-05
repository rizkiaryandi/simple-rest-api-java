package id.ac.uinsgd.student.Pertemuan3.repository;

import id.ac.uinsgd.student.Pertemuan3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Query method
    Optional<Student> findByEmail(String email);
}
