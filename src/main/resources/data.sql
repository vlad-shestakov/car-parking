INSERT INTO t_good VALUES ('111111', 'хлеб', '100', '5', 'закуски');
INSERT INTO t_order VALUES ('1', '111111', '10', '1', 'Tencent Building, Xuhui District, Shanghai', 'Cao', '13028193378');

INSERT INTO client(clientid, licensenumber) VALUES (801, '292UM');
INSERT INTO client(clientid, licensenumber) VALUES (802, '123');

INSERT INTO parkspace(clientid, parkspacenum) VALUES (801, 1);
INSERT INTO parkspace(clientid, parkspacenum) VALUES (802, 2);

-- INSERT INTO parkspace(parkspaceid, clientid) VALUES (1, 801);
-- INSERT INTO parkspace(parkspaceid, clientid) VALUES (2, 802);
