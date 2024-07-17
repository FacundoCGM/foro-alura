# FOROALURA

_Aplicación en la que se pueden subir, visualizar, actualizar, modificar y eliminar posts a un foro siempre y cuando se cuente con los permisos necesarios ._

## Comenzando 🚀

_Por favor para utilizar descargue los archios de este repositorio, abralos en su IDE de preferencia y corra el programa._

### Pre-requisitos 📋

_Es importante para que el programa funcione tener instalado en su computador JAVA, al igual que las requeridas dependencias. Tambien será necesario algun programa que le permita manipular bases de datos, y de preferencia algúna plataforma API como postman._

## Ejecutando las funcionalidades ⚙️

_Para poder visualizar las funcionalidades de este programa se recomienda usar una aplicación para API testing del estilo de postman donde podra probar las siguientes funcionalidades:_

_Subir un post a nuestro foro a través del método PUT, en el endpoint "/topicos" pasando el JSON correspondiente a través del body._

_Visualizar todos los posts de nuestro foro a través del metodo GET en el mismo endpoint, o un post en específico en el endpoint "/topicos/{id}"._

_Eliminar un post de nuestro foro a través del método DELETE en el endpoint "/topicos/{id}"._

_Modificar uno de los posts ya realziados a través del metodo PUT, en el endpoint "/topicos", siempre y cuando se pase el JSON correcto por el body._

_Cabe aclarar que para poder realizar todas estas operaciones usted debe primero generar un usuario y una clave en la base de datos correspondiente, así poder conseguir los permisos necesarios en el endpoint "/login"._

## Autor ✒️

* **Facundo Gaitan** - *Desarrollador* - [FacundoCGM](https://github.com/FacundoCGM)