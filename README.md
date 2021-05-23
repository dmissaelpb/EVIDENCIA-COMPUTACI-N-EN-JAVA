# **************************************** general  **********************************************

# EVIDENCIA-COMPUTACI-N-EN-JAVA
Utiliza la tecnología y el lenguaje Java® para instalar y configurar un ambiente de desarrollo eficiente mediante la programación estructurada y orientada a objetos, integrando diferentes tecnologías que le sean relevantes.

Instrucciones: Cada unidad de competencia tiene un valor. Si el participante cumple con un criterio, deberá colocar la palabra “sí” en la columna “¿Cumple?” y escribir el mismo valor en la columna “Puntaje”. Por el contrario, si el participante no cumple con el criterio, deberá escribir la palabra “no” en la columna “¿Cumple?” y un puntaje de 0 en la columna de la derecha.       

Descripción: El participante aplicará sus conocimientos obtenidos en el curso para crear un programa que simulará un sistema de administración de citas para un consultorio clínico. 
   # El programa deberá poder realizar las siguientes acciones:
  •Dar de alta doctores.•Dar de alta pacientes.
  •Crear una cita con fecha y hora.
  •Relacionar una cita con un doctor y un paciente.
  •Tener control de acceso mediante administradores, esto es, solo ciertos usuarios podrán acceder al sistema mediante un identificador y una contraseña.
  
  #La evidencia se dividirá en tres etapas:
  
 •Avance 1: ambiente de desarrollo, diagrama de flujo.
 •Avance 2: diseño del programa, diagrama de clases y pseudocódigo de la aplicación.
 •Entrega final: documentación de uso.
  
  # Objetivo: 
  Que el estudiante aplique los conocimientos adquiridos durante la clase creando un programa en Javaquesimulará un sistema de administración de citas para un consultorio 
  
  # clínico.Requerimientos:
  1.Kit de desarrollo de Java 11 instalado y configurado.
  2.Entorno integrado de desarrollo IntelliJ IDEA instalado y configurado.
  3.Sistema de control de versiones Git instalado y configurado.
  4.Cuenta en un servicio de repositorios en línea.
# **************************************** perte 1 **********************************************
1. Diseño del programa (diagrama de clases)
Después de avanzar en los conocimientos sobre programación orientada a objetos, se realizará un diagrama de clases
donde se desglosarán los componentes de la aplicación. Se deberán estructurar los componentes de acuerdo con las
funcionalidades del sistema, por ejemplo:
• Clase Principal.
• Clase para Doctor.
• Clase para Paciente.
• Clase para Cita.
El reto es pensar en otras clases, tanto abstractas como concretas, así como posibles interfaces que sean necesarias para
implementar correctamente las funcionalidades del programa, no olvidar tomar en cuenta los conceptos de herencia y
polimorfismo.

# **************************************** parte 2 ***************************************************
2. Pseudocódigo
Con base en el diagrama, parte de la entrega 1, traducirlo a pseudocódigo. Si es necesario, mejorar el diagrama de flujo.

Criterios de evaluación:

Criterio Puntaje
1. Diagrama de clases. 60
2. Pseudocódigo. 40
Entregable:
Realizar un reporte explicando la implementación del diagrama de clases, incluir capturas de pantalla como evidencia.
Realizar el pseudocódigo e incluirlo en el reporte.
• Documento en formato DOC, DOCX o PDF.
• Incluir la liga al repositorio en el reporte realizado.


# **************************************** Entrega final **************************************** 
1. Entrega del código

El código fuente de la aplicación deberá ser publicado en el repositorio GitHub creado en el entregable:

• El código debe contar con dos branch: develop y master.
• Cada funcionalidad debe contar con un branch, por ejemplo:
• Branch: crear_cita cuenta con los commits relacionados con esta funcionalidad.
• Cada branch de funcionalidad debe hacer merge con el branch develop sin borrar el branch origen.
• El branch develop debe contener todos los commits creados durante el desarrollo de la aplicación.
• El branch master debe contar con el código final y un tag en la versión estable, por ejemplo, v1.0.

• La versión final disponible en el branch master.


El código deberá contar con una carpeta llamada db, en esta carpeta se almacenarán todos los archivos que contienen la información de doctores, pacientes, citas, entre otros. Los archivos NO DEBERÁN SUBIRSE AL REPOSITORIO, deberá existir un archivo 
.gitignore dentro de la carpeta que evite subir al repositorio el contenido de dicha carpeta. De no existir los archivos en la carpeta, el programa deberá poder realizar una validación y regenerar los archivos faltantes. La aplicación deberá estar  onfigurada para compilarse como un FAT JAR para garantizar que todas las dependencias
estarán incluidas y garantizar que sea portable.

2. Documentación
El repositorio deberá contar con un archivo README con el siguiente contenido:
• Instalación y configuración.
• Uso del programa.
• Créditos.
• Licencia.
La documentación de la aplicación se debe manejar en GitHub en el área de Wiki y las secciones con las que debe contar
son:
• Acerca de: se explica brevemente la aplicación.
• Proyecto: incluir el diagrama de flujo en la entrega uno, además de describir cada una de las clases incluidas, su
propósito y descripción de sus métodos y variables.
• Guías: pasos para configurar, ejecutar el programa, y crear un JAR ejecutable desde el código almacenado en el
repositorio.
