import java.io.IOException;

import javax.swing.JOptionPane;

//package clinica;

public final class TestClinica {
	
	static GestorPacientes pacientes = new GestorPacientes();
	static GestorMedico medicos = new GestorMedico();

	public static void main(String[] args) throws IOException {

		int choice;
	//	String cadena;
		int choiceMedico;
		int choicePaciente;
	//	int choiceCita;
	//  boolean a = true;
			 
	medicos.crearArchivosDoc();
	pacientes.crearArchivosPac();
		while(true){

			choice = Integer.parseInt(JOptionPane.showInputDialog(null, 
			" 0: Salir\n 1: Medico\n 2: Paciente\n 3: Cita", "Menu Principal", JOptionPane.QUESTION_MESSAGE));

			switch (choice) {
						
					
						case 0: 
							System.out.println("exit program...");
							System.exit(0);
						break;
							default :
								System.out.println("“Opción no válida” reintentar");
							break;

						
						case 1:  // medico menu
						
													
							choiceMedico = Integer.parseInt(JOptionPane.showInputDialog(null, 
							" 0:Salir\n 1: Nuevo Medico\n 2: Modificar Medico\n 3: mostrar Medico\n 4: Borrar medico", "Menu Medico", JOptionPane.QUESTION_MESSAGE));
							

							switch (choiceMedico) {
								
								case 0: 
								System.out.println("exit program...");
								//System.exit(0);
							break;
							default :
							System.out.println("“Opción no válida” reintentar");
							break;
							//****************************************
							case 1:
							medicos.nuevoMedico();	
						
							break;

							case 2:
							medicos.modificarMedico();
							break;
							
							case 3:
							//medicos.cargarArchivoDoc();
							medicos.mostrarMedico();
							break;
							case 4:
							medicos.borrarMedico();
							break;
							case 5:
							
							break;
						}
						break;
						
					
						
						
						case 2: // peciente menu 

						choicePaciente = Integer.parseInt(JOptionPane.showInputDialog(null, 
							" 0: Salir\n 1: Nuevo Paciente\n 2: Modificar Paciente\n 3: mostrar Paciente\n 4: Borrar medico", "Menu paciente", JOptionPane.QUESTION_MESSAGE));
							
						switch (choicePaciente) {

							case 0: 
								System.out.println("exit program...");
								//System.exit(0);
							break;
							default :
								System.out.println("“Opción no válida” reintentar");
							break;
							//****************************************
							case 1:
								pacientes.nuevoPaciente();	
							break;

							case 2:
								pacientes.modificarPaciente();
							break;

							case 3:
								pacientes.mostrarPacientes();
							break;
							case 4:
								pacientes.borrarPaciente();
							break;
							}
											

			}
 




		} 

	}

}
