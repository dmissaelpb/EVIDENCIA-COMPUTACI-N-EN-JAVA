import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class GestorMedico {


	File archivoDoc;

    private ArrayList<Medico> medicos;
    
    public GestorMedico() {
		medicos = new ArrayList<Medico>();
	}

    public boolean nuevoMedico() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del Medico:", "Nuevo medico", JOptionPane.QUESTION_MESSAGE);
		String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo medico", JOptionPane.QUESTION_MESSAGE);
		String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo medico", JOptionPane.QUESTION_MESSAGE);
		String especialidad = JOptionPane.showInputDialog(null, "especialidad:", "Nuevo medico", JOptionPane.QUESTION_MESSAGE);

		
		Medico nuevoMedico = new Medico(id, nombre, apellidos, especialidad);
		
		try(FileWriter medicosW = new FileWriter(archivoDoc, true);){
			
			medicosW.write(id + "."  + nombre + "." + apellidos + "." + especialidad + "\r\n");
			//  escritura.close();
		}catch(IOException e){
			
			System.out.println(e);
		}
		
		return medicos.add(nuevoMedico);//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
	
	}
	public void crearArchivosDoc(){
		try {
            archivoDoc = new File("DocBook.txt");
            if (archivoDoc.createNewFile()) {
                JOptionPane.showMessageDialog(null,"DocBook Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
	}

    public void mostrarMedico() throws IOException {
		cargarArchivoDoc();

		/*for (Medico m: medicos)
			m.mostrar();*/
	}

	public  void cargarArchivoDoc() throws IOException{

		
		try (BufferedReader lecturaDoc = new BufferedReader(new FileReader("DocBook.txt"))){
	
		String linea ;

	//	String id = linea.split(".")[1];
	//	String id = "";
		String nombre = "";
		String apellidos = "";
		String especialidad = "";
	//	String  linea.split("&")[];
			
		while((linea = lecturaDoc.readLine()) != null){

	
			//int i = 0;

			// linea.split("&") = linea.split("&");
			String id  = linea.split("&")[0];
			

			JOptionPane.showMessageDialog(null,linea );
			
			//Medico nuevoMedico = new Medico(id, nombre, apellidos, especialidad);
			
			System.out.println(linea);
			
		}
		
		//String   id           = linea.split(".")[1];
	
		
		
		
	}catch(FileNotFoundException e){
		System.out.println(e);
	}

	}




    public boolean modificarMedico() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del Medico a modificar:",
				"Modificar Medico", JOptionPane.QUESTION_MESSAGE);
		
		Medico medico = null;
		for (int i = 0; i < medicos.size(); i++){
			if (medicos.get(i).getId().equals(id)) {
				medico = medicos.get(i);//Referenciamos a otro nombre de objeto
				break;//No hace falta seguir buscando, "rompemos" el bucle for
			}
		}
		
		if (medico == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra Medico con el ID:\n" + id,
					"Medico no encontrado", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			
			medico.setId(JOptionPane.showInputDialog(null, "ID actual: " + medico.getId()
				+ "\nIntroduzca nuevo identificador:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
			medico.setNombre(JOptionPane.showInputDialog(null, "Nombre actual: " + medico.getNombre()
				+ "\nIntroduzca nuevo nombre:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
			medico.setApellidos(JOptionPane.showInputDialog(null, "Apellidos actuales: " + medico.getApellidos()
				+ "\nIntroduzca nuevos apellidos:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
			medico.setEspecialidad(JOptionPane.showInputDialog(null, "especialidad actual: " + medico.getEspecialidad()
				+ "\nIntroduzca nuevo especialidad:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
			
			return true;
		}
	}


    public boolean borrarMedico() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del medico a borrar:",
				"Borrar medico", JOptionPane.QUESTION_MESSAGE);
		
		Medico medico = null;
		for (int i = 0; i < medicos.size(); i++){
			if (medicos.get(i).getId().equals(id))
				medico = medico.remove(i);//Al eliminar el objeto, el ArrayList nos lo devuelve y lo recogemos en "medico"
		}

		if (medico == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra medico con el ID:\n" + id,
					"medico no encontrado", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "Se elimino el medico con ID:\n" + id,
					"medico Eliminado", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		
	}

	
	

}
