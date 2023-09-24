# JDialog - JavaSwing

<img title="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR__OoKLbDv-WH9nPOPVa3F8mR4qjnZhnsGCw&usqp=CAU" alt="" data-align="inline" width="354">

##### Un JDialog se utiliza para crear y mostrar cuadros de diálogo en aplicaciones de escritorio.

##### Un cuadro de diálogo es una ventana emergente que generalmente se utiliza para interactuar con el usuario de manera modal, lo que significa que el usuario debe completar la interacción con el cuadro de diálogo antes de volver a interactuar con la ventana principal de la aplicación

---

[Estructura basica](https://github.com/meditux27/JDialog-JavaSwing/blob/main/basic/MyDialogExample.java)

Aquí tienes algunas de las características más importantes de un JDialog:

- Ventana de diálogo: Un JDialog es una ventana que generalmente se utiliza para interactuar con el usuario en forma de diálogo. Puede mostrar información, solicitar entrada o realizar acciones específicas.

- Modalidad: Un JDialog puede ser modal o no modal. Una ventana modal bloquea la interacción con otras partes de la aplicación hasta que se cierre, mientras que una ventana no modal permite que el usuario interactúe con otras partes de la aplicación mientras la ventana de diálogo está abierta.

- Decoración personalizable: Puedes personalizar la decoración de un JDialog para incluir botones de cierre, minimizar y maximizar según tus necesidades.

- Layout personalizable: Al igual que otros componentes Swing, puedes personalizar la disposición de los elementos dentro del JDialog utilizando administradores de diseño (LayoutManager) como FlowLayout, GridLayout, BorderLayout, etc.

- Eventos y acciones: Puedes agregar oyentes de eventos para responder a acciones del usuario, como hacer clic en botones, escribir texto en campos de entrada, cerrar la ventana, etc.

- Componentes personalizables: Puedes agregar una variedad de componentes como etiquetas (JLabel), botones (JButton), campos de texto (JTextField), listas (JList), etc., a un JDialog para construir la interfaz de usuario deseada.

- Título y etiquetas: Puedes establecer un título para el JDialog utilizando el método setTitle() y agregar etiquetas para describir los elementos de la ventana de diálogo.

- Tamaño y posición: Puedes controlar el tamaño y la posición de un JDialog utilizando métodos como setSize(), setLocation(), setBounds(), etc.

- Cierre y respuesta del usuario: Puedes obtener la respuesta del usuario a través de los componentes de la ventana de diálogo y controlar el cierre del diálogo según las acciones del usuario.

---

Pasos para implementar JDialog

1. **Importar las clases necesarias:** Asegúrate de importar las clases necesarias al principio de tu archivo Java. 
   
   `import javax.swing.*;`
   
   `import java.awt.*;` 
   
   `import java.awt.event.ActionEvent;`
   
   `import java.awt.event.ActionListener;`

2. **Crear una instancia de JDialog:** Crea una instancia de `JDialog` utilizando uno de los constructores disponibles. Puedes especificar el propietario de la ventana principal (un `JFrame`, por ejemplo), el título y si deseas que el cuadro de diálogo sea modal o no.
   
   `JFrame frame = new JFrame("Ventana Principal"); `
   
   `JDialog dialog = new JDialog(frame, "Cuadro de Diálogo", true);`

   Explicación detallada de cada argumento:

- `frame`: Este es el propietario del cuadro de diálogo, generalmente un `JFrame` que representa la ventana principal de tu aplicación. El cuadro de diálogo estará asociado a esta ventana y bloqueará la interacción con ella mientras esté visible.

- `"Cuadro de Diálogo"`: Este es el título del cuadro de diálogo. Aparecerá en la barra de título de la ventana del cuadro de diálogo.

- `true`: Este argumento establece si el cuadro de diálogo es modal o no. Cuando se establece en `true`, el cuadro de diálogo es modal, lo que significa que bloqueará la interacción con la ventana principal hasta que se cierre. Los cuadros de diálogo modales son útiles cuando deseas que el usuario complete una tarea o tome una decisión antes de continuar con la aplicación principal.
3. **Agregar componentes al JDialog:** Agrega los componentes de interfaz de usuario (botones, etiquetas, campos de texto, etc.) al cuadro de diálogo utilizando métodos como `add(component)` y personaliza su diseño según sea necesario.
   
   `JButton button = new JButton("Aceptar"); `
   
   `button.addActionListener(new ActionListener() {     `
   
   `public void actionPerformed(ActionEvent e) {         `
   
   `// Lógica para manejar el botón "Aceptar" aquí         `
   
   `dialog.dispose(); // Cierra el cuadro de diálogo     `
   
   `} }); `
   
   `dialog.add(button);`

4. **Configurar el cierre del JDialog:** Decide qué sucede cuando se cierra el cuadro de diálogo utilizando el método `setDefaultCloseOperation(int operation)`. Puedes configurarlo para que el cuadro de diálogo se oculte, se elimine o no haga nada al cerrarse.
   
   `dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Ocultar el cuadro de diálogo al cerrarlo`

5. **Mostrar el JDialog:** Finalmente, muestra el cuadro de diálogo utilizando el método `setVisible(true)`.
   
   `dialog.pack(); // Redimensiona el cuadro de diálogo para ajustarse al contenido dialog.setVisible(true); // Muestra el cuadro de diálogo`

6. **Manejar eventos y respuestas del usuario:** Agrega manejadores de eventos a los componentes dentro del cuadro de diálogo para responder a las acciones del usuario, como hacer clic en botones.
   
   `button.addActionListener(new ActionListener() {     `
   
   `public void actionPerformed(ActionEvent e) {         `
   
   `// Lógica para manejar el botón "Aceptar" aquí         `
   
   `dialog.dispose(); // Cierra el cuadro de diálogo     `
   
   `} });`

---

> :beginner: setVisible()

- Descripción

Muestra u oculta el cuadro de dialogo

- Sintaxis

dialog.setVisible(boolean);

- Nota

Para el uso del metodo setVisible se debe instanciar JDialogs, posteriormente llamar la variable asignada y agregar .setVisible(true o false)

<sub> Crear un JDialog</sub>  
`JDialog dialog = new JDialog(frame, "Cuadro de Diálogo", true);`

<sub>Agregar setVisible </sub>  
`dialog.setVisible("true");`

- Ejemplo

[setVisible]( https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogVisibilityExample.java)

---

> :beginner: setDefaultCloseOperation()

- Descripción

Configura el comportamiento de cierre del cuadro de diálogo. Puedes establecer si el cuadro de diálogo debe ocultarse, eliminarse o no hacer nada cuando se cierre.

- Sintaxis

setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

- Nota

La constante `setDefaultCloseOperation` toma un valor de tipo `int` que puede ser uno de los siguientes:

- `JDialog.DO_NOTHING_ON_CLOSE`: No se realiza ninguna acción cuando el usuario intenta cerrar el diálogo.
- `JDialog.HIDE_ON_CLOSE`: El diálogo se oculta pero no se destruye cuando el usuario intenta cerrarlo.
- `JDialog.DISPOSE_ON_CLOSE`: El diálogo se cierra y se destruye cuando el usuario intenta cerrarlo. Esto libera todos los recursos asociados al diálogo.

Crear un JDialog  
`JDialog dialog = new JDialog();`

Agregar setTitle  
`dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);`

- Ejemplo

[DO_NOTHING_ON_CLOSE](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetDefaultCloseOperation.java)

[HIDE_ON_CLOSE](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetDefaultCloseOperationHIDE.java)

[DISPOSE_ON_CLOSE](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetDefaultCloseOperationDISPOSE.java)

---

:beginner: setTitle()

- Descripción

Establece el título del cuadro de diálogo.

- Sintaxis

dialog.setTitle("String");

- Nota

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setTitle("Titulo Personalizado")

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setTitle("Titulo de JDialog Personalizado");`

- Ejemplo

[setTitle](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetTitle.java)

---



:beginner: pack()

- Descripción

 Redimensiona automáticamente el cuadro de diálogo para que se ajuste al contenido que contiene.

- Sintaxis

dialog.pack();

- Nota

El método `pack()` se utiliza en un `JDialog` de la misma manera que se utiliza en un `JFrame`. Su propósito es ajustar automáticamente el tamaño del diálogo para que se ajuste a su contenido de manera adecuada, lo que significa que el diálogo tomará el tamaño mínimo necesario para mostrar todos los componentes internos de manera adecuada.

Para el uso del metodo pack se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .pack();

Crear un JDialog  
`JDialog dialog = new JDialog(frame,"JDialog", true);`

Agregar setVisible  
`dialog.pack();`

- Ejemplo

[pack](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogpack.java)

---

:beginner: setLayout(LayoutManager manager)

- Descripción

Establece el administrador de diseño del panel para controlar la disposición de los componentes anexados al panel, entre los mas utilizados son : `FlowLayout|GridLayout|BorderLayout`

- Sintaxis

Se puede utilizar de 2 maneras

1. Creando la instancia de layout manager y asignando el nombre de la variable donde se guardo la instancia

`GridLayout diseno = new GridLayout(3, 3);`

`dialog.setLayout(diseno);`

2. Agregando directamente al panel mediante la instancia

`JDialog dialog = new JDialog(frame,"JDialog" ,false);`

`dialog.setLayout(new FlowLayout());`

- Nota

Establece el administrador de diseño del panel para controlar la disposición de los componentes anexados al JDialog, entre los mas utilizados son : `FlowLayout|GridLayout|BorderLayout`

1. FlowLayout

*Organiza los componentes en una fila horizontal o vertical, ajustándolos automáticamente a medida que se agregan. Es útil para diseños simples de una fila o una columna de componentes.*

2. *BorderLayout*

*Divide el contenedor en cinco áreas: norte, sur, este, oeste y centro. Cada área puede contener un solo componente, y los componentes se expanden para llenar su área asignada.*

3. *GridLayout*

*Organiza los componentes en una cuadrícula de filas y columnas de tamaño fijo. Todos los componentes en un GridLayout tienen el mismo tamaño.*

- Ejemplo

[FlowLayout](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialoFlowLayout.java)

[BorderLayout](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogBorderLayout.java)

[GridLayout](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogGridLayout.java)

---

:beginner: setResizable()

- Descripción

Permite o deshabilita la capacidad de redimensionar el cuadro de diálogo por parte del usuario.

- Sintaxis

dialog.setResizable(true|false);

- Nota

Si estableces `resizable` en `true`, el usuario podrá ajustar el tamaño del diálogo mediante la manipulación de los bordes o esquinas de la ventana del diálogo. Si estableces `resizable` en `false`, el usuario no podrá redimensionar el diálogo.

Por defecto, la mayoría de los `JDialogs` son redimensionables, lo que significa que `setResizable(true)` es el comportamiento predeterminado.



Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setResizable(true);

Crear un JDialog  
`JDialog dialog = new JDialog(frame,"Ejemplo JDialog");`

Agregar setVisible  
`dialog.setResizable(true);`

- Ejemplo

[setResizable](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetresizable.java)

---

:beginner: setModalityType()

- Descripción

Este método permite especificar cómo el diálogo interactúa con otras ventanas y componentes de la aplicación.

- Sintaxis

dialog.setModalityType(ModalityType.APPLICATION_MODAL);

dialog2.setModalityType(ModalityType.DOCUMENT_MODAL);

dialog3.setModalityType(ModalityType.MODELESS);

- Nota

El método `setModalityType` toma un argumento del tipo `Dialog.ModalityType`, que puede ser uno de los siguientes:

1. `Dialog.ModalityType.APPLICATION_MODAL`: Este tipo de modalidad hace que el diálogo sea modal para su aplicación, lo que significa que bloqueará la interacción con otras partes de la aplicación mientras esté abierto. El usuario debe cerrar el diálogo antes de poder interactuar con otras ventanas de la misma aplicación.

2. `Dialog.ModalityType.DOCUMENT_MODAL`: Este tipo de modalidad hace que el diálogo sea modal solo para el documento principal de la aplicación, lo que significa que bloqueará la interacción con otras ventanas del mismo documento principal mientras esté abierto.

3. `Dialog.ModalityType.MODELESS`: Este tipo de modalidad hace que el diálogo sea no modal, lo que significa que no bloqueará la interacción con otras partes de la aplicación mientras esté abierto. El usuario puede interactuar con otras ventanas y componentes mientras el diálogo está en pantalla.
- Ejemplo

[setModalityType](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetModalityType.java)

---

:beginner: ()

- Descripción

Establece el título del cuadro de diálogo.

- Sintaxis

dialog.setTitle("String");

- Nota

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setTitle("Titulo Personalizado")

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setTitle("Titulo de JDialog Personalizado");`

- Ejemplo

[setTitle](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/DialogsetsetTitle.java)

---

:beginner: ()

- Descripción

Establece el título del cuadro de diálogo.

- Sintaxis

dialog.setTitle("String");

- Nota

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setTitle("Titulo Personalizado")

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setTitle("Titulo de JDialog Personalizado");`

- Ejemplo

[setTitle](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/DialogsetsetTitle.java)

---

:beginner: ()

- Descripción

Establece el título del cuadro de diálogo.

- Sintaxis

dialog.setTitle("String");

- Nota

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setTitle("Titulo Personalizado")

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setTitle("Titulo de JDialog Personalizado");`

- Ejemplo

[setTitle](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/DialogsetsetTitle.java)

---

:beginner: ()

- Descripción

Establece el título del cuadro de diálogo.

- Sintaxis

dialog.setTitle("String");

- Nota

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setTitle("Titulo Personalizado")

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setTitle("Titulo de JDialog Personalizado");`

- Ejemplo

[setTitle](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/DialogsetsetTitle.java)

---
