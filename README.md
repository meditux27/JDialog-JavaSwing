# JDialog - JavaSwing

<img title="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR__OoKLbDv-WH9nPOPVa3F8mR4qjnZhnsGCw&usqp=CAU" alt="" data-align="inline" width="354">

##### Un JDialog se utiliza para crear y mostrar cuadros de diálogo en aplicaciones de escritorio.

##### Un cuadro de diálogo es una ventana emergente que generalmente se utiliza para interactuar con el usuario de manera modal, lo que significa que el usuario debe completar la interacción con el cuadro de diálogo antes de volver a interactuar con la ventana principal de la aplicación



---

[Estructura basica](https://github.com/meditux27/JFrame-JavaSwing/blob/main/principal/MiVentana.java)

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

> :beginner: setTitle

- Descripción

Establece el título de la ventana 

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

<sub> Crear un JFrame</sub>  
`JFrame frame = new JFrame();`

<sub>Agregar setTitle </sub>  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[ setTitle]( https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

[setTitle2](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample2.java)

---

> :beginner: setSize(int width, int height)

- Descripción

Establece el tamaño inicial de la ventana en píxeles

- Sintaxis

frame.setSize(800,600);

- Nota

Para el uso del metodo setSize se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setSize(400,400)

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setSize(400,400);`

- Ejemplo

[setSize](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetSize.java)

---
