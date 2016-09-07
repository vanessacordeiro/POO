package modelo;

public class Exercicio7 {
	private float quanthoras;
	private float horanormal;
	
	public void setQuantHoras(int quanthoras)
	{
		this.quanthoras = quanthoras;
	}
	public void setHoraNormal(int horanormal)
	{
		this.horanormal = horanormal;
	}
	
	public void printE7()
	{
		float salariobruto = quanthoras * horanormal;
		float horasextra = 0;
		
		if (quanthoras>40)
		{
			horasextra = quanthoras - 40;
		}
		
		salariobruto  = (horasextra * (horanormal/2))+salariobruto;
		
		System.out.println("***********RESULTADO***********\nSalário Bruto é " + salariobruto);
	}
}