# 🎮 Juego del Ahorcado - Versión Web

Este proyecto es una versión web del clásico **Juego del Ahorcado**, desarrollado con Java y Spring Boot en el backend, y HTML/CSS/JavaScript en el frontend. Incluye arquitectura limpia aplicando principios **SOLID**, interfaz amigable y soporte para palabra personalizada.

---

## 🚀 Características

- ✅ Lógica de juego basada en Java puro
- ✅ API REST con Spring Boot
- ✅ Interfaz web moderna y responsiva
- ✅ Estilo limpio con CSS personalizado
- ✅ Permite ingresar palabra personalizada
- ✅ Separación de capas (modelo, servicio, controlador)

---

## 🧠 Tecnologías usadas

| Backend        | Frontend     | Herramientas    |
|----------------|--------------|-----------------|
| Java 17+       | HTML5        | Git + GitHub    |
| Spring Boot    | CSS3         | VS Code         |
| Maven          | JavaScript   | Postman (opcional) |

---

## 📁 Estructura del proyecto

juego-ahorcado/
├── src/
│ ├── main/
│ │ ├── java/com/vrdark33/ahorcado/
│ │ │ ├── model/JuegoAhorcado.java
│ │ │ ├── service/GameService.java
│ │ │ ├── controller/GameController.java
│ │ │ └── AhorcadoApplication.java
│ │ └── resources/
│ │ ├── static/
│ │ │ ├── index.html
│ │ │ └── style.css
│ │ └── application.properties

---

## 🛠️ Cómo ejecutar el proyecto

### 1. Clona el repositorio

git clone https://github.com/tuusuario/juego-ahorcado-web.git
cd juego-ahorcado-web

2. Ejecuta el proyecto con Maven
./mvnw spring-boot:run

3. Abre el navegador
http://localhost:8080

---

🧪 Cómo jugar
1. Adivina letras escribiéndolas y haciendo clic en “Adivinar”.

2. Puedes reiniciar el juego con el botón “Reiniciar”.

3. También puedes iniciar un nuevo juego ingresando una palabra personalizada.
   
---

🎯 Próximas mejoras (ideas)
Mostrar imagen del ahorcado según errores

Guardar historial de letras usadas

Añadir alertas de victoria o derrota

Hacerlo multiplayer (uno escribe palabra, otro adivina)

Animaciones visuales y sonidos

---

👨‍💻 Autor
Brayan Sánchez (VRDARK33)
📧 brayan54sd@gmail.com


---
📝 Licencia
Este proyecto es de libre uso con fines educativos y profesionales. ¡No olvides dar crédito si te ayudó!
---

## 📸 Vista previa

![Captura del juego](assets/image.png)

