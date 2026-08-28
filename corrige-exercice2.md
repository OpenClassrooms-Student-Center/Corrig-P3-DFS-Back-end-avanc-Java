# Exercice 2 : API REST et intégration

## Objectif pédagogique

Structurer le backend en couches et exposer un contrat REST consommable par un client web.

## Étape 2.1 : Contrôleur

`EquipmentController` expose `GET /api/equipment`, `PUT /api/equipment/{id}/borrow` et `PUT /api/equipment/{id}/return`. Il délègue toute la logique au service.

## Étape 2.2 : Validation et erreurs

`BorrowRequest` impose des noms non vides. Les exceptions métier sont converties en réponses `404` ou `400`, sans exposer le détail interne au client.

## Étape 2.3 : Frontend

Le client React charge la liste, envoie le DTO d'emprunt et déclenche le retour. Vite relaie `/api` vers le backend pendant le développement.

## Étape 2.4 : Vérification

Tester les routes avec Swagger UI, puis lancer le client et vérifier les parcours de consultation, emprunt et retour.

## Récapitulatif

Le contrat HTTP reste volontairement limité aux opérations prévues par le projet.