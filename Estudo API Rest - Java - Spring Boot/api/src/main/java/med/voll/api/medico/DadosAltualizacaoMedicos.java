package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAltualizacaoMedicos(

        @NotNull
        Long id,

        String nome,
        String telefone,
        DadosEndereco endereco) {
}
