
public class ejecutable {

	 
	    public static void main(String[] args) {
	  
	        Electrodomestico Electrodomesticos[]=new Electrodomestico[10];
	  //arreglo polimorfico de objetos
	        Electrodomesticos[0]=new lavadora(10, "blanco","E", 100);
	        Electrodomesticos[1]=new lavadora(10,"rojo","U",100);
	        Electrodomesticos[2]=new television(80,"verde", "F",400);
	        Electrodomesticos[3]=new Electrodomestico();
	        Electrodomesticos[4]=new Electrodomestico();
	        Electrodomesticos[5]=new lavadora();
	        Electrodomesticos[6]=new television();
	        Electrodomesticos[7]=new lavadora();
	        Electrodomesticos[8]=new television();
	        Electrodomesticos[9]=new Electrodomestico();
	   
	      //contador de objetos por separado
	        double sumElectrodomesticos=0;
	        int sumatelevisiones=0;
	        int sumalavadoras=0;
	   
	        for(int u=0;u<Electrodomesticos.length;u++){
	   
	            if(Electrodomesticos[u] instanceof Electrodomestico){
	                sumElectrodomesticos+=Electrodomesticos[u].preciototal();
	            }
	            if(Electrodomesticos[u] instanceof lavadora){
	                sumalavadoras+=Electrodomesticos[u].getPreciototal();
	            }
	            if(Electrodomesticos[u] instanceof television){
	                sumatelevisiones+=Electrodomesticos[u].getPreciototal();
	            }
	        }
	   //resultado
	        System.out.println("el total es "+sumElectrodomesticos);
	        System.out.println("La suma del precio de las lavadoras es de "+sumalavadoras);
	        System.out.println("La suma del precio de las televisiones es de "+sumatelevisiones);
	   
	    }
}
