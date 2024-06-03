-- Create a new database user
CREATE USER 'library_user'@'localhost' IDENTIFIED BY 'password';

-- Grant privileges to the user
GRANT SELECT, INSERT, UPDATE ON library_database.* TO 'library_user'@'localhost';

-- Revoke certain privileges from the user
REVOKE UPDATE ON library_database.* FROM 'library_user'@'localhost';

-- Drop the user
DROP USER 'library_user'@'localhost';