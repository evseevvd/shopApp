--Author Evseev V.
--Comment Наполнение таблицы 'Производители'
--Since 24.12.2016
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (1, 'ЗАО ВторМетСырьё', 'РОССИЯ');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (2, 'Cold Ltd.', 'США');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (3, 'Blizzard Co.', 'Канада');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (4, 'ООО Рога и копыта', 'РОССИЯ');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (5, 'ОАО ФирмаЛайн', 'РОССИЯ');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (6, 'Hotress', 'РОССИЯ');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (7, 'Ace Age', 'Чехия');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (8, 'ItaloCom', 'Италия');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (9, 'Speedyy', 'РОССИЯ');
INSERT INTO SHOP.PRODUCERS (ID, NAME, COUNTRY) VALUES (10, 'Craft Soft', 'Австралия');

--Author Evseev V.
--Comment Наполнение таблицы 'Категории товаров'
--Since 24.12.2016
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (1, 'Компьютеры и комплектующие');
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (2, 'Канцелярия');
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (3, 'Сантехника');
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (4, 'Радиотехника');
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (5, 'Электрика');
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (6, 'Товары для дома');
INSERT INTO SHOP.CATEGORIES (ID, NAME) VALUES (7, 'Автотовары');

--Author Evseev V.
--Comment Создание таблицы 'Поставщики'
--Since 24.12.2016
INSERT INTO SHOP.PROVIDERS (ID, ADRESS, NAME, CONTACT) VALUES (1, 'Россия, Московская обл. г. Королев, ул. Кожевников дом 9', 'хранилка Петровича', '+7-963-896-5412' );
INSERT INTO SHOP.PROVIDERS (ID, ADRESS, NAME, CONTACT) VALUES (2, 'Россия, Рязанская обл. г. Рязань, ул. Курако дом 96', 'Склад борохла', '+7-745-985-1236' );
INSERT INTO SHOP.PROVIDERS (ID, ADRESS, NAME, CONTACT) VALUES (3, 'Россия, Кемеровская обл. г. Новокузнецк, ул. Кутузова дом 3', 'мой Склад', '+7-745-415-9654' );