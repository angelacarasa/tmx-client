package esa.bscs.sps.tmx.client.repository;

import esa.bscs.sps.tmx.client.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
