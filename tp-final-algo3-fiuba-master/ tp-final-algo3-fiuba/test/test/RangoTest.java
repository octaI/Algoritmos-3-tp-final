package test;

import static org.junit.Assert.*;
import modelo.rangos.Rango;
import modelo.rangos.RangoDetective;
import modelo.rangos.RangoInvestigador;
import modelo.rangos.RangoNovato;
import modelo.rangos.RangoSargento;

import org.junit.Test;

public class RangoTest {
	private Rango UnRango;
	private int CantidadDeKilometros = 2000;
	
	//Velocidad En km/h.
	private int VelocidadNovato = 900;
	private int VelocidadDetective = 1100;
	private int VelocidadInvestigador = 1300;
	private int VelocidadSargento = 1500;
	
	@Test
	public void CostoDeViajeRangoNovatoEsCorrecto() {
		UnRango = new RangoNovato();
		int HorasDeViaje = CantidadDeKilometros/VelocidadNovato;
		assertEquals(UnRango.costoDeViaje(CantidadDeKilometros),HorasDeViaje);
		
	}
	@Test
	public void CostoDeViajeRangoDetectiveEsCorrecto() {
		UnRango = new RangoDetective();
		int HorasDeViaje = CantidadDeKilometros/VelocidadDetective;
		assertEquals(UnRango.costoDeViaje(CantidadDeKilometros),HorasDeViaje);
		
	}
	@Test
	public void CostoDeViajeRangoInvestigadorEsCorrecto() {
		UnRango = new RangoInvestigador();
		int HorasDeViaje = CantidadDeKilometros/VelocidadInvestigador;
		assertEquals(UnRango.costoDeViaje(CantidadDeKilometros),HorasDeViaje);
		
	}
	@Test
	public void CostoDeViajeRangoSargentoEsCorrecto() {
		UnRango = new RangoSargento();
		int HorasDeViaje = CantidadDeKilometros/VelocidadSargento;
		assertEquals(UnRango.costoDeViaje(CantidadDeKilometros),HorasDeViaje);
		
	}

}
