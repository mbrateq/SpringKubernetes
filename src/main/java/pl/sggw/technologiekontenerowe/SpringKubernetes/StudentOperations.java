package pl.sggw.technologiekontenerowe.SpringKubernetes;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name = "STUDENTS", description = "Prosty REST controller do operacji CRUD")
public interface StudentOperations {

    @Operation(summary = "Listowanie Studentów")
    ResponseEntity<List<Student>> getAll();

    @Operation(summary = "Wyszukanie po identyfikatorze")
    ResponseEntity<Student> getStudentById(String id);

    @Operation(summary = "Dodanie nowego studenta")
    ResponseEntity<Student> createStudent(Student student);

    @Operation(summary = "Usunięcie studenta")
    ResponseEntity<String> deleteStudent(String id);
}