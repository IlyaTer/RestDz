INSERT INTO Books (NAME, PRICE, STORAGE, COUNT) VALUES
	('fIRST BOOK', 100.0, 'District 1', 78);
INSERT INTO Books (NAME, PRICE, STORAGE, COUNT) VALUES
	('two BOOK', 100.0, 'District 3', 11);
INSERT INTO Books (NAME, PRICE, STORAGE, COUNT) VALUES
	('three BOOK', 100.0, 'District 2', 12);
INSERT INTO Books (NAME, PRICE, STORAGE, COUNT) VALUES
	('four BOOK', 100.0, 'District 1', 50);
INSERT INTO Books (NAME, PRICE, STORAGE, COUNT) VALUES
	('five BOOK', 100.0, 'District 1', 100);


INSERT INTO Customers (SURNAME, DISTRICT, DISCOUNT) VALUES
	('Samers', 'District 1', 10.0);
INSERT INTO Customers (SURNAME, DISTRICT, DISCOUNT) VALUES
	('Clarck', 'District 1', 3.0);
INSERT INTO Customers (SURNAME, DISTRICT, DISCOUNT) VALUES
	('Wolf', 'District 1', 5.0);
INSERT INTO Customers (SURNAME, DISTRICT, DISCOUNT) VALUES
	('Alien', 'District 3', 21.0);
INSERT INTO Customers (SURNAME, DISTRICT, DISCOUNT) VALUES
	('Dou', 'District 2', 8.0);


INSERT INTO Stores (NAME, DISTRICT, COMMISSIONS) VALUES
	('Book store', 'District 1', 7.0);


INSERT INTO Purchases (PDATE, STORE, CUSTOMER, BOOK, COUNT, PRICE) VALUES
	('2015-05-15',1, 1, 1,3,70.0);
INSERT INTO Purchases (PDATE, STORE, CUSTOMER, BOOK, COUNT, PRICE) VALUES
	('2015-07-12',1, 1, 1,3,70.0);
INSERT INTO Purchases (PDATE, STORE, CUSTOMER, BOOK, COUNT, PRICE) VALUES
	('2015-06-11',1, 1, 1,3,70.0);
INSERT INTO Purchases (PDATE, STORE, CUSTOMER, BOOK, COUNT, PRICE) VALUES
	('2015-06-11',1, 1, 2,3000,70000.0);
INSERT INTO Purchases (PDATE, STORE, CUSTOMER, BOOK, COUNT, PRICE) VALUES
	('2015-06-11',1, 1, 1,700,10000.0);