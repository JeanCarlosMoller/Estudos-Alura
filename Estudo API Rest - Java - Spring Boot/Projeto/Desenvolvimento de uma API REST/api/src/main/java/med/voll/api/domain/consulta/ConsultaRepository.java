package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    Boolean existsByPacienteIdAndDataBetween(Long idPaciente, LocalDateTime priemiroHorario, LocalDateTime ultimoHorario);

    Boolean existsByMedicoIdAndData(Long aLong, LocalDateTime data);
}
