
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public final class GestorPacientes {

	File archivoPac;

	
	private ArrayList<Paciente> pacientes;
	
	public GestorPacientes() {
		pacientes = new ArrayList<Paciente>();
	}
	
	
	public boolean nuevoPaciente() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
		String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
		String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
		String genero = JOptionPane.showInputDialog(null, "Genero:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
		int edad = 0;
		try {
			edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE));
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido",
					"Error", JOptionPane.WARNING_MESSAGE);
		}

		Paciente nuevoPaciente = new Paciente(id, nombre, apellidos, edad, genero);

		try(FileWriter pacientesW = new FileWriter(archivoPac, true);){
			
			pacientesW.write(id + "."  + nombre + "." + apellidos + "." + genero + "." + genero + "\r\n");
			//  escritura.close();
		}catch(IOException e){
			
			System.out.println(e);
		}


		return pacientes.add(nuevoPaciente);//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
	}
	public void crearArchivosPac(){
		try {
            archivoPac = new File("PacBook.txt");
            if (archivoPac.createNewFile()) {
                JOptionPane.showMessageDialog(null,"PacBook Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
	}
	/**
	 * Lista por pantalla los datos de todos los pacientes registrados.
	 */
	public void mostrarPacientes()throws IOException {

		cargarArchivoPac();


		/*for (Paciente p: pacientes)
			p.mostrar();*/
	}

	public  void cargarArchivoPac() throws IOException{

		
		try (BufferedReader lecturaPac = new BufferedReader(new FileReader("PacBook.txt"))){
	
		String linea ;
			
		while((linea = lecturaPac.readLine()) != null){

			String id  = linea.split("&")[0];
			

			JOptionPane.showMessageDialog(null,linea );
			
			System.out.println(linea);
			
		}
		
		
	}catch(FileNotFoundException e){
		System.out.println(e);
	}

	}
	





	public boolean modificarPaciente() {

		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del paciente a modificar:",
				"Modificar Paciente", JOptionPane.QUESTION_MESSAGE);
		
		Paciente paciente = null;
		for (int i = 0; i < pacientes.size(); i++){
			if (pacientes.get(i).getId().equals(id)) {
				paciente = pacientes.get(i);//Referenciamos a otro nombre de objeto
				break;//No hace falta seguir buscando, "rompemos" el bucle for
			}
		}
		
		if (paciente == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra Paciente con el ID:\n" + id,
					"Paciente no encontrado", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			//Comienza el proceso de modificacion
			paciente.setId(JOptionPane.showInputDialog(null, "ID actual: " + paciente.getId()
				+ "\nIntroduzca nuevo identificador:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			paciente.setNombre(JOptionPane.showInputDialog(null, "Nombre actual: " + paciente.getNombre()
				+ "\nIntroduzca nuevo nombre:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			paciente.setApellidos(JOptionPane.showInputDialog(null, "Apellidos actuales: " + paciente.getApellidos()
				+ "\nIntroduzca nuevos apellidos:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			paciente.setGenero(JOptionPane.showInputDialog(null, "Genero actual: " + paciente.getGenero()
				+ "\nIntroduzca nuevo genero:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			try {
				paciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Edad actual: " + paciente.getEdad()
				+ "\nIntroduzca nueva edad:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE)));
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido",
						"Error", JOptionPane.WARNING_MESSAGE);
			}
			return true;
		}
	}
	

	/**
	 * Elimina el Paciente indicado por el usuario mediante el ID del Paciente.
	 * @return True si tuvo éxito la eliminacion.
	 * False si no se encontró el Paciente indicado.
	 */
	public boolean borrarPaciente() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del paciente a borrar:",
				"Borrar Paciente", JOptionPane.QUESTION_MESSAGE);
		
		Paciente paciente = null;
		for (int i = 0; i < pacientes.size(); i++){
			if (pacientes.get(i).getId().equals(id))
				paciente = pacientes.remove(i);//Al eliminar el objeto, el ArrayList nos lo devuelve y lo recogemos en "paciente"
		}
		
		if (paciente == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra Paciente con el ID:\n" + id,
					"Paciente no encontrado", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "Se elimino el paciente con ID:\n" + id,
					"Paciente Eliminado", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
	}

}