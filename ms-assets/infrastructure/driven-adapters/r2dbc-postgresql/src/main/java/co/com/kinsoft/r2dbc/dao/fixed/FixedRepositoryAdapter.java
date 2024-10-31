package co.com.kinsoft.r2dbc.dao.fixed;

import co.com.kinsoft.model.fixed.Fixed;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class FixedRepositoryAdapter
        extends ReactiveAdapterOperations<Fixed, FixedDAO, Long, FixedDAORepository> {
    public FixedRepositoryAdapter(FixedDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Fixed.class));
    }
}
