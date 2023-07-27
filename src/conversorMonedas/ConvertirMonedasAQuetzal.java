package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAQuetzal {
	public void ConvertirDolaresAQuetzal(double valor) {
		double monedaDolar = valor * 7.85;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " QUETZALES ");
	}
	
	public void ConvertirEurosAQuetzal(double valor) {
		double monedaEuro = valor * 8.63;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " QUETZALES ");
	}
	
	public void ConvertirLibrasAQuetzal(double valor) {
		double monedaLibra = valor * 10.10;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " QUETZALES ");
	}
	
	public void ConvertirYenAQuetzal(double valor) {
		double monedaYen = valor * 0.056;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " QUETZALES ");
	}
	
	public void ConvertirWonAQuetzal(double valor) {
		double monedaWon = valor * 0.0061;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " QUETZALES ");
	}
}