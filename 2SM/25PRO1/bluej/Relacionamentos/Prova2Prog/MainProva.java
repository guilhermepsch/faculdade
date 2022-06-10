// Guilherme Pereira Schneidt
public class MainProva
{
    
    public static void main (String[] args)
    {
        
        Palestra palestra1 = new Palestra("Aplicações de I.A", "Auditório da UDESC", 150, "dia 01/06 das 19h as 20h");
        Palestra palestra2 = new Palestra("Internet of Things", "Eliseu Guilherme", 200, "dia 03/06 das 16h as 17h");
        
        Participante participante1 = new Participante("Pedro", 18, "Ibirama");
        Participante participante2 = new Participante("Maria", 18, "Ibirama");
        Participante participante3 = new Participante("João", 20, "Rio do Sul");
        Participante participante4 = new Participante("Cleiton", 19, "Pouso Redondo");
        
        palestra1.addParticipante(participante1);
        palestra1.addParticipante(participante2);
        palestra1.addParticipante(participante3);
        palestra1.addParticipante(participante4);
        
        System.out.println("------- IMPRESSÃO COMPLETA -------");      
        palestra1.imprimePalestra();
        System.out.println("------- IMPRESSÃO POR IDADE -------");    
        palestra1.imprimeParticipantes(18);
        System.out.println("------- IMPRESSÃO POR CIDADE -------");    
        palestra1.imprimeParticipantes("Rio do Sul");
        
        palestra1.removeParticipante("Pedro");

        System.out.println("------- IMPRESSÃO PÓS REMOÇÃO -------");
        palestra1.imprimePalestra();
        
        System.out.println("------- IMPRESSÃO DE QUANTIDADES -------");
        palestra1.imprimeQuantidadePorCidade();
        
        palestra1.addParticipante(participante1);
        
        System.out.println("------- IMPRESSÃO DE QUANTIDADES -------");
        palestra1.imprimeQuantidadePorCidade();
        
        
    }
    
}