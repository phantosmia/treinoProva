package iacit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import iacit.model.Cliente;


@RepositoryRestResource(collectionResourceRel="cliente",path="clientes")
public interface RepositorioCliente extends PagingAndSortingRepository<Cliente, Long>{
List<Cliente> findByNome(@Param("nome")String nome);
@Query("SELECT c.nome FROM Cliente c where c.id=:id")
Cliente findNomeById(@Param("id")Long id);
List<Cliente> findByNomeOrderByNome(@Param("nome")String nome);
}
