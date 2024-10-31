package co.com.kinsoft.r2dbc.dao.license;

import co.com.kinsoft.model.license.License;
import co.com.kinsoft.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LicenseRepositoryAdapter
        extends ReactiveAdapterOperations<License, LicenseDAO, Long, LicenseDAORepository> {
    public LicenseRepositoryAdapter(LicenseDAORepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, License.class));
    }
}
