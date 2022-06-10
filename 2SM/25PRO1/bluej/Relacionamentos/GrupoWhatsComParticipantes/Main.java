public class Main
{
    
    public static void main (String[] args)
    {

        ParticipanteZap participante1 = new ParticipanteZap("Nome 1", 111111111);
        ParticipanteZap participante2 = new ParticipanteZap("Nome 2", 222222222);
        ParticipanteZap participante3 = new ParticipanteZap("Nome 3", 333333333);
        ParticipanteZap participante4 = new ParticipanteZap("Nome 4", 444444444);
        ParticipanteZap participante5 = new ParticipanteZap("Nome 5", 555555555);
        
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