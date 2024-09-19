package co.edu.umanizales.exercise_students.service;
import co.edu.umanizales.exercise_students.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import lombok.Data;

@Data
@Service

public class StudentService {
    private Student[] students;
    @PostConstruct
    public void init(){
        students = new Student[50];
    }
}
