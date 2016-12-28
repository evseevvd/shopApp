# shopApp
Некоторой компании требуется разработать программное обеспечение, позволяющее пользователю формировать заказы на основе списка продуктов компании.

#Структура БД
* БД H2
* Таблицы
  * Товар (ID, Код товара, Нименование, Поставщик, Категория, кол-во, цена, Производитель)
  * Поставщик (ID, Наименование, Юр. адрес, контактная информация)
  * Категория (ID, Наименование)
  * Производитель (ID, Наименование, Страна)
  * Заказ (ID, Клиент, Товар, кол-во, цена, статус)
  * Клиент (ID, ФИО, Адрес, Телефон, Email)
 
#Архитектура приложения

* Сервис слой - слой для работы с БД (чтение, запись, удаление, поиск)
* Бизнес слой - слой бизнес логики, (агрегация сервисов, работа с ДТО)
* Веб слой - REST сервис (работа с JSON).

# Сборка и запуск проекта
   gradle runApp
 1. Прольет все миграции
 2. Соберет war
 3. Развернет в контейнере
 4. http://localhost:11080/shopApp
 
 # P.S.
  Хотелось бы покрыть тестами интеграционными

# Трудозатраты
 * Проектирование - 6 часов
 * Разрабоотка - 12 часов
   * Создание БД и таблиц - 1 час
   * Инфраструктура проетка (скрипт сборки, зависимосто, flyway и т.д.) - 3 часа
   * Настройка и разработка приложения - 8 часов
