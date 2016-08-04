package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.sonidos.Audios;
import vistas.sonidos.Sonidos;
import vistas.paneles.PanelCaracteristicas;
import modelo.PartidaObservable;
import modelo.caracteristicas.*;

public class ControladorBotonBuscar implements ActionListener{
	private PartidaObservable partida;
	private PanelCaracteristicas panel;
	private Sonidos sonidos;
	
	public ControladorBotonBuscar(PartidaObservable partida,PanelCaracteristicas panel){
		this.partida = partida;
		this.panel = panel;
		this.sonidos = Sonidos.ObtenerSonidos();;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Sexo unSexo = Sexo.fromString(panel.obtenerSexoSeleccionado());
		Hobby unHobby = Hobby.fromString(panel.obtenerHobbySeleccionado());
		Cabello unCabello = Cabello.fromString(panel.obtenerCabelloSeleccionado());
		Senia unaSenia = Senia.fromString(panel.obtenerSeniaSeleccionado());
		Vehiculo unVehiculo = Vehiculo.fromString(panel.obtenerVehiculoSeleccionado());
		partida.filtrarLadron(unSexo, unHobby, unCabello, unaSenia, unVehiculo);
		sonidos.reproducirSonido(Audios.FILTRAR);
	}

}
