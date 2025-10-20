-- This is a placeholder for your initial schema setup.
-- You can create your tables here.

CREATE TABLE IF NOT EXISTS items (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantity INT NOT NULL
);
