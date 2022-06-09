public class Main
{
    
    public static void main (String[] args)
    {
        
        Deputado dep1 = new Deputado(19231923, "Bolsonaro", 22, "RJ");
        Deputado dep2 = new Deputado(45145233, "Marina", 51, "AC");
        Deputado dep3 = new Deputado(42804324, "Lula", 13, "CE");
        Deputado dep4 = new Deputado(93813291, "Ciro", 12, "GO");
        Deputado dep5 = new Deputado(43872473, "Haddad", 13, "SP");
        
        Comissao com1 = new Comissao("FODA-SE COMISSÃO FODA");
        
        com1.addDeputado(dep1);
        com1.addDeputado(dep2);
        com1.addDeputado(dep3);
        com1.addDeputado(dep4);
        com1.addDeputado(dep5);
        
        com1.imprimirDeputados();
        System.out.println("----- Separador -----");
        com1.imprimirQtdPorPartido();
    }
    
}
