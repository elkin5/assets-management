package co.com.kinsoft.r2dbc.dao.technologyasset;

import co.com.kinsoft.model.technologyasset.TechnologyAsset;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TechnologyAssetRepositoryAdapter
        extends ReactiveAdapterOperations<TechnologyAsset, TechnologyAssetDAO, Long, TechnologyAssetDAORepository> {
    public TechnologyAssetRepositoryAdapter(TechnologyAssetDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, TechnologyAsset.class));
    }
}
