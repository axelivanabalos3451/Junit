package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

public class TestVeterinaria {

	
	
	
	//en algunos test podria haber comparado directamente los objetos
	//pero lo hice campo por campo para verificar que todo este en orden
	
	
	@Test
	public void queSePuedaInstanciarUnaVeterinariaConNombre() {
		Veterinaria vet = new Veterinaria("Mascotas");
		String vo= vet.getNombre();
		assertEquals("Mascotas",vo);
		
	}

	@Test
	public void queSePuedaCrearUnDuenioConDniYConNombre() 
	{
		Dueño axel = new Dueño(39458163,"Axel");
		
		String ve="Axel";
		assertEquals(ve,axel.getNombre());
		
		Integer ve2=39458163;

		assertEquals(ve2,axel.getDni(),0.0);
		
		
		
	}
	
	@Test
	public void queSePuedaCrearUnaMascotaConNombreIdApodoYTipoDeMascota() {
		Enum TipodeMascota;
		// El tipo de mascota puede ser solamente domÃ©stica y exÃ³tica (enum)
		Mascota kobu= new Mascota("kobu",2,"fiera", TipoMascota.Domestico);
		
		assertEquals("kobu",kobu.getNombre());
		assertEquals(2,kobu.getId(),0.0);
		assertEquals(TipoMascota.Domestico,kobu.getTipo());
		
	}
	
	@Test
	public void queSePuedaAgregarDosMascotasAUnDuenio() throws MascotaDuplicadaException {
		Enum TipodeMascota;
		Dueño axel = new Dueño(39458163,"Axel");
		
		Mascota simba= new Mascota("simba",1,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",2,null, TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
		assertEquals(axel.getMascotas().size(),2,0.0);
		
		
		
	}
	
	@Test (expected=MascotaDuplicadaException.class )
	public void queAlAgregarDosMascotasConMismoIdParaUnMismoDuenioLanceUnaExcepcionMascotaDuplicadaException() throws MascotaDuplicadaException {
	
	
		Enum TipodeMascota;
		Dueño axel = new Dueño(39458163,"Axel");
		
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",2,null, TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
	
	
	}
	
	@Test
	public void queSePuedaCrearUnMedicamentoConIdDescripcionYPrecio() {
		Medicamento medi= new Medicamento(1,"vacuna",55.0);
		assertEquals(medi.getId(),1,0.0);
		assertEquals(medi.getDescripcion(),"vacuna");
		assertEquals(medi.getPrecio(),55.0,0.0);
		
		
	}
	
	@Test
	public void queSePuedanAgregarDueniosDeMascotasAUnaVeterinaria() {
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		assertEquals(vet.getClientes().size(),2,0.0);
	}
	
	@Test
	
	public void queSePuedaCrearUnaAtencionConIdDeDuenioDeMascotaYPrecio() throws DuenioInexistenteException, MascotaNoEncontradaException, MascotaDuplicadaException
	{
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		Double precio= 100.0;
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,null, TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
		vet.buscarDueño(axel);
		axel.buscarMascota(simba);
	
		Atencion atencion = new Atencion(axel.getDni(),simba.getId(),precio);
		Atencion atencion2 = new Atencion(leonel.getDni(),kobu.getId(),precio);
		vet.atender(atencion);

		assertEquals(vet.getAtenciones().size(),1);
		
		
	}
	
	
	
	
	
	
	//en atencion mascota y dueño, y precio, cuando registra una atencion en
	//una veterinaria pasamos id del duelo y id de mascota
	//registrar una atencion 
	
	
	@Test
	public void testQueSePuedaCrearMasDeUnaAtencion()  throws DuenioInexistenteException, MascotaNoEncontradaException, MascotaDuplicadaException
	{
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		Double precio= 100.0;
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,null, TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
		Atencion atencion = new Atencion(axel.getDni(),simba.getId(),precio);
		Atencion atencion2 = new Atencion(leonel.getDni(),kobu.getId(),precio);
		vet.atender(atencion);
		vet.atender(atencion2);
		assertEquals(vet.getAtenciones().size(),2);
		
		
	}
	
	
	
	
	@Test
	public void queSePuedaAsignarVariosMedicamentosAUnaAtencion() throws DuenioInexistenteException, MascotaNoEncontradaException, MascotaDuplicadaException
	{
		// Para asignar un medicamento necesita el id de la atencion y el id del medicamento
	
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		Double precio= 100.0;
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,null, TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
		Atencion atencion = new Atencion(axel.getDni(),simba.getId(),precio);
		Atencion atencion2 = new Atencion(leonel.getDni(),kobu.getId(),precio);
		vet.atender(atencion);
		vet.atender(atencion2);
		Medicamento medi = new Medicamento(1, "vacuna", precio);
		Medicamento medi2 = new Medicamento(2, "vacuna2", precio);
		Medicamento medi3 = new Medicamento(3, "vacuna3", precio);
		atencion.reponerStock(medi);
		atencion.reponerStock(medi2);
		atencion.reponerStock(medi3);
		atencion.asignarMedicamento(39458163,1);
		atencion.asignarMedicamento(39458163,2);
		atencion.asignarMedicamento(39458163,3);
		Integer vo= atencion.getMedicamentosAsignados().size();
		assertEquals(3,vo,0.0);
	
	
	
	}
	
	@Test
	public void queSePuedaCalcularElPrecioTotalDeUnaAtencion()  throws DuenioInexistenteException, MascotaNoEncontradaException, MascotaDuplicadaException
{
		// El precio total de la atencion serÃ¡ la suma del precio de la atencion mas la suma del precio de todos los medicamentos
	
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		Double precio= 100.0;
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,null, TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
		Atencion atencion = new Atencion(axel.getDni(),simba.getId(),precio);
		Atencion atencion2 = new Atencion(leonel.getDni(),kobu.getId(),precio);
		vet.atender(atencion);
		vet.atender(atencion2);
		Medicamento medi = new Medicamento(1, "vacuna", precio);
		Medicamento medi2 = new Medicamento(2, "vacuna2", precio);
		Medicamento medi3 = new Medicamento(3, "vacuna3", precio);
		atencion.reponerStock(medi);
		atencion.reponerStock(medi2);
		atencion.reponerStock(medi3);
		atencion.asignarMedicamento(39458163,1);
		atencion.asignarMedicamento(39458163,2);
		atencion.asignarMedicamento(39458163,3);
		assertEquals(300.0,atencion.getPrecio(),0.0);
		//al crear una atencion por defecto se inicializa en 0 el precio y luego
		// se le va agregando el coste de los medicamentos
	
	}
	
	@Test
	public void queSePuedaObtenerDeUnDuenioUnaListaDeMascotasDomesticasOrdenadasPorApodo() throws MascotaDuplicadaException {
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		Mascota simba= new Mascota("simba",2,"pequeño", TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,"fiera", TipoMascota.Domestico);
		Mascota kobu2= new Mascota("kob",3,"fi", TipoMascota.Domestico);
		axel.adoptarMascota(simba);
		axel.adoptarMascota(kobu);
		axel.adoptarMascota(kobu2);
		TreeSet<Mascota> ordenado= axel.obtenerListaDeMascotasOrdeNadasPorApodo();
		
		String vector[]= new String[3];
		Integer i=0;
		for (Mascota mascotaaux : ordenado) {
			
			vector[i]=mascotaaux.getApodo();
			System.out.println(mascotaaux.getApodo());
			i++;
			
		}
		
		assertEquals(vector[0],"fi");
		assertEquals(vector[1],"fiera");
		assertEquals(vector[2],"pequeño");
		
		
		
	}
	@Test (expected= MascotaNoEncontradaException.class)
	public void testQueNoSeEncuentreLaMascota() throws MascotaDuplicadaException, DuenioInexistenteException, MascotaNoEncontradaException 
	{
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		Double precio= 100.0;
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,null, TipoMascota.Domestico);
		
		axel.adoptarMascota(kobu);
		vet.buscarDueño(axel);
		axel.buscarMascota(simba);
	
		
	}
	
	@Test
	public void queSePuedaObtenerUnMapaConIdDeAtencionYIdDeMascota() {
		Veterinaria vet = new Veterinaria("Mascotas");
		Dueño axel = new Dueño(39458163,"Axel");
		Dueño leonel = new Dueño(35458163,"Leonel");
		vet.agregardueño(axel);
		vet.agregardueño(leonel);
		Double precio= 100.0;
		Mascota simba= new Mascota("simba",2,null, TipoMascota.Exotica);
		Mascota kobu= new Mascota("kobu",1,null, TipoMascota.Domestico);
		Atencion atencion = new Atencion(axel.getDni(),simba.getId(),precio);
		Atencion atencion2 = new Atencion(leonel.getDni(),kobu.getId(),precio);
		vet.atender(atencion);
		
		vet.atender(atencion2);
		vet.llenarmapa(atencion.getDni(),atencion.getId());
		assertEquals(vet.getMapa().size(),1);
		//en este caso utilize el mismo dni como id, por querer escribir menos
	}
}
