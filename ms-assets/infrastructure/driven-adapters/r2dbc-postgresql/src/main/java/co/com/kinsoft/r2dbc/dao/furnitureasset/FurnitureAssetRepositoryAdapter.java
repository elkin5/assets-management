package co.com.kinsoft.r2dbc.dao.furnitureasset;

import co.com.kinsoft.model.furnitureasset.FurnitureAsset;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class FurnitureAssetRepositoryAdapter
        extends ReactiveAdapterOperations<FurnitureAsset, FurnitureAssetDAO, Long, FurnitureAssetDAORepository> {
    public FurnitureAssetRepositoryAdapter(FurnitureAssetDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, FurnitureAsset.class));
    }
}
