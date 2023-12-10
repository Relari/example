CREATE TABLE IF NOT EXISTS Employee (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    father_last_name TEXT,
    first_name TEXT,
    is_active INTEGER,
    mother_last_name TEXT,
    position TEXT,
    salary REAL,
    sex TEXT
);