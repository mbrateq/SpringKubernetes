# Technologie Komputerowe - projekt zaliczeniowy
#### Autor: Marcin Bratek 198696
### Aplikacja SpringKubernetes
Aplikacja jest zrealizowana w formie rest api opartego o springBoot z bazą danych h2 i generycznym interfejsem do testów zbudowanym przy użyciu openApi.

### 1. Instrukcja budowy aplikacji
Zbudowana wersja aplikacji znajduje się w ścieżce _/target/SpringKubernetes-<version-suffix>.jar_ .
#### Wymagania:
* java 11 (openjdk)
* maven
<br>
Aby zbudować aplikacje należy w głównej ścieżce projektu wykonać polecenie:
`$ mvn clean install`. Wykonanie instrukcji spowoduje nadpisanie domyślnej lokalizacji wykonywalnego pliku javowego nowym plikiem.

### 2. Instrukcja budowy obrazu dockerowego
#### Wymagania:
* docker desktop
* Zbudowana wersja aplikacji w lokalizacji _./target/_
<br>
Aby zbudować obraz dockerowy należy w głównej ścieżce projektu wykonać polecenie `docker build -t mbakmf/technologie-kontenerowe`. 

#### 3. Instrukcja wdrożenia aplikacji na kubernetesa
#### Wymagania:
* docker desktop
* kubernetes (domyślna konfiguracja ćwiczenia zakłada wdrożenie na środowisku lokalnym).
* Obraz dockerowy aplikacji (zbudowany lokalnie lub automatycznie pobrany z repozytorium).
<br>
Uruchomienie aplikacji na kubernetesie na podstawie pliku konfiguracyjnego poleceniem `$ kubectl apply -f deployment.yaml`

#### Weryfikacja
Aplikacja udostępniona jest pod adresem `http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config` na porcie 8080. W wypadku uruchamiania aplikacji na innym porcie należy nadpisać konfigurację projektu.



