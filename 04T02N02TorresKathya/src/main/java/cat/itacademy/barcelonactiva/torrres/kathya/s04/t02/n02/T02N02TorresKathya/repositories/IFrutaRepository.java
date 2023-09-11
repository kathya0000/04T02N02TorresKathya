package cat.itacademy.barcelonactiva.torrres.kathya.s04.t02.n02.T02N02TorresKathya.repositories;

import cat.itacademy.barcelonactiva.torrres.kathya.s04.t02.n02.T02N02TorresKathya.models.FrutaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFrutaRepository extends JpaRepository<FrutaModel, Long> {

}
