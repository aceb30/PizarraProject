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
