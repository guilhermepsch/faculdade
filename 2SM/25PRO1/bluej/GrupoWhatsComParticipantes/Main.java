public class Main
{
    
    public static void main (String[] args)
    {
        
        Participante participante1 = new Participante("Nome 1", 111111111);
        Participante participante2 = new Participante("Nome 2", 222222222);
        Participante participante3 = new Participante("Nome 3", 333333333);
        Participante participante4 = new Participante("Nome 4", 444444444);
        Participante participante5 = new Participante("Nome 5", 555555555);
        
        GrupoWhatsapp grupo1 = new GrupoWhatsapp("Grupo 1", participante1);
        GrupoWhatsapp grupo2 = new GrupoWhatsapp("Grupo 2", participante1);
        
        grupo1.imprimeParticipantes();
        grupo2.imprimeParticipantes();
        
        grupo1.addParticipante(participante2);
        grupo1.addParticipante(participante3);
        grupo2.addParticipante(participante4);
        grupo2.addParticipante(participante5);
        
        grupo1.imprimeParticipantes();
        grupo2.imprimeParticipantes();
        
        grupo1.delParticipante(participante3);
        
        grupo1.imprimeParticipantes();
        
    }
    
}