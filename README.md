# Resort Grand Line

## Integrantes
- Ramiro Garcia Suarez (51175)
- Carlos Chocobar (50968)
- Alesandroni, Valentino (51415).

## Descripción
El presente proyecto propone un sistema integral para la gestión de reservas de un complejo turístico con tematicas de one piece. La plataforma permite a los administradores diseñar y ofrecer paquetes ('Publicaciones') que combinan estadías con actividades recreativas y servicios adicionales. Los usuarios pueden explorar este catálogo y generar sus reservas de forma autónoma, mientras el sistema automatiza la cotización final y optimiza la asignación de recursos y coordinadores.

## DER

![Diagrama de Dominio](DER-Resort.jpeg)
## Checklist de Requerimientos

### Regularidad
| Requerimiento | Detalle |
| :--- | :--- |
| ABMC simple | 1. [usuario] <br> 2. [habitacion] <br> 3. [servicio] |
| ABMC dependiente | 1. [Recarga del consumo] <br> 2. [Creacion de actividades] |
| CU NO-ABMC | 1. [Control de cupos en actividades para inscribirse] <br> 2. [Reserva de paquete]|
| Listado simple | 1. [Actividades] <br> 2. [Habitaciones] <br> 2. [Servicio] |

### Aprobación Directa
| Requerimiento | Detalle |
| :--- | :--- |
| Todo ABMC | 1. [A terminar] |
| CU Nivel resumen | 1. [Ciclo de Estadía del Huésped] <br> 2. [Gestión Integral de Actividades]|
| Listado complejo | 1. [Lista habitaciones disponibles por fechas] |
| Nivel de acceso | 1. [invitado/usuario/administrador] |
| Manejo de errores |  [obligatorio] |
| Requerimiento extra obligatorio | 1. [Manejo de archivos] |
| publicar el sitio |  [Proximamente] |

