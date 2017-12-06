USE gpn;

-- Inserting pre-defined statuses into GPN_STATUS table
INSERT INTO gpn_status VALUES(1001,'Active');
INSERT INTO gpn_status VALUES(1002,'Inactive');
INSERT INTO gpn_status VALUES(1003,'In Progress');
INSERT INTO gpn_status VALUES(1004,'Completed');
INSERT INTO gpn_status VALUES(1005,'Pending');
INSERT INTO gpn_status VALUES(1006,'Cancel');
INSERT INTO gpn_status VALUES(1007,'Scheduled');

-- Inserting pre-defined roles into GPN_ROLE table
INSERT INTO gpn_role VALUES(1001,'Super Admin');
INSERT INTO gpn_role VALUES(1002,'Administrator');
INSERT INTO gpn_role VALUES(1003,'User');

-- Inserting sample executive member details.
INSERT INTO gpn_exec_committee VALUES(1001, 'Raghava Rao', 'Precident', STR_TO_DATE('25-11-2017', '%d-%m-%Y'), null, 'ACTIVE');
INSERT INTO gpn_exec_committee VALUES(1002, 'Suresh Addanki', 'Vice Precident', STR_TO_DATE('25-11-2017', '%d-%m-%Y'), null, 'ACTIVE');

-- Inserting pre-defined sides A and B into GPN_SIDE table
INSERT INTO gpn_side VALUES(1001, 'A');
INSERT INTO gpn_side VALUES(1002, 'B');

-- Inserting pre-defined roads into GPN_ROAD table
INSERT INTO gpn_road VALUES(1001, '1', 1001);
INSERT INTO gpn_road VALUES(1002, '2', 1001);
INSERT INTO gpn_road VALUES(1003, '3', 1001);
INSERT INTO gpn_road VALUES(1004, '4', 1001);
INSERT INTO gpn_road VALUES(1005, '5', 1001);
INSERT INTO gpn_road VALUES(1006, '6', 1001);
INSERT INTO gpn_road VALUES(1007, '7', 1001);
INSERT INTO gpn_road VALUES(1008, '8', 1001);
INSERT INTO gpn_road VALUES(1009, '9', 1001);
INSERT INTO gpn_road VALUES(1010, '10', 1001);
INSERT INTO gpn_road VALUES(1011, '11', 1001);
INSERT INTO gpn_road VALUES(1012, '12', 1001);
INSERT INTO gpn_road VALUES(1013, '13', 1001);
INSERT INTO gpn_road VALUES(1014, '14', 1001);
INSERT INTO gpn_road VALUES(1015, '15', 1001);
INSERT INTO gpn_road VALUES(1016, '16', 1001);
INSERT INTO gpn_road VALUES(1017, '17', 1001);

INSERT INTO gpn_road VALUES(1020, '1', 1002);
INSERT INTO gpn_road VALUES(1021, '2', 1002);
INSERT INTO gpn_road VALUES(1022, '3', 1002);
INSERT INTO gpn_road VALUES(1023, '4', 1002);
INSERT INTO gpn_road VALUES(1024, '5', 1002);
INSERT INTO gpn_road VALUES(1025, '6', 1002);
INSERT INTO gpn_road VALUES(1026, '7', 1002);
INSERT INTO gpn_road VALUES(1027, '8', 1002);
INSERT INTO gpn_road VALUES(1028, '9', 1002);
INSERT INTO gpn_road VALUES(1029, '10', 1002);
INSERT INTO gpn_road VALUES(1030, '11', 1002);
INSERT INTO gpn_road VALUES(1031, '12', 1002);
INSERT INTO gpn_road VALUES(1032, '13', 1002);
INSERT INTO gpn_road VALUES(1033, '14', 1002);
INSERT INTO gpn_road VALUES(1034, '15', 1002);
INSERT INTO gpn_road VALUES(1035, '16', 1002);
INSERT INTO gpn_road VALUES(1036, '17', 1002);