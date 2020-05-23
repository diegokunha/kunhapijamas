package br.com.kunhapijamas.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kunhapijamas.loja.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
