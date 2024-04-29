package med.voll.api.DAO.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.DAO.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
