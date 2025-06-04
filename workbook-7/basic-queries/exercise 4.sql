-- 1.)
-- USE northwind;
-- SELECT *
-- FROM northwind.products
-- WHERE unitPrice = (SELECT MAX(unitPrice) FROM products);

-- 2.)
USE northwind;
SELECT orderID, ShipName, ShipAddress
FROM shippers, orders
WHERE ShipperID = 3;

-- 3.)
