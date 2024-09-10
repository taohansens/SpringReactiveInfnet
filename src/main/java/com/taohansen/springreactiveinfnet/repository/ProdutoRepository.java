package com.taohansen.springreactiveinfnet.repository;

import com.taohansen.springreactiveinfnet.model.Produto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends R2dbcRepository<Produto, Long> {
}