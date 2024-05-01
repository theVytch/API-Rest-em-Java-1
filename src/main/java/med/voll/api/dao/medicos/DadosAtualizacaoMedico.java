package med.voll.api.dao.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.dao.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
