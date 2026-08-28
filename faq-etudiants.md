# FAQ EquipIT

## Pourquoi un service ?

Le service porte les règles métier afin qu'elles soient réutilisables par HTTP et testables indépendamment du contrôleur.

## Pourquoi un DTO ?

Le DTO décrit le contrat de la requête sans exposer la structure de persistance.

## Quelle commande lance les tests ?

`mvn test` depuis la racine du backend.

## Où voir l'API ?

Après démarrage du backend, ouvrir `/swagger-ui.html`.

## Pourquoi le proxy Vite ?

Il permet au client de demander `/api` pendant le développement sans coder une URL de backend dans chaque appel.