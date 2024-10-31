package co.com.kinsoft.r2dbc.dao.technologyasset;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TechnologyAssetDAORepository
        extends ReactiveCrudRepository<TechnologyAssetDAO, Long>, ReactiveQueryByExampleExecutor<TechnologyAssetDAO> {
}
