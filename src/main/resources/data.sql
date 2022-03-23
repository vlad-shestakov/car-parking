-- Чистим БД

delete from parkspace
  where clientid in (801, 802);

delete from BOOKINGTIME
  where clientid in (801, 802);

delete from client
  where clientid in (801, 802);


-- Заполняем данными
INSERT INTO client (clientid, licensenumber) VALUES (801, '292UM');
INSERT INTO client (clientid, licensenumber) VALUES (802, '123');

INSERT INTO parkspace (clientid, parkspacenum) VALUES (801, 1);
INSERT INTO parkspace (clientid, parkspacenum) VALUES (802, 2);


INSERT INTO BOOKINGTIME (clientid, datestart, datefinish, renttariff, rentsum, payedsum, ispaid)
  VALUES (801, null, null, 1, 0, 0, 0);

INSERT INTO BOOKINGTIME (clientid, datestart, datefinish, renttariff, rentsum, payedsum, ispaid)
VALUES (802, null, null, 1, 0, 0, 0);


-- Парковочные места / ТЕСТЫ
delete from parkspaces
 where parkspaceid in (1,2,3,4);

INSERT INTO parkspaces (parkspaceid, status) VALUES (1, 0);
INSERT INTO parkspaces (parkspaceid, status) VALUES (2, 0);
INSERT INTO parkspaces (parkspaceid, status) VALUES (3, 0);
INSERT INTO parkspaces (parkspaceid, status) VALUES (4, 1);