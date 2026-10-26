CREATE TABLE IF NOT EXISTS schools(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone VARCHAR(30),
    email VARCHAR(255),
    principal_name VARCHAR(150),
    established_year INTEGER,

    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT chk_school_established_year
    CHECK (established_year IS NULL OR established_year BETWEEN  1800 AND 2100)

);