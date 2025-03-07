# Refactorisation selon SOLID

## 1. Responsabilité unique (SRP)
### Problème
- BookStore gère tout : livres, commandes, notifications.

### Solution
- Séparation en classes distinctes :
  - BookStore pour gérer les livres
  - OrderProcessor pour traiter les commandes
  - NotificationService pour envoyer les notifications

### Amélioration
- Code plus clair et facile à modifier.

---

## 2. Ouvert/Fermé (OCP)
### Problème
- Impossible d’ajouter de nouveaux types de livres sans modifier BookStore.

### Solution
- Création d’une classe Book avec :
  - PhysicalBook
  - EBook
  - AudioBook

### Amélioration
- Ajout de nouveaux types de livres sans modifier le code.

---

## 3. Substitution de Liskov (LSP)
### Problème
- Book ne permet pas une gestion flexible des sous-types.

### Solution
- Création d’une classe Book avec des sous-classes :
  - PhysicalBook
  - EBook
  - AudioBook

### Amélioration
- Cohérence et flexibilité améliorées.

---

## 4. Ségrégation des interfaces (ISP)
### Problème
- UserActions oblige Admin et Customer à implémenter des méthodes inutiles.

### Solution
- Création d’interfaces spécifiques :
  - BorrowActions pour emprunter/rendre un livre
  - ReviewActions pour laisser un avis
  - AdminActions pour gérer les livres

### Amélioration
- Chaque classe ne contient que les méthodes nécessaires.

---

## 5. Inversion des dépendances (DIP)
### Problème
- BookStore dépend directement d’un service email.

### Solution
- Création d’une interface NotificationService.
- EmailNotificationService implémente cette interface.

### Amélioration
- Facilité d’ajout d’autres services de notification.

---

# Conclusion

### Avant
- Code monolithique difficile à modifier.
- Impossible d’ajouter de nouveaux types de livres et notifications sans tout changer.

### Après
- Code plus structuré et modulaire.
- Ajout de nouvelles fonctionnalités sans modifier les classes existantes.
