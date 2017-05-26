import javax.swing.JPanel;

public class Prueba {

	
	
	public static void main(String[] args) {
		
			
		Alien et = new Alien("Juan");
		//et.setNombre("Rudecinto");
		Alien et1 = new Alien();
		Planeta astro = new Planeta();
		astro.setDenominacion("SABU");
		et.setOrigen(astro);
		Especie bichoTipo= new Especie();
		bichoTipo.setNombreEspecie("marciano");
		Alien et2= new Alien("joselito",bichoTipo);
		System.out.println(et.getNombre()+"   "+et.getOrigen()+"\n"+et1.getIdAlien()+"\n"+et2.getNombre()+"   "+et2.getQueEspecie());
		/*et.setQueEspecie(bichoTipo);
		System.out.println(et.getNombre());
		System.out.println(et.getOrigen().getDenominacion());
		System.out.println(et.getQueEspecie().getNombreEspecie());*/
		
		
		
		/*Scanner s = new Scanner(System.in);
System.out.println("ingrese un nombre de alien");

nombre=s.nextLine();
et.setNombre(nombre);*/

}
	

}
