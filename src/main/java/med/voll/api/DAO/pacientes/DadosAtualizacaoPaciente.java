package med.voll.api.DAO.pacientes;

import jakarta.validation.Valid;
import med.voll.api.DAO.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosEndereco endereco
) {
}
