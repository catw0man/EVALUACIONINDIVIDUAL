
public class lavadora extends Electrodomestico {
	//variables
	private static final int CARGA_DEFECT= 5;
	
	private int carga;
	
	public  int getCargadefect() {
		
		return CARGA_DEFECT;
	}
	
	 public int getCarga() {
	        return carga;
	 }

	public lavadora() {
		super();
	}
	//constructores
	public lavadora(int peso, String color, String consumoenergético,double preciototal) {
		super(peso, color, consumoenergético, preciototal);
	}

	public lavadora(int carga,int peso,double preciototal) {
		super(peso, preciototal);
		this.carga = carga;

	}//modificador de valor
	public double preciototal(double precio) {
	
		if (carga>30) {
			preciototal = preciototal()+preciototala + 50;
		}
		else preciototal = preciototala+preciototal();
		return preciototal;
	}
	
	
  
    
}