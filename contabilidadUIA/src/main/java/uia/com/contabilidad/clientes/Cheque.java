package uia.com.contabilidad.clientes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cheque extends InfoUIA
{
		String fecha = "";
		
		public Cheque()
		{
			super();
		}
		
		
	    public Cheque(int id, String name, String p1) 
		{
	        super(id, name);
	        this.fecha = p1;
	    }

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}	
		
		
	
}