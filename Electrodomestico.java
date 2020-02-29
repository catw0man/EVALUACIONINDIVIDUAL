
public class Electrodomestico {

	
// variables por defecto
	protected static final double PRECIO_BASE_DEFECT = 100;
	protected static final String COLOR_DEFECT = "blanco";	
	protected static final String CONSUMO_ENERGETICO_DEFECT = "F";	
	protected static final int PESO_DEFECT =5;
	//variables 
	protected int peso ;	
	protected String color ;	
	protected String consumos;	
	protected String consumoenergético;
	protected double preciototal;
	protected double preciototala = 100;
	
	//constructor por defecto
	public Electrodomestico() {
		
	}
	//constructor con 2 parametros
	public Electrodomestico(int peso,double preciototal) {
		this.peso = peso;
		this.preciototal = preciototal;
	
	}
	//constructor con todas las variables
	public Electrodomestico(int peso, String color, String consumoenergético,double preciototal) {
		this.peso = peso;
		this.color = color;
		this.consumoenergético = consumoenergético;
		this.preciototal= preciototal;
	}

	public String getConsumoenergético() {
		return consumoenergético;
	}

	public void setConsumoenergético(String consumoenergético) {
		this.consumoenergético = consumoenergético;
	}

	public double getPreciototala() {
		return preciototala;
	}

	public void setPreciototala(double preciototala) {
		this.preciototala = preciototala;
	}

	public static double getPrecioBaseDefect() {
		return PRECIO_BASE_DEFECT;
	}

	public static String getColorDefect() {
		return COLOR_DEFECT;
	}

	public static String getConsumoEnergeticoDefect() {
		return CONSUMO_ENERGETICO_DEFECT;
	}

	public static int getPesoDefect() {
		return PESO_DEFECT;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPreciototal() {
		return preciototal;
	}

	public void setPreciototal(double preciototal) {
		this.preciototal = preciototal;
	}

	public String getConsumos() {
		return consumos;
	}
	public void setConsumos(String consumos) {
		this.consumos = consumos;
	}
	public int getPeso() {
		return peso;
	
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	 private void comprobarColor(String color){
		  
		 	String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
	        
		 	boolean elegido=false;
	  
	        for(int i=0;i<colores.length && !elegido;i++){
	              
	            if(colores[i].equals(color)){
	                elegido=true;
	            }     
	        }
	          
	        if(elegido){
	            this.color=color;
	        }else{
	            this.color= COLOR_DEFECT;
	        }
	          
	          
	    }
	
	public void comprobarConsumoEnergetico(String consumoenergético) {
		
		String consumos[] = {"A", "B", "C", "D", "E", "F"};
		
		boolean elegidoC=false;
		  
        for(int j=0;j<consumos.length && !elegidoC;j++){
              
            if(consumos[j].equals(consumoenergético)){
                elegidoC=true;
            }     
        }
          if(elegidoC){
            this.consumos=consumoenergético;
        }else{
            this.consumos= CONSUMO_ENERGETICO_DEFECT;
        }
	}
		//modificador de valor segun letra de consumo
	public void precioporconsumo(double preciototala) {
		
		if (consumoenergético.equals("A")) {
			
			preciototala = 100;
		}
		else if (consumoenergético.equals('B'))	{
			
			preciototala = 80;
		}
			
		else if (consumoenergético.equals('C'))	{
			
			preciototala = 60;	
		}
			
		else if (consumoenergético.equals('D')) {
			
			preciototala = 50;
		}
		
		else if (consumoenergético.equals('E')) {
			
			preciototala = 30;
		}
				
		else if (consumoenergético.equals('F')) {
			
			preciototala = 10;
		}
		
		else {
			preciototala = PRECIO_BASE_DEFECT;
		}
	}
	//modificador de valor segun peso
	public double preciototal() {
	
		
		if (peso < 20) {
			
			preciototal = preciototal+preciototala + 10;
		}
		
		else if (peso> 19 && peso < 50) {
			
			preciototal = preciototal+preciototala + 50;	
		}
		
		else if (peso> 49 &&  peso < 80) {
			
			preciototal =preciototal+preciototala + 80;
		}
		
		else if(peso> 80) {
			
			preciototal =preciototal+preciototala+100;
		}
		
		else preciototal = PRECIO_BASE_DEFECT;
	 return preciototal;
	}
	
	 public String getColor() {
	        return color;
	 }

}