package uia.com.contabilidad.clientes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;



/**
 * @author amiguel
 * @version 1.0
 
 */
public class GestorClientes {

	private ListaClientes miListaClientes;
	

	public GestorClientes() 
	{
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            //miListaClientes = mapper.readValue(s, ListaClientes.class);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
   		 	miListaClientes = mapper.readValue(new FileInputStream("C:\\Users\\amigu\\git\\UIA-2020-IS\\contabilidadUIA\\cuentasXCobrar.json"), ListaClientes.class );
            
        }
        catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (miListaClientes != null) {
            System.out.println("----- Items List -----");

            for (InfoUIA mi : miListaClientes.getItems()) {
                System.out.println("Type = " + mi.getClass() +  ", id = "+ mi.getId() + ", name = " + mi.getName());
            }
        }
		
	}

	public void finalize() throws Throwable {

	}
	
	public void actualiza(){

	}

	
	public List<String> getLista() 
	{
		List<String> listaStr = new ArrayList<String>();
				
		
		return listaStr;
		
	}

	
}