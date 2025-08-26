<TextView
    android:id="@+id/lblMensaje"                <!-- Define un ID único para referenciar esta vista desde código o desde otras constraints -->
    android:layout_width="wrap_content"         <!-- Ancho se ajusta al contenido del texto -->
    android:layout_height="wrap_content"        <!-- Alto se ajusta al contenido del texto -->
    android:text="Escribe un mensaje"           <!-- Texto que se mostrará en pantalla -->
    android:textColor="@android:color/holo_green_light" <!-- Color del texto usando un color predefinido de Android -->
    android:textSize="48sp"                     <!-- Tamaño del texto en sp (unidad escalable para accesibilidad) -->
    app:layout_constraintTop_toTopOf="parent"   <!-- Ancla la parte superior del TextView al top del ConstraintLayout padre -->
    app:layout_constraintStart_toStartOf="parent" <!-- Ancla el inicio (izquierda en LTR) del TextView al inicio del padre -->
    app:layout_constraintEnd_toEndOf="parent" /> <!-- Ancla el fin (derecha) del TextView al fin del padre, esto lo centra horizontalmente -->

<EditText
    android:id="@+id/txtMensaje"                <!-- ID para referenciar el campo de entrada de texto -->
    android:layout_width="wrap_content"         <!-- Ancho se ajusta al contenido -->
    android:layout_height="wrap_content"        <!-- Alto se ajusta al contenido -->
    android:hint="Escribe un mensaje"           <!-- Texto que se muestra cuando el campo está vacío -->
    android:minWidth="48dp"                      <!-- Ancho mínimo del campo (para cumplir tamaño touch target) -->
    android:minHeight="48dp"                     <!-- Alto mínimo del campo (para tamaño touch-friendly) -->
    app:layout_constraintTop_toBottomOf="@id/lblMensaje" <!-- Ubica este EditText justo debajo del TextView lblMensaje -->
    app:layout_constraintStart_toStartOf="parent" <!-- Ancla inicio al inicio del padre -->
    app:layout_constraintEnd_toEndOf="parent" /> <!-- Ancla fin al fin del padre, centrándolo horizontalmente -->

<Button
    android:id="@+id/btn"                        <!-- ID para el botón que cambiará el color del texto -->
    android:layout_width="wrap_content"          <!-- Ancho se ajusta al contenido del texto del botón -->
    android:layout_height="wrap_content"         <!-- Alto se ajusta al contenido -->
    android:backgroundTint="@color/black"        <!-- Color de fondo del botón usando recurso definido en colors.xml -->
    android:text="Cambia el color del texto"     <!-- Texto que se muestra dentro del botón -->
    android:textColor="@color/white"             <!-- Color del texto dentro del botón -->
    app:layout_constraintTop_toBottomOf="@id/txtMensaje" <!-- Ubica este botón debajo del EditText -->
    app:layout_constraintStart_toStartOf="parent"        <!-- Alinea el inicio del botón con el inicio del padre -->
    app:layout_constraintEnd_toEndOf="parent" />         <!-- Alinea el fin del botón con el fin del padre, centrando el botón -->

<Button
    android:id="@+id/btnInvertir"               <!-- ID para el segundo botón que invertirá el texto -->
    android:layout_width="wrap_content"         <!-- Ancho se ajusta al contenido -->
    android:layout_height="wrap_content"        <!-- Alto se ajusta al contenido -->
    android:backgroundTint="@color/black"       <!-- Color de fondo negro -->
    android:text="Invierte el texto"            <!-- Texto que se muestra en el botón -->
    android:textColor="@color/white"            <!-- Color del texto dentro del botón -->
    app:layout_constraintTop_toBottomOf="@id/btn" <!-- Ubica este botón justo debajo del primer botón -->
    app:layout_constraintStart_toStartOf="parent" <!-- Alinea inicio al inicio del ConstraintLayout padre -->
    app:layout_constraintEnd_toEndOf="parent" />  <!-- Alinea fin al fin del padre, centrando el botón -->