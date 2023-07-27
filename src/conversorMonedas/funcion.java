package conversorMonedas;

import javax.swing.JOptionPane;

public class funcion {

	convertirMoneda monedas = new convertirMoneda();
	ConvertirMonedasAQuetzal quetzales = new ConvertirMonedasAQuetzal();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Quetzales a Dólar", "De Quetzales a Euro", "De Quetzales a Libras","De Quetzales a Yen","De Quetzales a Won Coreano","De Dólar a Quetzales", "De Euro a Quetzales", "De Libras a Quetzales","De Yen a Quetzales","De Won Coreano a Quetzales"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Quetzales a Dólar":
        	monedas.ConvertirQuetzalADolares(Minput);
        	break;
        case "De Quetzales a Euro":
        	monedas.ConvertirQuetzalAEuros(Minput);
        	break;
        case "De Quetzales a Libras":
        	monedas.ConvertirQuetzalALibras(Minput);
        	break;
        case "De Quetzales a Yen":
        	monedas.ConvertirQuetzalAYen(Minput);
        	break;
        case "De Quetzales a Won Coreano":
        	monedas.ConvertirQuetzalAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Quetzales":
        	quetzales.ConvertirDolaresAQuetzal(Minput);
        	break;
        case "De Euro a Quetzales":
        	quetzales.ConvertirEurosAQuetzal(Minput);
        	break;
        case "De Libras a Quetzales":
        	quetzales.ConvertirLibrasAQuetzal(Minput);
        	break;
        case "De Yen a Quetzales":
        	quetzales.ConvertirYenAQuetzal(Minput);
        	break;
        case "De Won Coreano a Quetzales":
            quetzales.ConvertirWonAQuetzal(Minput);
            break;
        }      
    }
        
}