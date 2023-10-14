# JDialog - JavaSwing

<img title="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR__OoKLbDv-WH9nPOPVa3F8mR4qjnZhnsGCw&usqp=CAU" alt="" data-align="inline" width="374">

#### Un JDialog se utiliza para crear y mostrar cuadros de diálogo en aplicaciones de escritorio.

#### Un cuadro de diálogo es una ventana emergente que generalmente se utiliza para interactuar con el usuario de manera modal, lo que significa que el usuario debe completar la interacción con el cuadro de diálogo antes de volver a interactuar con la ventana principal de la aplicación

---

:book: **Las características más importantes de un `JDialog` en Swing son las siguientes:**

1. **Ventana de diálogo**: Un JDialog es una ventana que generalmente se utiliza para interactuar con el usuario en forma de diálogo. Puede mostrar información, solicitar entrada o realizar acciones específicas.

2. **Modalidad**: Un JDialog puede ser modal o no modal. Una ventana modal bloquea la interacción con otras partes de la aplicación hasta que se cierre, mientras que una ventana no modal permite que el usuario interactúe con otras partes de la aplicación mientras la ventana de diálogo está abierta.

3. **Decoración personalizable**: Puedes personalizar la decoración de un JDialog para incluir botones de cierre, minimizar y maximizar según tus necesidades.

4. **Layout personalizable**: Al igual que otros componentes Swing, puedes personalizar la disposición de los elementos dentro del JDialog utilizando administradores de diseño (LayoutManager) como FlowLayout, GridLayout, BorderLayout, etc.

5. **Eventos y acciones**: Puedes agregar oyentes de eventos para responder a acciones del usuario, como hacer clic en botones, escribir texto en campos de entrada, cerrar la ventana, etc.

6. **Componentes personalizables**: Puedes agregar una variedad de componentes como etiquetas (JLabel), botones (JButton), campos de texto (JTextField), listas (JList), etc., a un JDialog para construir la interfaz de usuario deseada.

7. **Título y etiquetas**: Puedes establecer un título para el JDialog utilizando el método setTitle() y agregar etiquetas para describir los elementos de la ventana de diálogo.

8. **Tamaño y posición**: Puedes controlar el tamaño y la posición de un JDialog utilizando métodos como setSize(), setLocation(), setBounds(), etc.

9. **Cierre y respuesta del usuario**: Puedes obtener la respuesta del usuario a través de los componentes de la ventana de diálogo y controlar el cierre del diálogo según las acciones del usuario.

---

:clipboard: **Pasos para implementar JDialog**

1. **Importar las clases necesarias:** 
   
    Asegúrate de importar las clases necesarias de Swing.
   
   ```java
   import javax.swing.*;
   ```

2. **Crear una instancia de JDialog:** 
   
   Crea una instancia de JDialog utilizando uno de los constructores disponibles. Puedes especificar el propietario de la ventana principal (un `JFrame`, por ejemplo), el título y si deseas que el cuadro de diálogo sea modal o no.
   
   ```java
   JFrame frame = new JFrame("Ventana Principal");
   JDialog dialog = new JDialog(frame, "Cuadro de Diálogo", true);
   ```
   
   Explicación detallada de cada argumento:
- `frame`: Este es el propietario del cuadro de diálogo, generalmente un `JFrame` que representa la ventana principal de tu aplicación. El cuadro de diálogo estará asociado a esta ventana y bloqueará la interacción con ella mientras esté visible.

- `Cuadro de Diálogo`: Este es el título del cuadro de diálogo. Aparecerá en la barra de título de la ventana del cuadro de diálogo.

- `true`: Este argumento establece si el cuadro de diálogo es modal o no. Cuando se establece en `true`, el cuadro de diálogo es modal, lo que significa que bloqueará la interacción con la ventana principal hasta que se cierre. Los cuadros de diálogo modales son útiles cuando deseas que el usuario complete una tarea o tome una decisión antes de continuar con la aplicación principal.
3. **Agregar componentes al JDialog:** Agrega los componentes de interfaz de usuario (botones, etiquetas, campos de texto, etc.) al cuadro de diálogo utilizando métodos como `add(component)` y personaliza su diseño según sea necesario.
   
   ```java
   JLabel label = new JLabel("Este es un cuadro de diálogo de ejemplo.");
   dialog.add(label);
   ```

4. **Configurar el cierre del JDialog:** 
   
   Decide qué sucede cuando se cierra el cuadro de diálogo utilizando el método `setDefaultCloseOperation(int operation)`. Puedes configurarlo para que el cuadro de diálogo se oculte, se elimine o no haga nada al cerrarse.
   
   ```java
   dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
   ```

5. **Mostrar el JDialog:** Finalmente, muestra el cuadro de diálogo utilizando el método `setVisible(true)`.
   
   ```java
   dialog.setVisible(true);
   ```

6. **Manejar eventos y respuestas del usuario:** 
   
   Agrega manejadores de eventos a los componentes dentro del cuadro de diálogo es un comportamiento comun, por lo cual se puede utilizar elementos tales como botones que pueden manipular el comportamiento del mismo JDialog o algun otro elemento.
   
   ```java
   JButton button=new JButton("Boton interno");
   button.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
   // Cierra el cuadro de diálogo
   dialog.dispose(); 
   } });
   ```

:coffee:[Estructura basica](https://github.com/meditux27/JDialog-JavaSwing/blob/main/basic/MyDialogExample.java)

---

> :beginner: **setVisible()**

- Descripción

Muestra u oculta el cuadro de dialogo

- Sintaxis

```java
dialog.setVisible(true);
```

- Nota

Para el uso del metodo setVisible se debe instanciar JDialogs, posteriormente llamar la variable asignada y agregar .setVisible(true o false)

<sub> Crear un JDialog</sub>  
`JDialog dialog = new JDialog(frame, "Cuadro de Diálogo", true);`

<sub>Agregar setVisible </sub>  
`dialog.setVisible("true");`

- Ejemplo:coffee:

[setVisible]( https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogVisibilityExample.java)

---

> :beginner: **setDefaultCloseOperation()**

- Descripción

Configura el comportamiento de cierre del cuadro de diálogo. Puedes establecer si el cuadro de diálogo debe ocultarse, eliminarse o no hacer nada cuando se cierre.

- Sintaxis

```java
setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
```

```java
setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
```

```java
setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
```

- Nota

La constante `setDefaultCloseOperation` toma un valor de tipo `int` que puede ser uno de los siguientes:

- `JDialog.DO_NOTHING_ON_CLOSE`: No se realiza ninguna acción cuando el usuario intenta cerrar el diálogo.
- `JDialog.HIDE_ON_CLOSE`: El diálogo se oculta pero no se destruye cuando el usuario intenta cerrarlo.
- `JDialog.DISPOSE_ON_CLOSE`: El diálogo se cierra y se destruye cuando el usuario intenta cerrarlo. Esto libera todos los recursos asociados al diálogo.

Crear un JDialog  
`JDialog dialog = new JDialog();`

Agregar setTitle  
`dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);`

- Ejemplo:coffee:

[DO_NOTHING_ON_CLOSE](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetDefaultCloseOperation.java)

[HIDE_ON_CLOSE](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetDefaultCloseOperationHIDE.java)

[DISPOSE_ON_CLOSE](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetDefaultCloseOperationDISPOSE.java)

---

> :beginner: **setTitle()**

- Descripción

Establece el título del cuadro de diálogo.

- Sintaxis

```java
dialog.setTitle("Titulo personalizado");
```

- Nota

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setTitle("Titulo Personalizado")

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setTitle("Titulo de JDialog Personalizado");`

- Ejemplo:coffee:

[setTitle](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetTitle.java)

---

> :beginner: **pack()**

- Descripción

 Redimensiona automáticamente el cuadro de diálogo para que se ajuste al contenido que contiene.

- Sintaxis

```java
dialog.pack();
```

- Nota

El método `pack()` se utiliza en un JDialog de la misma manera que se utiliza en un `JFrame`. Su propósito es ajustar automáticamente el tamaño del diálogo para que se ajuste a su contenido de manera adecuada, lo que significa que el diálogo tomará el tamaño mínimo necesario para mostrar todos los componentes internos de manera adecuada.

Para el uso del metodo pack se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .pack();

Crear un JDialog  
`JDialog dialog = new JDialog(frame,"JDialog", true);`

Agregar setVisible  
`dialog.pack();`

- Ejemplo:coffee:

[pack](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogpack.java)

---

> :beginner: **setLayout(LayoutManager manager)**

- Descripción

Establece el administrador de diseño del panel para controlar la disposición de los componentes anexados al panel, entre los mas utilizados son : `FlowLayout|GridLayout|BorderLayout`

- Sintaxis

Se puede utilizar de 2 maneras

1. Creando la instancia de layout manager y asignando el nombre de la variable donde se guardo la instancia

```java
GridLayout diseno = new GridLayout(3, 3);
dialog.setLayout(diseno);
```

Agregando directamente al panel mediante la instancia

```java
JDialog dialog = new JDialog(frame,"JDialog" ,false);
dialog.setLayout(new FlowLayout());
```

- Nota

Establece el administrador de diseño del panel para controlar la disposición de los componentes anexados al JDialog, entre los mas utilizados son : `FlowLayout|GridLayout|BorderLayout`

1. **FlowLayout**

*Organiza los componentes en una fila horizontal o vertical, ajustándolos automáticamente a medida que se agregan. Es útil para diseños simples de una fila o una columna de componentes.*

2. **BorderLayout**

*Divide el contenedor en cinco áreas: norte, sur, este, oeste y centro. Cada área puede contener un solo componente, y los componentes se expanden para llenar su área asignada.*

3. **GridLayout**

*Organiza los componentes en una cuadrícula de filas y columnas de tamaño fijo. Todos los componentes en un GridLayout tienen el mismo tamaño.*

- Ejemplo:coffee:

[FlowLayout](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialoFlowLayout.java)

[BorderLayout](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogBorderLayout.java)

[GridLayout](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogGridLayout.java)

---

> :beginner: **setResizable()**

- Descripción

Permite o deshabilita la capacidad de redimensionar el cuadro de diálogo por parte del usuario.

- Sintaxis

```java
dialog.setResizable(true);
```

- Nota

Si estableces `resizable` en `true`, el usuario podrá ajustar el tamaño del diálogo mediante la manipulación de los bordes o esquinas de la ventana del diálogo. Si estableces `resizable` en `false`, el usuario no podrá redimensionar el diálogo.

Por defecto, la mayoría de los `JDialogs` son redimensionables, lo que significa que `setResizable(true)` es el comportamiento predeterminado.

Para el uso del metodo setTitle se debe instanciar JDialog, posteriormente llamar la variable asignada y agregar .setResizable(true);

Crear un JDialog  
`JDialog dialog = new JDialog(frame,"Ejemplo JDialog");`

Agregar setResizable  
`dialog.setResizable(true);`

- Ejemplo:coffee:

[setResizable](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetresizable.java)

---

> :beginner: **setModalityType()**

- Descripción

Este método permite especificar cómo el diálogo interactúa con otras ventanas y componentes de la aplicación.

- Sintaxis

```java
dialog.setModalityType(ModalityType.APPLICATION_MODAL);
```

```java
dialog2.setModalityType(ModalityType.DOCUMENT_MODAL);
```

```java
dialog3.setModalityType(ModalityType.MODELESS);
```

- Nota

El método `setModalityType` toma un argumento del tipo `Dialog.ModalityType`, que puede ser uno de los siguientes:

1. **Dialog.ModalityType.APPLICATION_MODAL**: Este tipo de modalidad hace que el diálogo sea modal para su aplicación, lo que significa que bloqueará la interacción con otras partes de la aplicación mientras esté abierto. El usuario debe cerrar el diálogo antes de poder interactuar con otras ventanas de la misma aplicación.

2. **Dialog.ModalityType.DOCUMENT_MODAL**: Este tipo de modalidad hace que el diálogo sea modal solo para el documento principal de la aplicación, lo que significa que bloqueará la interacción con otras ventanas del mismo documento principal mientras esté abierto.

3. **Dialog.ModalityType.MODELESS**: Este tipo de modalidad hace que el diálogo sea no modal, lo que significa que no bloqueará la interacción con otras partes de la aplicación mientras esté abierto. El usuario puede interactuar con otras ventanas y componentes mientras el diálogo está en pantalla.
- Ejemplo:coffee:

[setModalityType](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetModalityType.java)

---

> :beginner: **dispose()**

- Descripción

Libera los recursos utilizados por el cuadro de diálogo cuando ya no se necesita

- Sintaxis

```java
dialog.dispose();
```

- Nota

el método `dispose()` es un método que se utiliza para liberar los recursos asociados a la ventana y cerrarla de manera apropiada. Cuando se llama al método `dispose()` en un `JDialog`, se realizan varias acciones importantes:

1. Se liberan los recursos de memoria utilizados por la ventana de diálogo y sus componentes, lo que ayuda a prevenir posibles fugas de memoria.

2. La ventana de diálogo se cierra y ya no es visible.

3. Se notifica al sistema de ventanas (en el sistema operativo subyacente) que la ventana de diálogo debe ser eliminada, lo que puede liberar recursos adicionales del sistema.
- Ejemplo:coffee:

[dispose](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogdispose.java)

---

> :beginner:**add()**

- Descripción

Se utiliza para agregar componentes gráficos (como botones, etiquetas, campos de texto, etc.

- Sintaxis

```java
dialog.add(componente);
```

- Nota

Donde `dialog` es un objeto de tipo `JDialog`, y `componente` es el componente gráfico que deseas agregar al diálogo.

Por ejemplo, para agregar una etiqueta (`JLabel`) al diálogo:

`JDialog dialog = new JDialog();`

`JLabel label = new JLabel("Hola, mundo!");`

`dialog.add(label);`

- Ejemplo:coffee:

[add](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogadd.java)

---

> :beginner: **setVisible()**

- Descripción

Es un método utilizado para cambiar la visibilidad de un componente gráfico, como un `JDialog`.

- Sintaxis

```java
dialog.setVisible(true);
```

- Nota

Este método toma un argumento booleano, que especifica si se debe mostrar (`true`) o ocultar (`false`) el componente. Cuando se llama a `setVisible(true)` en un `JDialog`, la ventana de diálogo se muestra en la pantalla y se vuelve interactiva para el usuario. Por otro lado, si se llama a `setVisible(false)`, la ventana se oculta y ya no es visible para el usuario.

Crear un JDialog

`JDialog dialog = new JDialog(frame, "Mi JDialog", true);`

Agregar el metodo setVisible

`dialog.setVisible(true);`

- Ejemplo:coffee:

[setVisible](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetVisible.java)

---

> :beginner: **setLocationRelativeTo()**

- Descripción

Propiedad que especifica un componente relativo al cual se posicionará el cuadro de diálogo.

- Sintaxis

```java
dialog.setLocationRelativeTo(null);
```

- Nota

La forma más común de usar `setLocationRelativeTo` es proporcionar una referencia al componente o ventana con respecto a la cual deseas posicionar la ventana de diálogo. El método calculará automáticamente la posición de la ventana de diálogo de manera que esté centrada con respecto a ese componente de referencia.

Crear un JDialog  
`JDialog dialog = new JDialog(frame, true);`

Agregar setVisible  
`dialog.setLocationRelativeTo(null);`

Cuando utilizas `.setLocationRelativeTo(null)` en un `JDialog`, estás configurando la posición de la ventana de diálogo de tal manera que se centre en el medio de la pantalla en lugar de en relación con otro componente específico, como una ventana principal.

En otras palabras, al pasar `null` como argumento a `setLocationRelativeTo`, le estás indicando al sistema que la ventana de diálogo debe aparecer en el centro de la pantalla independientemente de la ubicación de otras ventanas o componentes en la interfaz de usuario. Esto es útil cuando deseas que la ventana de diálogo sea independiente y aparezca en el centro de la pantalla sin importar la posición de otras ventanas.

- Ejemplo:coffee:

[setLocationRelativeTo](https://github.com/meditux27/JDialog-JavaSwing/blob/main/Example/JDialogsetLocationRelativeTo.java)

---
