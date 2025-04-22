**[PL] Projekt domowy dla stażysty 2025 | [EN] Home Assignment for Intern 2025**

## 📌 Opis / Description

Aplikacja webowa zbudowana w oparciu o **Spring Boot**, umożliwiająca:

- Wczytanie danych z pliku **Excel (.xlsx)** zawierającego kody SWIFT banków
- Zapis danych do bazy danych **H2 (in-memory)**
- Udostępnienie REST API do operacji na danych (pobieranie, dodawanie, usuwanie)
- Panel developerski z konsolą H2: `http://localhost:8080/h2-console`

---

## 🚀 Uruchomienie / How to Run

1. Uruchom projekt jako aplikację Spring Boot (`SwiftApp.java`)
2. Aplikacja automatycznie wczyta dane z pliku `Interns_2025_SWIFT_CODES.xlsx`
3. Baza danych: `jdbc:h2:mem:testdb`, login: `SA`, hasło: *(brak)*

---

## 🔗 Endpointy

| Metoda | Endpoint                       | Opis                              |
|--------|--------------------------------|-----------------------------------|
| GET    | `/swift-codes/{code}`          | Pobierz bank po kodzie SWIFT      |
| GET    | `/swift-codes/country/{iso2}`  | Pobierz banki z danego kraju      |
| POST   | `/swift-codes`                 | Dodaj nowy rekord (JSON)          |
| DELETE | `/swift-codes/{code}`          | Usuń rekord po kodzie SWIFT       |
| GET    | `/debug/all`                   | Lista wszystkich rekordów         |
| GET    | `/debug/countries`             | Lista krajów z rekordami          |

---

## ✅ Testy

W katalogu `src/test/java` znajdują się testy JPA weryfikujące poprawność działania warstwy repozytorium.

---

## ⚙️ Technologie

- Java 17+ (działa na OpenJDK 23)
- Spring Boot 3.2+
- H2 Database
- Apache POI (Excel Reader)
- Maven

---

## ✍️ Autor

Maciej Dobranowski / 2025

