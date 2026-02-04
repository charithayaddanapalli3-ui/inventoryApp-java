-- Create database and dedicated user for InventoryApp
CREATE DATABASE IF NOT EXISTS `inventorydb` CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- Create user (run as root)
CREATE USER IF NOT EXISTS 'inventory'@'localhost' IDENTIFIED BY 'inventory_pass';

-- Grant privileges
GRANT ALL PRIVILEGES ON `inventorydb`.* TO 'inventory'@'localhost';
FLUSH PRIVILEGES;

-- Optional: create Product table structure if you want explicit schema (Hibernate will create/update automatically)
-- CREATE TABLE inventorydb.Product (
--   id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   name VARCHAR(255),
--   price DECIMAL(10,2),
--   quantity INT
-- );
