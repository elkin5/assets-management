package co.com.kinsoft.r2dbc.dao.furnitureasset;

import co.com.kinsoft.r2dbc.dao.abstractasset.AbstractAssetDAO;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface FurnitureAssetDAORepository
        extends ReactiveCrudRepository<FurnitureAssetDAO, Long>, ReactiveQueryByExampleExecutor<FurnitureAssetDAO> {
}
