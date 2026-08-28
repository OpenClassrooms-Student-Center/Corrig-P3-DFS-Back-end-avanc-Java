# Erreurs fréquentes

1. Mettre la logique d'emprunt dans le contrôleur au lieu du service.
2. Oublier de refuser un équipement indisponible.
3. Ne pas effacer l'emprunteur lors du retour.
4. Retourner `200` avec une exception non traitée pour un équipement inconnu.
5. Oublier `@Valid` sur le DTO.
6. Envoyer un mauvais verbe HTTP depuis le frontend.
7. Oublier l'en-tête `Content-Type` pour le body JSON.
8. Laisser le frontend appeler une URL différente de celle du proxy.
9. Ne tester que le cas nominal.
10. Exposer le message interne d'une exception au client.