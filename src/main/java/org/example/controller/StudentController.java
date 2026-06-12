package org.example.controller;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository repository;

    // Spring сам "вкладывает" сюда Repository
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    // 📋 GET все студенты  →  GET /api/students
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // 🔍 GET один по ID  →  GET /api/students/5
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ➕ POST добавить  →  POST /api/students
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    // ✏️ PUT обновить  →  PUT /api/students/5
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Integer id,
            @RequestBody Student updatedStudent) {

        return repository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setAge(updatedStudent.getAge());
                    student.setGrade(updatedStudent.getGrade());
                    return ResponseEntity.ok(repository.save(student));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 🗑 DELETE удалить  →  DELETE /api/students/5
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}