package hn.calcular.calcular_junit_app;

public class MetodoCal {
	  public double calcularAreaCirculo(double radio) {
		  
	        if (radio < 0) throw new IllegalArgumentException("te equivocaste el radio no puede ser negativo");
	        
	        
	        return Math.PI * radio * radio;
	       
	    }

	    public double calcularAreaCuadrado(double lado) {
	      if (lado < 0) throw new IllegalArgumentException("te equivocaste el lado no puede ser negativo");
	        
	      return lado * lado;
	    }

	    public double calcularAreaRectangulo(double base, double altura) {
	        
	    	if (base < 0 || altura < 0) throw new IllegalArgumentException("te equivocaste La base y la altura no pueden ser negativas");
	        
	    	return base * altura;
	    }

	    public double calcularAreaTriangulo(double base, double altura) {
	      
	    	if (base < 0 || altura < 0) throw new IllegalArgumentException("te equivocaste La base y la altura no pueden ser negativas");
	        
	    	return (base * altura) / 2;
	    }
}
