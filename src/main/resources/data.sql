INSERT INTO t_good VALUES ('111111', 'хлеб', '100', '5', 'закуски');
INSERT INTO t_order VALUES ('1', '111111', '10', '1', 'Tencent Building, Xuhui District, Shanghai', 'Cao', '13028193378');

INSERT INTO client (clientid, licensenumber) VALUES (801, '292UM');
INSERT INTO client (clientid, licensenumber) VALUES (802, '123');

INSERT INTO parkspace (clientid, parkspacenum) VALUES (801, 1);
INSERT INTO parkspace (clientid, parkspacenum) VALUES (802, 2);


INSERT INTO BOOKINGTIME (clientid, datestart, datefinish, renttariff, rentsum, payedsum, ispaid)
  VALUES (801, null, null, 1, 0, 0, 0);

INSERT INTO BOOKINGTIME (clientid, datestart, datefinish, renttariff, rentsum, payedsum, ispaid)
VALUES (802, null, null, 1, 0, 0, 0);