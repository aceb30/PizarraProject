# PizarraProject
This is the final one. Put the real effort here.

Names: Bastián Cabrera Arroyo, Alex Jara Muñoz, Pedro Paris Espinoza. 

Instrucciones:

Se debe crear una pizarra múltiple que permita dibujar trazos, rectángulos, 
y conectores UML con mouseDrag. La pizarra debe modos de edición tales 
como borrar, y crear las diferentes formas de UML. Para eliminar se busca 
el elemento que contenga los pixeles encerrados por un rectángulo 
fantasma que queda entre mousePress y mouseRelease. La pizarra 
múltiple consiste en tener en el panel central una de ellas a la vez, 
pudiendo cambiar de una a otra sin perder lo editado. Se debe poder 
grabar en archivo la pizarra múltiple y cargarla de este. se debe poder 
borrar la pizarra completa. La pizarra múltiple se debe grabar en el archivo 
automáticamente al cambiar de una pizarra a otra. Se debe poder elegir el 
color de las líneas mediante botones GUI. 

Planificación básica:
Va a parecerce a Word, pero con uml y mucho más básico
El centro estará un panel principal > clase Pizarra
Arriba habrán botones para cambiar entre los archivos existentes y el actual y para cambiar entre modo editar y borrar y los elementos para editar la pizarra, como qué tipo de trazo poner, o qué dibujar en determinado momento, todo en la misma barra.
Supongo que será otro panel el que contenga estos botones > clase Botones
Acceder, guardar (automático) y borrar las pizarras archivadas es algo que habrá que descubrir cómo hacer

Elementos dentro de pizarra: Aún no sé si serán Nested Panels u otra forma (?) Lo raro es ver cómo se haría para modificar tamaños, o si será algo inmodificable una vez añadido uno. También sería conveniente poder cambiarle la fuente a la letra. 

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
AVANCE INICIAL DEL PROEYCTO

PRIMERA UPDATE: Lo mejor sería que al apretar los botones añadidos de borrar y editar la barra cambie. Así durante el modo editar aparecen las herramientas para ello y en el modo borrar lo mismo de forma equivalente. Para ello será conveniente usar otro panel lo más probablemente

SEGUNDA UPDATE: Oki doki, entonces ahora tenemos que los modos borrar y editar son nested panels dentro de la barra principal, se puede pasar entre ellos usando botones. Además, para el futuro manejo de archivos y multi pizarra se añadió una barra menú arriba para borrar, guardar y cargar cosas. Supongo que el siguiente reto es ir viendo cómo completar la interfaz y empezar a ya hablar de cómo será la manipulación básica de objetos en la pizarra: Poner cuadros y trazos se volverá una tarea escencial. 

TERCERA UPDATE: Estamos de a poco ordenando los packages mejor, qué dolor de cabeza. Aún no logro hacer que la nueva implementación de la barra de arriba se vea.

CUARTA UPDATE: Ahora quedan todos los botones y controles donde deben. Se han creado clases enteras para manejar los botones de cada modo, los botones de cambio de modo y los botones de la barra menú superior (que aún no logro hacer que reaparaezca luego de ese cambio)

QUINTA UPDATE: Agregada funcion para dibujar en pantalla con clases separadas por trazo


---------------------------------------------------------------------------------------------------------------------------------------------------------------------
FUNCIONALIDADES:
Botónes editar y borrar cambian los modos de edición principales.
Desde editar, se pueden añadir distintos tipos de flechas para las principales relaciones de UML. Además se pueden dibujar traazos de distintos colores con el lápiz.
Se habilitaron botones undo y redo para poder volver a algún paso anterior.
Se habilitó (no completamente) la opción de añadir texto con el botón Txt (quedó mal implementado)
La botonera principal D, dibuja un cuadro.
Cuadros, flechas y trazos se dibujan todos con mouseDrag.
En el modo borrar se pueden seleccionar objetos en específico (no habilitado) y limpiar toda la pizarra (habilitado para todo excepto para el texto)
En la barra superior, se encuentran:
Nueva Pizarra, botón que permite crear una nueva pestaña con una nueva pizarra en blanco
Cargar, botón pensado para cargar una pizarra ya hecha (no habilitado, no se alcanzó a hacer la serialización)
Guardar como imagen: Botón que guarda como archivo jpg la pizarra actual en la carpeta principal de proyecto (esta forma de exportación es la única encontrada para guardar diagramas hechos)
Borrar Archivo: Borra la pizarra actual sobre la que se trabaja.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
PRINCIPALES DECISIONES TOMADAS:

Dado el avance de otros ramos, el desarrollo del proyecto fue irregular. En etapas tempranas, el equipo se dedicó a desarrollar los elementos base de la interfaz, como la botonera principal y la barra. Luego, para las iteraciones, se consideró mejor decisión mejorar la interfaz más y dar la primera funcionalidad al proyecto (uso de lápiz). Durante la etapa final, el equipo se focalizó a tiempo completo en el proyecto, logrando la interfaz final, las funcionalidades de botones completas, la creación de múltiples pizarras y el guardado como imagen de estas, el javadoc, uml e informe presente.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
PROBLEMAS ENCONTRADOS / AUTOCRÍTICA:

El equipo se encontró a la dificultad de compaginar el desarrollo del trabajo con el de otras asignaturas. Debido a esto, fue irregular en el avance del proyecto. Las principales dificultades técnicas se centraron en la necesidad del equipo de aprender sobre la marcha los distintos conceptos fundamentales de java para el desarrollo adecuado del proyecto. El equipo debió reorganizar en repetidas ocasiones los packages y el ordenamiento adecuado del código del proyecto en general para su correcto desarrollo. Se concluye en la necesidad de la mejora de la autosuficiencia de los miembros del equipo y la necesidad de mejorar la constancia en el desarrollo de software en general.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
PATRONES UTILIZADOS

El diseño del proyecto en general fue estructural. Si bien no se focalizó en un patrón de diseño específico, el equipo reunió elementos de los patrones:
CRITERIA: Al crear clases y enfocarse en sus atributos para trabajar con ellas (vease clases de dibujables, ventanas)
COMPOSITE: Al clasificar obejetos por su trato dependiendo de la clase que heredan o del package (vease las ventas, o las barras)
DECORATOR: Al usar contenedores para la manipulación de múltiples objetos principales (como PizarraContainer)
