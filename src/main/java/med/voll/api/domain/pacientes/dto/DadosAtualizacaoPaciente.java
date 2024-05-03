package med.voll.api.domain.pacientes.dto;

import jakarta.validation.Valid;
import med.voll.api.domain.endereco.dto.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosEndereco endereco
) {
}
