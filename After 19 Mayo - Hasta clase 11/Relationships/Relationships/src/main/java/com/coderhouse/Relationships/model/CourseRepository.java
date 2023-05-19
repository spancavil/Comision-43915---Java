package com.coderhouse.Relationships.model;

import com.coderhouse.Relationships.entities.Course;
import com.coderhouse.Relationships.entities.Member;
import com.coderhouse.Relationships.entities.MemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    //Realizar una custom query para obtener un curso ṕor id y todos los estudiantes
    @Query("SELECT new com.coderhouse.Relationships.entities.MemberDTO(" +
            "m.id, " +
            "m.name, " +
            "m.lastname" +
            ") FROM Course c JOIN c.members m WHERE c.id = ?1")
    List<MemberDTO> getMembersofCourseByCourseId (int id);
}
