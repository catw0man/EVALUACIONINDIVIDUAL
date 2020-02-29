
public class television extends Electrodomestico {
//variables
private static final int resolucionDEFECT = 20;
int resolucion;
boolean SintotizadorTDT;

public static int getResoluciondefect() {
	return resolucionDEFECT;
}

public static boolean isSintonizadortdtdefect() {
	return SintonizadorTDTDEFECT;
}

private static final boolean SintonizadorTDTDEFECT = false;

public boolean isSintonizadorTDTDEFECT() {
	return SintonizadorTDTDEFECT;
}

public int getResolucionDEFECT() {
	return resolucionDEFECT;
}


public int getResolucion() {
	return resolucion;
}

public void setResolucion(int resolucion) {
	this.resolucion = resolucion;
}

public boolean getSintotizadorTDT() {
	return SintotizadorTDT;
}

public void setSintotizadorTDT(boolean sintotizadorTDT) {
	SintotizadorTDT = sintotizadorTDT;
}
public television() {
	super();
	
}
public television(int peso, String color, String consumoenergético,double preciototal) {
	super(peso, color, consumoenergético, preciototal);
	
}
public television(int peso,double preciototal) {
	super(peso, preciototal);

}
//modificador de valor
public void preciototal(double precio) {
	
	
	if (resolucion> 40) {
		
		preciototal = preciototal()+preciototala + (preciototal*0.3);
	}
	
	
	else if (getSintotizadorTDT() == true) {
		
		preciototal = preciototal()+preciototala + (preciototal*0.5);
	}
	
	else if(getSintotizadorTDT() == true && resolucion> 40) {
		
		preciototal =preciototal()+ preciototala+(preciototal*0.5)+ (preciototal*0.3);
	}
	
	else preciototal = PRECIO_BASE_DEFECT;
}



}
