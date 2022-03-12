Сервис, который получает информацию по загрузке парковки.
Веб приложение, выполнено на Spring boot, с использованием библиотеки MapStruct,

**ЗАДАЧА:**

Необходимо реализовать сервис, который получает информацию по загрузке парковки. Реализовать 4 CRUD запроса: получение, создание, редактирование и удаление всех связей данных одним запросом.

**Требования:**

* Хранить 3 сущности:

	1) машина (клиент); 
	2) парковочное место; 
	3) время бронирования и цена;
* Обеспечить связи между сущностями (связь на своё усмотрение, но нужно будет обосновать)
* Хранить данные сущности в бд (выбор СУБД не принципиален)
* Обеспечить получение данных согласно тексту задачи всех связанных сущностей
* Получать данные из бд средствами JPA
* Реализовать REST API для получения данных
* Для проверки рекомендовано использовать Swagger

***Технологический стек:***
1) Клиентская часть (отсутствует) – для проверки использовать swager или постман
2) Серверная часть – Spring Boot
3) Бд – выбор не принципиален (рекомендовано H2)

***Дополнение:***
При большей погружённости рекомендовано обеспечить автоматическую накатку данных в бд пользуясь средствами Flyway


**Результат выполнения задания:**
1) Исходные коды, проект собираемый через *Maven*.
2) Скрипты для проверки *Postman* - carparking.postman_collection.json
3) База данных *H2* в памяти
4) Сущности БД: *CLIENT, PARKSPACE, BOOKINGTIME*
5) Структуры данных генерятся из объектной модели
6) Данные инициализируются из скрипта при каждом запуске \src\main\resources\data.sql
7) Доступ к сервису *clientParking* по ссылке http://localhost:8080/clientParking


**Тестирование:**
* Через сценарии Postman
* Запрос  http://localhost:8080/clientParking/detail/801