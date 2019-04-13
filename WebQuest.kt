1-¿Que es un control de versiones?

El control de versiones es un sistema que registra los cambios realizados sobre un archivo o conjunto de archivos a lo largo del tiempo, de modo que pueda recuperar versiones específicas más adelante. 

2-¿Cúales son las ventajas de utilizar un control de versiones?
Permite mantener un histórico de todo el desarrollo del proyecto.

Añade trazabilidad al desarrollo de software, ya que se puede ver qué cambios se han hecho en el código en cada versión.

Muestra mucha información estadística de cómo se está desarrollando el proyecto (principales autores, número de versiones, cambios, etc.).

Facilita mucho el trabajo en equipo.

Permite desarrollar varias versiones de un mismo programa a la vez.

3-¿cuales son los controladores de versiones disponibles para android studio?
Subversion?

1.CVS
2.Git
3.Subversion
4.Mercurial


4-¿cuales son los servidores de controladores de versiones mas conocidos?

CVS:

CVS ha estado durante mucho tiempo, y muchos desarrolladores están ya familiarizados con él. En su día fue revolucionario: fue el primer sistema de control de versiones de código abierto con acceso a redes de área amplia para desarrolladores (que yo sepa), y el primero que ofreció ""checkouts"" anónimos de sólo lectura, los que dieron a los desarrolladores una manera fácil de implicarse en los proyectos. CVS sólo versiona ficheros, no directorios; ofrece ramificaciones, etiquetado, y un buen rendimiento en la parte del cliente, pero no maneja muy bien ficheros grandes ni ficheros binarios. Tampoco soporta cambios atómicos.

Git:

GIT es un proyecto empezado por Linus Torvalds para manejar el arbol fuente del ""kernel"" de Linux. Al principio GIT se enfocó bastante en las necesidades del desarrollo del ""kernel"", pero se ha expandido más allá que eso y ahora es usado por otros proyectos aparte del ""kernel"" de Linux. Su página web dice que está "... diseñado para manejar proyectos muy grandes eficaz y velozmente; se usa sobre todo en varios proyectos de código abierto, entre los cuales el más notable es el ""kernel"" de Linux. GIT cae en la categoría de herramientas de administración de código abierto distribuído, similar al, por ejemplo, GNU Arch o Monotone (o bitKeeper en el mundo comercial). Cada directorio de trabajo de GIT es un repositorio completo con plenas capacidades de gestión de revisiones, sin depender del acceso a la red o de un servidor central."

Subversion:

Subversion fue escrito ante todo para reemplazar a CVS—es decir, para acceder al control de versiones aproximadamente de la misma manera que CVS lo hace, pero sin los problemas o falta de utilidades que más frecuentemente molestan a los usuarios de CVS. Uno de los objetivos de Subversion es encontrar la transición a Subversion relativamente suave para la gente que ya está acostumbrada a CVS. Aquí no hay sitio para entrar en detalles sobre las características de Subversion; acceda a su sitio web para más información. [Descargo: Estoy implicado en el desarrollo de Subversion, y es el único de estos sistemas que uso habitualmente.

Mercurial:

Mercurial es un sistemas de control de versiones distribuido que ofrece, entre otras cosas, "una completa ""indexación cruzada"" de ficheros y conjutos de cambios; unosprocotolos de sincronización SSH y HTTP eficientes respecto al uso de CPU y ancho de banda; una fusión arbitraria entre ramas de desarrolladores; una interfaz web autónoma integrada; [portabilidad a] UNIX, MacOS X, y Windows" y más (la anterior lista de características ha sido parafraseada del sitio web de Mercurial).

5-investigue los siguientes terminos: Puhs,Commit,Branch,Delete,Stack y Repositorio.

commit:se refiere, en el contexto de la ciencia de la computación y la gestión de datos, a la idea de confirmar un conjunto de cambios provisionales de forma permanente. 

El comando commit es usado para cambiar a la cabecera. Ten en cuenta que cualquier cambio comprometido no afectara al repertorio remoto. Usa el comando:
git commit –m “Message to go with the commit here”

Puh: Este es uno de los comandos más básicos. Un simple push envía los cambios que se han hecho en la rama principal de los repertorios remotos que están asociados con el directorio que está trabajando. 
Por ejemplo:
git push  origin master

Branch: Este comando se usa para listar, crear o borrar ramas. Para listar todas las ramas se usa:
git branch

para borrar la rama:

git branch -d <branch-name>

Stack: Este es uno de los comandos menos conocidos, pero ayuda a salvar cambios que no están por ser comprometidos inmediatamente, pero temporalmente:
git stash

Delete:

comando para poder eliminar repositorio, archivo etc.

git rm

Repositorio:

Un repositorio es un espacio centralizado donde se almacena, organiza, mantiene y difunde información digital, habitualmente archivos informáticos, que pueden contener trabajos científicos, conjuntos de datos o software .

Los repositorios remotos son versiones de tu proyecto que están hospedadas en Internet en cualquier otra red. Puedes tener varios de ellos, y en cada uno tendrás generalmente permisos de solo lectura o de lectura y escritura. Colaborar con otras personas implica gestionar estos repositorios remotos y enviar y traer datos de ellos cada vez que necesites compartir tu trabajo. Gestionar repositorios remotos incluye saber cómo añadir un repositorio remoto, eliminar los remotos que ya no son válidos, gestionar varias ramas remotas y definir si deben rastrearse o no, y más. En esta sección, trataremos algunas de estas habilidades de gestión de remotos.

