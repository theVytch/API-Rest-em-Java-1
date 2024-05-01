package med.voll.api.dao.pacientes;

import med.voll.api.entities.Endereco;
import med.voll.api.entities.Paciente;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String cpf,
                                        String telefone, Endereco endereco, Boolean ativo) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(),
                paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco(), paciente.getAtivo());
    }

}
