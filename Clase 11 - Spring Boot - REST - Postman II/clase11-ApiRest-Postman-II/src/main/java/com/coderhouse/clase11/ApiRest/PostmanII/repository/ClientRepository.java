package com.coderhouse.clase11.ApiRest.PostmanII.repository;

import com.coderhouse.clase11.ApiRest.PostmanII.model.Client;
import com.coderhouse.clase11.ApiRest.PostmanII.model.InvoiceDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    //Custom query by method name
    List<Client> findByNameLike(String name);

    //Custom query by custom JPQL query.
    //Atentos con Client, así se llama la entidad en nuestro programa.
    @Query("SELECT a FROM Client a WHERE name = :nombre ORDER BY lastname ASC")
    List<Client> getByNameOrderedByLastnameJPQL(@Param("nombre") String name);

    //Si no se especifica el parámetro nativeQuery, por default se utiliza JPQL.
    //Como estamos haciendo nativeQuery, debemos llamar al nombre de la tabla tal cual está en la db
    @Query(value = "SELECT * FROM client a WHERE name = ?1 ORDER BY lastname ASC", nativeQuery = true)
    List<Client> getByNameOrderedByLastnameNativeQuery(String name);

}
