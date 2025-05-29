package pe.edu.upc.examenfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.examenfinal.entities.Huerto;

import java.util.List;

@Repository
public interface IHuertoRepository extends JpaRepository<Huerto, Integer> {

    @Query(value = "select u.username, count(*) from huerto h join users u\n" +
            " on h.id = u.id\n" +
            " group by u.username", nativeQuery = true)
    public List<String[]> CantHuertosPorUsuario();


    @Query(value = "select u.username, sum(h.fhzg_extension) from huerto h join users u\n" +
            " on h.id = u.id\n" +
            " group by u.username", nativeQuery = true)
    public List<String[]> TotalHectareaXuser();
}
