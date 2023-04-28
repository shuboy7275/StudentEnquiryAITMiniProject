package in.shubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubham.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
