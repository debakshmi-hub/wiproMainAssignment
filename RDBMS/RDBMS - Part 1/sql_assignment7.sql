-- Insert a new author
INSERT INTO authors (author_name) VALUES ('Arundhati Roy');

-- Insert a new book
INSERT INTO books (title, author_id, genre, published_year, available_copies)
VALUES ('The God of Small Things', 1, 'Literary Fiction', 1997, 8);

-- Insert multiple books using a single INSERT statement
INSERT INTO books (title, author_id, genre, published_year, available_copies)
VALUES 
    ('The White Tiger', 1, 'Satire', 2008, 6),
    ('The Ministry of Utmost Happiness', 1, 'Political Fiction', 2017, 4);
    
-- Update the genre of a book
UPDATE books
SET genre = 'Political Satire'
WHERE author_id = 1;

DELETE FROM books
WHERE author_id = 1;

-- Delete an author and all their associated books
DELETE FROM authors
WHERE author_name = 'Arundhati Roy';

-- bulk entry
LOAD DATA INFILE 'C:\Users\debakshmi\OneDrive\Documents\data.csv'
INTO TABLE books
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

