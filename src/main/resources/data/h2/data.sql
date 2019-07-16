INSERT INTO SECUENCIAS VALUES

('CLIENT_SEQ',1000),
('OFFICE_SEQ', 1000),
('RESERVATION_SEQ', 1000),
('EXTRA_SEQ', 1000);


INSERT INTO CLIENTS VALUES

(10,'Cliente 1','Apellidos 1','99999999W','Calle 1','Zip code 1','City 1', 'Country 1','932211111','email1@email1.com','username 2', 'password 1'),
(20,'Cliente 2','Apellidos 2','99999999X','Calle 2','Zip code 2','City 2', 'Country 2','932211112','email2@email2.com','username 2', 'password 2'),
(30,'Cliente 3','Apellidos 3','99999999Y','Calle 3','Zip code 3','City 3', 'Country 3','932211113','email3@email3.com','username 3', 'password 3'),
(40,'Cliente 4','Apellidos 4','99999999Z','Calle 4','Zip code 4','City 4', 'Country 4','932211114','email4@email4.com','username 4', 'password 4');

INSERT INTO OFFICES VALUES

(10, 'Oficina 1', 'Calle 1','Zip code 1','City 1', 'Country 1','932211111','email1@email1.com'),
(20, 'Oficina 2', 'Calle 2','Zip code 2','City 2', 'Country 2','932211112','email2@email2.com');


INSERT INTO RESERVATIONS VALUES

(1,'2019-01-20 10:50:00','2019-10-30 09:00:00','2019-10-30 21:00:00',10,'BASE',TRUE),
(2,'2019-01-20 10:50:00','2019-10-30 10:00:00','2019-10-30 16:00:00',20,'BASE',TRUE),
(3,'2019-01-20 10:50:00','2019-11-01 09:00:00','2019-11-02 21:00:00',10,'BASE',TRUE),
(4,'2019-01-20 10:50:00','2019-11-02 15:00:00','2019-11-02 23:30:00',30,'TOP',TRUE),
(5,'2019-01-20 10:50:00','2019-11-03 08:39:00','2019-11-03 17:30:00',40,'BASE',FALSE);

INSERT INTO EXTRAS VALUES

(1, 'Baby seat (0 - 13kg)', 11.99),
(2, 'Child seat (9 - 36kg)', 11.99),
(3, 'Booster seat (15 - 36kg)', 9.99),
(4, 'Snow chains', 18.33),
(5, 'Ski & Snowboard rack', 18.33);
