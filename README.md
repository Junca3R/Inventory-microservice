# 📦 Inventory Service

> 🚀 Microservicio REST desarrollado con **Java** y **Spring Boot** para la gestión de productos de inventario mediante una API RESTful.

---

## 📝 Descripción

**Inventory Service** es un microservicio backend diseñado para gestionar información relacionada con productos de inventario.

El proyecto implementa una arquitectura organizada por capas, separando las responsabilidades de cada componente para mantener un código limpio, escalable y fácil de mantener.

Este proyecto fue desarrollado como parte de mi práctica y aprendizaje en el desarrollo de aplicaciones backend con **Java y Spring Boot**, aplicando conceptos fundamentales del desarrollo de microservicios y APIs REST.

---

## 🛠️ Tecnologías utilizadas

* ☕ **Java**
* 🌱 **Spring Boot**
* 🌐 **Spring Web**
* 🧩 **Spring Data JPA**
* 📦 **Maven**
* 🛠️ **Lombok**
* 🔀 **Git**
* 🐙 **GitHub**

---

## 🏗️ Arquitectura del proyecto

El proyecto utiliza una arquitectura por capas para separar las diferentes responsabilidades de la aplicación:

```text
src
└── main
    └── java
        └── com.inventory
            │
            ├── controller
            │   └── ProductController
            │
            ├── model
            │   └── Product
            │
            ├── repository
            │   └── ProductRepository
            │
            └── service
                └── ProductService
```

### 📌 Controller

Se encarga de recibir las peticiones HTTP y exponer los endpoints de la API REST.

### ⚙️ Service

Contiene la lógica de negocio de la aplicación y se comunica con el repositorio.

### 🗃️ Repository

Se encarga del acceso y gestión de los datos de los productos.

### 📦 Model

Representa la estructura de los productos que maneja el microservicio.

---

## 📋 Modelo Product

El microservicio trabaja con la siguiente información:

```text
Product
├── id
├── name
├── description
├── price
└── stock
```

---

## 🔗 Endpoints

### 📋 Obtener todos los productos

```http
GET /api/products/path
```

Obtiene la lista de productos disponibles.

---

### 🔍 Obtener un producto por ID

```http
GET /api/products/{id}
```

Ejemplo:

```http
GET /api/products/1
```

Obtiene la información de un producto específico.

---

### ➕ Crear un producto

```http
POST /api/products/path
```

Ejemplo de solicitud:

```json
{
    "name": "Mouse Logitech",
    "description": "Mouse inalámbrico",
    "price": 85000,
    "stock": 20
}
```

---

### 🗑️ Eliminar un producto

```http
DELETE /api/products/{id}
```

Ejemplo:

```http
DELETE /api/products/1
```

Elimina un producto utilizando su identificador.

---

## 🚀 Ejecución del proyecto

### 1️⃣ Clonar el repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
```

### 2️⃣ Entrar al proyecto

```bash
cd inventory-service
```

### 3️⃣ Ejecutar la aplicación

Desde Maven:

```bash
./mvnw spring-boot:run
```

O desde el IDE ejecutando la clase principal de Spring Boot.

---

## 🌐 URL base

Una vez iniciada la aplicación, el microservicio estará disponible en:

```text
http://localhost:8082
```

---

## 🧪 Pruebas

Los endpoints pueden probarse utilizando herramientas como:

* Postman
* Insomnia
* Thunder Client
* REST Client

---

## 🎯 Objetivos de aprendizaje

Este proyecto fue creado con el objetivo de practicar y reforzar conocimientos en:

* Desarrollo de APIs REST.
* Arquitectura por capas.
* Creación de microservicios con Spring Boot.
* Manejo de controladores REST.
* Inyección de dependencias.
* Uso de servicios y repositorios.
* Operaciones CRUD.
* Manejo de peticiones HTTP.
* Uso de Git y GitHub.
* Organización y estructura de proyectos backend.

---

## 📚 Próximas mejoras

Algunas funcionalidades que podrían incorporarse en futuras versiones:

* [ ] Implementar DTOs.
* [ ] Agregar validaciones con Bean Validation.
* [ ] Implementar manejo global de excepciones.
* [ ] Agregar Swagger / OpenAPI.
* [ ] Implementar paginación y filtros.
* [ ] Agregar autenticación y autorización.
* [ ] Integrar una base de datos.
* [ ] Contenerizar la aplicación con Docker.
* [ ] Integrar el microservicio con otros servicios.

---

## 👨‍💻 Autor

**Oscar Junca**

💻 Junior Java Backend Developer

Este proyecto forma parte de mi proceso de aprendizaje y práctica en el desarrollo backend con **Java, Spring Boot y arquitectura de microservicios**.

---

⭐ Si este proyecto te resulta interesante, ¡no dudes en darle una estrella al repositorio!
