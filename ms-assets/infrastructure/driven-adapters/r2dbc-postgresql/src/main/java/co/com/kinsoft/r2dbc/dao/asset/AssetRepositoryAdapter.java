package co.com.kinsoft.r2dbc.dao.asset;

import co.com.kinsoft.model.asset.Asset;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AssetRepositoryAdapter extends ReactiveAdapterOperations<Asset, AssetDAO, Long, AssetDAORepository> {
    public AssetRepositoryAdapter(AssetDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Asset.class));
    }
}
