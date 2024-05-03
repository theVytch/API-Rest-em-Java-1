package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.consulta.dto.DadosAgendamentoConsulta;
import med.voll.api.infra.exception.ValidacaoException;
import med.voll.api.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraConsulta implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsultaNoMesmoHorario = consultaRepository.existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(dados.idMedico(), dados.data());
        if(medicoPossuiOutraConsultaNoMesmoHorario){
            throw new ValidacaoException("Médico já possui outra consulta agendada nesse mesmo horário");
        }
    }
}
