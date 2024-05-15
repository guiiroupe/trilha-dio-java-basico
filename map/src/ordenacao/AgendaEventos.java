package ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;

public class AgendaEventos {
  private Map<LocalDate, Evento> agendaEventosMap;

  public AgendaEventos() {
    this.agendaEventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao){
    Evento evento = new Evento(nome, atracao);
    agendaEventosMap.put(data, evento);
  }

  public void exibirAgenda(){
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento(){
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
    for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();
        System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
        break;
      }
    }

  }

  public static void main(String[] args) {
    AgendaEventos minhaAgenda = new AgendaEventos();

    minhaAgenda.adicionarEvento(LocalDate.of(2024, 6, 3), "evento1", "atracao1");
    minhaAgenda.adicionarEvento(LocalDate.of(2022, 3, 3), "evento2", "atracao2");
    minhaAgenda.adicionarEvento(LocalDate.of(2022, 2, 3), "evento3", "atracao3");

    minhaAgenda.exibirAgenda();

    minhaAgenda.obterProximoEvento();

  }

  
}
