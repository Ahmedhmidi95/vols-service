package soa.if5.vols.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import soa.if5.vols.entities.Escale;


@RepositoryRestResource
public interface EscaleRepository extends JpaRepository<Escale, Long> {
}