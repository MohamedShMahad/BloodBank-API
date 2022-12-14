package so.edu.uct.BloodBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import so.edu.uct.BloodBank.model.Records;

public interface RecordsRepository extends JpaRepository<Records,Long> {


    @Query(value = "SELECT sum(cc) FROM Records",nativeQuery = true)

    Long findByBloodType();
}
