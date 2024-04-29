package med.voll.api.DAO.medicos;

import med.voll.api.entities.Medico;
import med.voll.api.entities.enums.Especialidade;

public record DadosListagemMedico (Long id, String nome, String email, String crm, Especialidade especialidade){

    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
