package jmat_f5bosco.mag_ditail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import jmat_f5bosco.mag_ditail.models.Magiccrazy;

@Repository
public interface MagiccrazyRepository extends MongoRepository<Magiccrazy, String> {
}
