package med.voll.api.dao.pacientes;

import jakarta.validation.Valid;
import med.voll.api.dao.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosEndereco endereco
) {
}
