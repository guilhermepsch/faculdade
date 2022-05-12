public class Funcionario
{
    
private String nome;
private float horas;
private double salario;
private int depend;

public String getNome()
{
    return this.nome;
}

public float getHoras()
{
    return this.horas;
}

public double getSalario()
{
    return this.salario;
}

public int getDepend()
{
    return this.depend;
}

public boolean setNome(String nome)
{
    if (!nome.isBlank()){
        this.nome = nome;
        return true;
    }
    return false;
}

public boolean setHoras(float horas)
{
    if (horas > 0 && horas <= 360){
        this.horas = horas;
        return true;
    }
    return false;
}
 
public boolean setSalario(double salario)
{
    if (salario > 0){
        this.salario = salario;
        return true;
    }
    return false;
}

public boolean setDepend(int depend)
{
    if (depend > 0){
        this.depend = depend;
        return true;
    }
    return false;
}   

public double getSalarioBru()
{
    return this.horas * this.salario + (50 * this.depend);
}  

public double getDescontoInss()
{
    if (this.getSalarioBru() <= 1000){
        return this.getSalarioBru()*0.085;
    }
    return this.getSalarioBru()*0.09;
}

public double getDescontoIr()
{
    if (this.getSalarioBru() <= 500){
        return 0;
    } else if (this.getSalarioBru() > 500 && this.getSalarioBru() <= 100){
        return this.getSalarioBru()*0.05; 
    }
    return this.getSalarioBru()*0.07;
}

public double getSalarioLiq()
{
    return this.getSalarioBru() - (this.getDescontoIr() + this.getDescontoInss());
}
}