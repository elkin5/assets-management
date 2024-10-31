package co.com.kinsoft.r2dbc.dao.abstractasset;

import co.com.kinsoft.model.abstractasset.AbstractAsset;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractAssetRepositoryAdapter
        extends ReactiveAdapterOperations<AbstractAsset, AbstractAssetDAO, Long, AbstractAssetDAORepository> {
    public AbstractAssetRepositoryAdapter(AbstractAssetDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, AbstractAsset.class));
    }
}
