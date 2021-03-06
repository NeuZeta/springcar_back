INSERT INTO SECUENCIAS VALUES
('CLIENT_SEQ',1000),
('OFFICE_SEQ', 1000),
('RESERVATION_SEQ', 1000),
('EXTRA_SEQ', 1000);

INSERT INTO CATEGORIES VALUES
(1,'Economic',70,150,75),
(2,'Standard',85,200,175),
(3,'Top',125,450,380);


INSERT INTO CLIENTS VALUES
(10,'Neus','Rodríguez','47646238J','Roger de Llúria, 23','08923','Santa Coloma de Gramanet', 'Spain','677313640','neuzeta@gmail.com','NeuZeta', 'neuzeta'),
(20,'Florentino','Lopez','53645521N','Roger de Llúria, 23','08923','Santa Coloma de Gramanet', 'Spain','669854571','florentino.lopez@gmail.com','Flonchi77', 'flonchi77'),
(30,'Magda','Baró','53698785F','Cervantes, 126','08943','Terrassa', 'Spain','660454321','mbaro@gmail.com','Magdala', 'magdala'),
(40,'Marina','Tudó','48562355Z','Era, 16','08245','Terrassa', 'Spain','630454778','marina.tudo@gmail.com','Marinaina83', 'marinaina83');

INSERT INTO OFFICES VALUES
(10, 'Barcerelona - Eixample', 'Carrer d Aragó, 54','08015','Barcelona', 'Spain','932211111','SP.bcn.eixample@sixt.com'),
(20, 'Barcelona - Rambla de Catalunya', 'Rambla de Catalunya, 74','08007','Barcelona', 'Spain','932211112','SP.bcn.rblacatalunya@sixt.com'),
(30, 'Barcelona - Paral.lel / Port', 'Carrer Palaudàries 5-7','08004','Barcelona', 'Spain','932211113','SP.bcn.parallel@sixt.com'),
(40, 'Barcelona - Airport', 'Terminal 1 & 2 Llegadas','08820','El Prat de Llobregat', 'Spain','932211114','SP.bcn.airport@sixt.com');

INSERT INTO CARS VALUES
(10,'Audi A5 Cabrio',10,3,'MANUAL',TRUE,4,3,2,'car10',135.80),
(11,'Audi A5 Cabrio',20,3,'MANUAL',TRUE,4,3,2,'car10',135.80),
(12,'Audi A5 Cabrio',30,3,'MANUAL',TRUE,4,3,2,'car10',135.80),
(13,'Audi A5 Cabrio',40,3,'MANUAL',TRUE,4,3,2,'car10',135.80),
(14,'Audi A6 Avant',10,3,'AUTO',TRUE,5,5,2,'car11',145.99),
(15,'Audi A6 Avant',20,3,'AUTO',TRUE,5,5,2,'car11',145.99),
(16,'Audi TT',20,3,'MANUAL',TRUE,5,4,3,'car12',146.60),
(17,'Audi TT',30,3,'MANUAL',TRUE,5,4,3,'car12',146.60),
(18,'Audi TT',40,3,'MANUAL',TRUE,5,4,3,'car12',146.60),
(19,'BMW Serie 2 Active Tourer',20,3,'AUTO',TRUE,5,5,2,'car13',146.60),
(20,'BMW Serie 3 SW',20,3,'MANUAL',TRUE,5,5,2,'car14',179.99),
(21,'Citroën C4 Cactus',10,2,'AUTO',TRUE,5,5,1,'car15',70.60),
(22,'Citroën C4 Cactus',20,2,'AUTO',TRUE,5,5,1,'car15',70.60),
(23,'Citroën C4 Cactus',30,2,'AUTO',TRUE,5,5,1,'car15',70.60),
(24,'Citroën C4 Cactus',40,2,'AUTO',TRUE,5,5,1,'car15',70.60),
(25,'Fiat 500 Convertible',10,3,'MANUAL',TRUE,2,4,1,'car16',80.99),
(26,'Fiat 500 Convertible',20,3,'MANUAL',TRUE,2,4,1,'car16',80.99),
(27,'Fiat 500 Convertible',30,3,'MANUAL',TRUE,2,4,1,'car16',80.99),
(28,'Fiat 500 Convertible',40,3,'MANUAL',TRUE,2,4,1,'car16',80.99),
(29,'BMW Serie 5',10,3,'MANUAL',TRUE,5,5,2,'car17',146.99),
(30,'Ford Ka',10,1,'MANUAL',TRUE,4,3,2,'car18',35.20),
(31,'Ford Ka',20,1,'MANUAL',TRUE,4,3,2,'car18',35.20),
(32,'Ford Ka',30,1,'MANUAL',TRUE,4,3,2,'car18',35.20),
(33,'Ford Ka',40,1,'MANUAL',TRUE,4,3,2,'car18',35.20),
(34,'Jaguar F-Type Coupé',20,3,'AUTO',TRUE,2,3,0,'car19',167.99),
(35,'Jeep Wrangler Cabrio',20,2,'AUTO',TRUE,4,3,1,'car20', 167.15),
(36,'BMW X1',20,3,'AUTO',TRUE,5,5,1,'car21',135.80),
(37,'BMW 550d M Package',10,3,'AUTO',TRUE,5,5,2,'car22',179.99),
(38,'BMW M850i Coupé',10,3,'AUTO',TRUE,4,2,1,'car23',189.99),
(39,'BMW M850i Cabrio',10,3,'MANUAL',TRUE,2,2,0,'car24',189.99),
(40,'Opel Corsa',10,1,'MANUAL',TRUE,5,5,1,'car25',26.77),
(41,'Opel Corsa',20,1,'MANUAL',TRUE,5,5,1,'car25',26.77),
(42,'Opel Corsa',30,1,'MANUAL',TRUE,5,5,1,'car25',26.77),
(43,'Opel Corsa',40,1,'MANUAL',TRUE,5,5,1,'car25',26.77),
(44, 'Peugeot 308',10,1,'MANUAL',TRUE,5,5,1,'car26',34.35),
(45, 'Peugeot 308',20,1,'MANUAL',TRUE,5,5,1,'car26',34.35),
(46, 'Peugeot 308',30,1,'MANUAL',TRUE,5,5,1,'car26',34.35),
(47, 'Peugeot 308',40,1,'MANUAL',TRUE,5,5,1,'car26',34.35),
(48, 'Smart Fortwo',10,1,'AUTO',TRUE,2,3,0,'car27', 39.99),
(49, 'Smart Fortwo',20,1,'AUTO',TRUE,2,3,0,'car27', 39.99),
(50, 'Smart Fortwo',30,1,'AUTO',TRUE,2,3,0,'car27', 39.99),
(51, 'Smart Fortwo',40,1,'AUTO',TRUE,2,3,0,'car27', 39.99),
(52, 'Smart Forfour',10,1,'MANUAL', TRUE,4,4,1,'car28', 45.40),
(53, 'Smart Forfour',20,1,'MANUAL', TRUE,4,4,1,'car28', 45.40),
(54, 'Smart Forfour',30,1,'MANUAL', TRUE,4,4,1,'car28', 45.40),
(55, 'Smart Forfour',40,1,'MANUAL', TRUE,4,4,1,'car28', 45.40),
(56, 'Toyota Yaris Hybrid',10,2,'AUTO',TRUE,4,5,1,'car29', 55.60),
(57, 'Toyota Yaris Hybrid',20,2,'AUTO',TRUE,4,5,1,'car29', 55.60),
(58, 'Mercedes-Benz Clase C',10,3,'MANUAL',TRUE,5,5,2,'car30',189.99);


INSERT INTO RESERVATIONS VALUES
(1,'2019-01-20 10:50:00','2019-10-25 00:00:00','2019-10-26 00:00:00',10,10,'BASE',TRUE,666),
(2,'2019-01-20 10:50:00','2019-10-26 00:00:00','2019-10-28 00:00:00',20,20,'BASE',TRUE,666),
(3,'2019-01-20 10:50:00','2019-10-27 00:00:00','2019-10-28 00:00:00',21,10,'BASE',TRUE,666),
(4,'2019-01-20 10:50:00','2019-10-28 00:00:00','2019-10-30 00:00:00',22,30,'TOP',TRUE,666),
(5,'2019-01-20 10:50:00','2019-10-29 00:00:00','2019-10-30 00:00:00',10,40,'BASE',FALSE,666);

INSERT INTO EXTRAS VALUES
(1, 'Baby seat (0 - 13kg)', 11.99),
(2, 'Child seat (9 - 36kg)', 11.99),
(3, 'Booster seat (15 - 36kg)', 9.99),
(4, 'Snow chains', 18.33),
(5, 'Ski & Snowboard rack', 18.33);

INSERT INTO RESERVATIONS_EXTRAS VALUES
(2,1),
(2,3),
(3,1),
(5,4),
(5,5);

