package org.example.repository;

import org.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Всё! Spring сам создаёт методы:
    // findAll()      — получить всех
    // findById(id)   — найти по ID
    // save(student)  — добавить/обновить
    // deleteById(id) — удалить
    // existsById(id) — проверить существование
}