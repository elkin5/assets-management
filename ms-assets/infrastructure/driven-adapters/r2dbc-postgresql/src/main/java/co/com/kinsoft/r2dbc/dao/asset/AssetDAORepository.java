package co.com.kinsoft.r2dbc.dao.asset;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AssetDAORepository
        extends ReactiveCrudRepository<AssetDAO, Long>, ReactiveQueryByExampleExecutor<AssetDAO> {
}
