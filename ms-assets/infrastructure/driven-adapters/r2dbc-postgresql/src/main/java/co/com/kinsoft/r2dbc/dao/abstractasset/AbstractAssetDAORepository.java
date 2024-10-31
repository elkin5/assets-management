package co.com.kinsoft.r2dbc.dao.abstractasset;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AbstractAssetDAORepository
        extends ReactiveCrudRepository<AbstractAssetDAO, Long>, ReactiveQueryByExampleExecutor<AbstractAssetDAO> {
}
