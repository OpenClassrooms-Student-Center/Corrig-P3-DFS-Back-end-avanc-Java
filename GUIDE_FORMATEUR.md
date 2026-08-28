# Guide formateur - EquipIT

## Avant la séance

Vérifier que l'apprenant sait lancer `mvn test`, démarrer Spring Boot et ouvrir le client frontend.

## Déroulé conseillé

1. Lui faire expliquer le rôle de l'entité, du repository, du service et du contrôleur.
2. Lui faire décrire les préconditions d'un emprunt et les effets d'un retour.
3. Vérifier les tests nominaux et les tests d'erreur.
4. Tester les trois routes REST avec Swagger.
5. Demander une démonstration du parcours frontend complet.

## Questions de compréhension

- Où doit vivre une règle métier ?
- Pourquoi l'injection par constructeur est-elle utilisée ?
- Quel code HTTP correspond à une ressource absente ?
- Que se passe-t-il si le frontend envoie des noms vides ?

## Limites du périmètre

L'application ne demande ni authentification ni CRUD complet : ce choix correspond au périmètre guidé du P3 et doit être explicitement distingué d'une API de production.