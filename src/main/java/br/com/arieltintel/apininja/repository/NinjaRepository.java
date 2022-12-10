package br.com.arieltintel.apininja.repository;

import br.com.arieltintel.apininja.entity.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
