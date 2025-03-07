# Refactorisation selon SOLID

## 1. Responsabilité unique (SRP)
### Problème
- La classe BookStore gère tout : livres, commandes, notifications.

### Solution
- Séparation en plusieurs classes :
    - BookStore pour la gestion des livres
    - OrderProcessor pour les commandes
    - NotificationService pour les notifications

### Amélioration
- Code plus clair et plus facile à modifier.

---

## 2. Ouvert/Fermé (OCP)
### Problème
- Impossible d’ajouter des e-books ou audiobooks sans modifier BookStore.

### Solution
- Création d’une classe Book avec des sous-classes :
    - PhysicalBook
    - EBook
    - AudioBook
- La méthode addBook accepte tous les types de livres.

### Amélioration
- Ajout de nouveaux types de livres sans modifier le code existant.

---

## 3. Substitution de Liskov (LSP)
### Problème
- Book ne permet pas une gestion cohérente des sous-types.

### Solution
- Création d’une classe Book et de sous-classes :
    - PhysicalBook
    - EBook
    - AudioBook
- Chaque sous-classe fonctionne comme un Book classique.

### Amélioration
- Les sous-classes remplacent Book sans problème.

---

## 4. Ségrégation des interfaces (ISP)
### Problème
- L’interface UserActions impose des méthodes inutiles :
    - Admin doit implémenter borrowBook et returnBook.
    - Customer doit implémenter addBookToStore et removeBookFromStore.

### Solution
- Division en plusieurs interfaces :
    - BorrowActions pour emprunter et rendre un livre
    - ReviewActions pour ajouter un avis
    - AdminActions pour gérer les livres

### Amélioration
- Chaque classe implémente seulement ce dont elle a besoin.

---

## 5. Inversion des dépendances (DIP)
### Problème
- BookStore dépend directement d’un service d’email.

### Solution
- Création d’une interface NotificationService.
- EmailNotificationService implémente cette interface.
- OrderProcessor utilise NotificationService sans dépendre d’un type précis.

### Amélioration
- Possibilité d’ajouter d’autres types de notifications sans modifier OrderProcessor.

---

# Conclusion

### Avant
- Une seule classe gérait tout.
- Code difficile à modifier.
- Impossible d’ajouter de nouveaux types de livres ou de notifications facilement.

### Après
- Chaque classe a une seule responsabilité.
- Ajout facile de nouveaux types de livres et services.
- Code plus clair et évolutif.
