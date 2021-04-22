
INSTRUCCIONES


NOTA: Aunque en cada avance se piden puntos específicos para calificar la entrega, 
tanto el profesor como los participantes deben estar conscientes que se espera un avance ontinuo de programación, 
por lo que en ningún momento se debe aplazar el inicio de 
la programación del programa hasta las últimas semanas del curso.

A continuación se describen los requerimientos del programa:

El producto final será un programa que simulará un sistema de administración de citas con las siguientes funcionalidades:

•Dar de alta doctores: se deberán poder dar de alta los doctores del consultoriomédico, 

los datos básicos serán:

•Identificador único.
•Nombre completo.
•Especialidad.
•Nombre completo.

•Crear una cita con fecha y hora: se deberán poder crear múltiples citas, los datos básicos serán:

•Identificador único.
•Fecha y hora de la cita.
•Motivo de la cita.

•Relacionar una cita con un doctor y un paciente: cada una de las citas creadas deberá estar relacionadacon un doctor y un paciente.
•Tener control de acceso mediante administradores: solo ciertos usuarios podrán acceder al sistema mediante un identificador y una contraseña.
•Toda la información deberá ser almacenada en archivos de texto plano con formato CSV, o en su defecto utilizar algún formato más avanzado como JSON o XML.

La aplicación será totalmente portable, es decir, que se podrá ejecutar en cualquier sistema operativo que tenga instalado Java, 
para ello deberá ser configurada para compilarse como un archivo tipo FAT JARy garantizar que todas las dependencias estarán incluidas.

La aplicación contará con el manejo correcto de recursos y excepciones, es decir, si ocurre una excepción,el programa no saldrá,
sino que seguirá ejecutándose y mostrará el mensaje de error en la pantalla. 