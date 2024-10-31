package co.com.kinsoft.r2dbc.dao;

import co.com.kinsoft.model.abstractasset.AbstractAsset;
import co.com.kinsoft.model.asset.Asset;
import co.com.kinsoft.model.asset.AssetRequest;
import co.com.kinsoft.model.asset.gateways.AssetRepository;
import co.com.kinsoft.model.computer.Computer;
import co.com.kinsoft.model.fixed.Fixed;
import co.com.kinsoft.model.furnitureasset.FurnitureAsset;
import co.com.kinsoft.model.technologyasset.TechnologyAsset;
import co.com.kinsoft.r2dbc.dao.abstractasset.AbstractAssetRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.asset.AssetRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.computer.ComputerRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.fixed.FixedRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.furnitureasset.FurnitureAssetRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.license.LicenseRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.maintenance.MaintenanceRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.monitor.MonitorRepositoryAdapter;
import co.com.kinsoft.r2dbc.dao.technologyasset.TechnologyAssetRepositoryAdapter;
import co.com.kinsoft.r2dbc.util.LocalDateDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Repository
@RequiredArgsConstructor
public class AssetPrincipalRepositoryAdapter implements AssetRepository {
    private final AbstractAssetRepositoryAdapter abstractAssetRepositoryAdapter;
    private final AssetRepositoryAdapter assetRepositoryAdapter;
    private final ComputerRepositoryAdapter computerRepositoryAdapter;
    private final FixedRepositoryAdapter fixedRepositoryAdapter;
    private final FurnitureAssetRepositoryAdapter furnitureAssetRepositoryAdapter;
    private final LicenseRepositoryAdapter licenseRepositoryAdapter;
    private final MaintenanceRepositoryAdapter maintenanceRepositoryAdapter;
    private final MonitorRepositoryAdapter monitorRepositoryAdapter;
    private final TechnologyAssetRepositoryAdapter technologyAssetRepositoryAdapter;

    @Override
    public Mono<AssetRequest<?>> saveAsset(AssetRequest<?> assetRequest) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                .create();

        if (assetRequest.getType().equals("abstracto")) {
            Asset asset = gson.fromJson(gson.toJson(assetRequest.getAsset()), Asset.class);
            AbstractAsset abstractAsset = gson.fromJson(gson.toJson(assetRequest.getAsset()), AbstractAsset.class);
            return assetRepositoryAdapter.save(asset)
                    .flatMap(newAsset -> {
                        abstractAsset.setAssetId(newAsset.getAssetId());
                        return abstractAssetRepositoryAdapter.save(abstractAsset)
                                .map(newAbstractAsset -> new AssetRequest<>("abstracto", newAbstractAsset));
                    });
        }

        if (assetRequest.getType().equals("computador")) {
            Asset asset = gson.fromJson(gson.toJson(assetRequest.getAsset()), Asset.class);
            TechnologyAsset technologyAsset = gson.fromJson(gson.toJson(assetRequest.getAsset()), TechnologyAsset.class);
            Computer computer = gson.fromJson(gson.toJson(assetRequest.getAsset()), Computer.class);

            return assetRepositoryAdapter.save(asset)
                    .flatMap(newAsset -> {
                        technologyAsset.setAssetIdReference(newAsset.getAssetId());
                        return technologyAssetRepositoryAdapter.save(technologyAsset);
                    })
                    .flatMap(newTechnologyAsset -> {
                        computer.setTechnologyAssetIdReference(newTechnologyAsset.getTechnologyAssetId());
                        return computerRepositoryAdapter.save(computer)
                                .map(newComputer -> new AssetRequest<>("computador", newComputer));
                    });
        }

        if (assetRequest.getType().equals("tecnologico")) {
            Asset asset = gson.fromJson(gson.toJson(assetRequest.getAsset()), Asset.class);
            TechnologyAsset technologyAsset = gson.fromJson(gson.toJson(assetRequest.getAsset()), TechnologyAsset.class);

            return assetRepositoryAdapter.save(asset)
                    .flatMap(newAsset -> {
                        technologyAsset.setAssetId(newAsset.getAssetId());
                        return technologyAssetRepositoryAdapter.save(technologyAsset);
                    })
                    .map(newComputer -> new AssetRequest<>("tecnologico", newComputer));
        }

        if (assetRequest.getType().equals("fijo")) {
            Asset asset = gson.fromJson(gson.toJson(assetRequest.getAsset()), Asset.class);
            FurnitureAsset furnitureAsset = gson.fromJson(gson.toJson(assetRequest.getAsset()), FurnitureAsset.class);
            Fixed fixed = gson.fromJson(gson.toJson(assetRequest.getAsset()), Fixed.class);

            return assetRepositoryAdapter.save(asset)
                    .flatMap(newAsset -> {
                        furnitureAsset.setAssetId(newAsset.getAssetId());
                        return furnitureAssetRepositoryAdapter.save(furnitureAsset);
                    })
                    .flatMap(furnitureAsset1 -> {
                        fixed.setFurnitureAssetId(furnitureAsset1.getFurnitureAssetId());
                        return fixedRepositoryAdapter.save(fixed)
                                .map(newComputer -> new AssetRequest<>("fijo", newComputer));
                    });
        }


        return null;
    }
}
