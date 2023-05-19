package com.coderhouse.Relationships.model;

import com.coderhouse.Relationships.entities.BookDTO;
import com.coderhouse.Relationships.entities.Member;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    //Como el acceso es lazy (sólo cuando se lo solicite)
    //tenemos que generar una query específica para el Join, en formato JPQL.
    //También hay que generar un DTO para que mappe correctamente las propiedades que queremos, porque sino genera una
    //tupla que es difícil de acceder. En cambio el DTO lo tenemos excelentemente definido.
    @Query("Select new com.coderhouse.Relationships.entities.BookDTO(" +
            "b.id, " +
            "b.description, " +
            "m.name, " +
            "m.lastname)" +
            " FROM Member m JOIN m.books b WHERE m.id = ?1")
    List<BookDTO> getBookByMemberId(int id);
}
