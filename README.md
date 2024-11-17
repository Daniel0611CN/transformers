<div style="text-align: center; color: #2c3e50;">
  <h1 style="font-size: 2.5em; margin: 0;">Generic Transformers Exercises</h1>
  <p style="font-size: 1.2em; font-style: italic;">Author: Daniel Clavijo Núñez</p>
</div>

---

<p style="text-align: center; color: #3498db; font-size: 1.1em;">
  🔗 <a href="https://github.com/toteabe/transformers.git" style="color: #3498db; text-decoration: none;">Repositorio en GitHub</a>
  |
  <a href="https://transformers-exercises.vercel.app" style="color: #3498db; text-decoration: none;">Explicación Ejercicios (Web Vercel)</a>
</p>

<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <h2 style="font-size: 1.8em; color: #2c3e50;">Índice</h2>
  <ul style="padding-left: 20px; color: #555; font-size: 1em;">
    <li><a href="#ejercicio-1" style="color: #3498db; text-decoration: none;">Ejercicio 1 - Transformer y Transformers</a></li>
    <li><a href="#ejercicio-2" style="color: #3498db; text-decoration: none;">Ejercicio 2 - Método applyDest en Transformers</a></li>
    <li><a href="#ejercicio-3" style="color: #3498db; text-decoration: none;">Ejercicio 3 - Joiner y Joiners</a></li>
    <li><a href="#ejercicio-4" style="color: #3498db; text-decoration: none;">Ejercicio 4 - Método zipArrayLists en Joiners</a></li>
    <li><a href="#ejercicio-5" style="color: #3498db; text-decoration: none;">Ejercicio 5 - Método transformList en Transformers</a></li>
    <li><a href="#ejercicio-6" style="color: #3498db; text-decoration: none;">Ejercicio 6 - Clase Multiplier y generalización de HelloAdder</a></li>
    <li><a href="#ejercicio-7" style="color: #3498db; text-decoration: none;">Ejercicio 7 - Interfaz genérica para Check</a></li>
    <li><a href="#ejercicio-8" style="color: #3498db; text-decoration: none;">Ejercicio 8 - Método fold en Joiners</a></li>
  </ul>
</div>

<h2 id="ejercicio-1" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 1 - Transformer y Transformers</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Examina el archivo <strong>Transformer.java</strong>, que define un tipo genérico sencillo, y <strong>Transformers.java</strong>, que contiene el método genérico estático <code>applyConst</code>. Este método aplica una transformación a cada elemento en un <code>ArrayList</code>. También se exploran <strong>TenTimes.java</strong> y <strong>UseTransformers1.java</strong> como demostraciones de cómo usar <code>applyConst</code> para multiplicar los valores en una lista.
  </p>
</div>

<h2 id="ejercicio-2" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 2 - Método applyDest en Transformers</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Añade el método <code>applyDest</code> en <strong>Transformers.java</strong>, que modifica directamente el <code>ArrayList</code> pasado como argumento, en lugar de crear uno nuevo.
  </p>
</div>

<h2 id="ejercicio-3" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 3 - Joiner y Joiners</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Revisa los archivos <strong>Joiner.java</strong>, <strong>JoinByAdding.java</strong>, y <strong>Joiners.java</strong>. Aquí, el método <code>zipLists</code> une dos listas usando el método <code>join</code> del objeto <code>Joiner</code> que recibe como argumento.
  </p>
</div>

<h2 id="ejercicio-4" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 4 - Método zipArrayLists en Joiners</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Implementa el método estático <code>zipArrayLists</code> en la clase <strong>Joiners</strong> para unir dos <code>ArrayLists</code> usando un objeto <code>Joiner</code>, de forma similar a <code>zipLists</code>.
  </p>
</div>

<h2 id="ejercicio-5" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 5 - Método transformList en Transformers</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Crea el método <code>transformList</code> en <strong>Transformers.java</strong>, que aplica una transformación a cada elemento en un <code>LispList</code>, usando un objeto <code>Transformer</code>.
  </p>
</div>

<h2 id="ejercicio-6" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 6 - Clase Multiplier y generalización de HelloAdder</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Revisa <strong>Multiplier.java</strong>, donde se implementa <code>Transformer&lt;Integer&gt;</code> y se permite establecer un valor multiplicador en el constructor. Generaliza <strong>HelloAdder</strong> para añadir cualquier saludo y prueba esta clase en los métodos de los ejercicios 2 y 5.
  </p>
</div>

<h2 id="ejercicio-7" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 7 - Interfaz genérica para Check</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Crea una interfaz genérica para objetos que implementen un método <code>check</code> que devuelva un booleano según una condición. Implementa algunas clases con esta interfaz, como una para verificar si un <code>Integer</code> es impar o si un <code>String</code> es menor que una longitud dada.
  </p>
</div>

<h2 id="ejercicio-8" style="font-size: 1.8em; color: #2c3e50;">Ejercicio 8 - Método fold en Joiners</h2>
<div style="background-color: #ecf0f1; padding: 15px; border-radius: 8px; margin: 10px 0;">
  <p style="font-size: 1em; color: #555; line-height: 1.6;">
    Implementa el método <code>fold</code> en <strong>Joiners</strong>, que toma un <code>ArrayList</code> y un objeto <code>Joiner</code> para unir todos los elementos en uno solo usando el método <code>join</code> del <code>Joiner</code>.
  </p>
</div>

--- 
