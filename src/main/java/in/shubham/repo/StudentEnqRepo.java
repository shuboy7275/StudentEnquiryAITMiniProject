package in.shubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubham.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}
