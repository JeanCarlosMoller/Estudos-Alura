package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    //Todos métodos que tem na interface JpaRepository estamos herdando aqui;
}
