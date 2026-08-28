# EquipIT - Solution de référence

Cette version implémente le fil rouge EquipIT avec un backend Java 25 / Spring Boot 4.0 et un client React / TypeScript.

## Architecture

- `src/main/java/com/equipit/EquipitApplication.java` : démarrage Spring Boot.
- `equipment/Equipment.java` : entité JPA et transitions d'état métier.
- `equipment/EquipmentRepository.java` : accès SQLite via Spring Data.
- `equipment/EquipmentService.java` : règles d'emprunt et de retour.
- `equipment/EquipmentController.java` : contrat REST.
- `equipment/EquipmentExceptionHandler.java` : réponses d'erreur publiques.
- `frontend/` : client React avec proxy Vite vers l'API.

## Vérification

```bash
mvn test
cd frontend && npm install && npm run build
```

La validation doit être exécutée dans un environnement disposant du JDK 25, de Maven et de Node.js LTS.