# Exercice 1 : Fonctionnalités back-end maintenables

## Objectif pédagogique

Implémenter les transitions d'état d'un équipement dans un service métier testable.

## Étape 1 : Modèle métier

`Equipment` représente le matériel, sa disponibilité, son emprunteur et ses dates. Les opérations `borrow` et `returnEquipment` regroupent les changements d'état cohérents.

## Étape 2 : Service

`EquipmentService` recherche l'équipement, vérifie les préconditions, applique la transition puis persiste l'entité. Une seule méthode privée centralise la recherche et le cas introuvable.

## Étape 3 : Tests

Les tests couvrent l'emprunt d'un équipement disponible, le refus d'un équipement déjà emprunté, le retour et l'identifiant inconnu. La commande de référence est `mvn test`.

## Récapitulatif

Le service respecte la séparation des responsabilités et les règles métier sont vérifiées sans démarrer le serveur web.