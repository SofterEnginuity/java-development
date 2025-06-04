-- 1.)
-- SELECT COUNT(*) 
-- FROM northwind.SUPPLIERS;

-- 2.)
-- SELECT sum(salary)
-- FROM northwind.employees;

-- 3.)
-- SELECT MIN(unitPrice)
-- FROM northwind.products;

-- 4.)
-- SELECT AVG(unitPrice)
-- FROM northwind.products;

-- 5.)
-- SELECT MAX(unitPrice)
-- FROM northwind.products;

-- 6.)
SELECT SupplierID, COUNT(*) <5
FROM northwind.products
GROUP BY SupplierID;

-- 7.)
-- SELECT categoryID, AVG(unitPrice)
-- FROM northwind.products
-- GROUP BY categoryID;

-- 8.)
-- SELECT SupplierID 
-- FROM northwind.products
-- GROUP BY SupplierID
-- WHERE COUNT(*) >= 5
-- ORDER BY ;

